package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.dto.DtoFormulario;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.aplicacion.servicio.formulario.ServicioAplicacionGuardarFormulario;
import com.uco.myproject.aplicacion.servicio.formulario.ServicioAplicacionListarFormularios;
import com.uco.myproject.aplicacion.servicio.formulario.ServicioAplicacionObtenerFormularioPorCodigo;
import com.uco.myproject.dominio.modelo.Formulario;
import com.uco.myproject.infraestructura.aspecto.Secured;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formularios")
public class ControladorFormulario {

    private final ServicioAplicacionListarFormularios servicioListarFormulario;
    private final ServicioAplicacionGuardarFormulario servicioGuardarFormulario;
    private final ServicioAplicacionObtenerFormularioPorCodigo servicioObtenerFormularioPorCodigo;

    public ControladorFormulario(ServicioAplicacionListarFormularios servicioListarFormulario, ServicioAplicacionGuardarFormulario servicioGuardarFormulario, ServicioAplicacionObtenerFormularioPorCodigo servicioObtenerFormularioPorCodigo) {
        this.servicioListarFormulario = servicioListarFormulario;
        this.servicioGuardarFormulario = servicioGuardarFormulario;
        this.servicioObtenerFormularioPorCodigo = servicioObtenerFormularioPorCodigo;
    }

    @GetMapping
    @Secured(roles = {"FUNCIONARIO_PUBLICO"})
    public List<Formulario> listar() {

        return this.servicioListarFormulario.ejecutar();
    }

    @GetMapping("{id}")
    @Secured(roles = {"FUNCIONARIO_PUBLICO"})
    public ResponseEntity<Formulario> listarPorCodigo(@PathVariable("id") Long id){
        return ResponseEntity.ok(servicioObtenerFormularioPorCodigo.obtenerPorCodigo(id));
    }

    @PostMapping
    public DtoRespuesta<Long> guardar(@RequestBody DtoFormulario dtoFormulario){

        return this.servicioGuardarFormulario.guardar(dtoFormulario);
    }
}
