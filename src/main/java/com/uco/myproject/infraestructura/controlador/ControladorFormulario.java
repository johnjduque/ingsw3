package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.dto.DtoFormulario;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.aplicacion.servicio.formulario.ServicioAplicacionGuardarFormulario;
import com.uco.myproject.aplicacion.servicio.formulario.ServicioAplicacionListarFormularios;
import com.uco.myproject.dominio.modelo.Formulario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formularios")
public class ControladorFormulario {

    private final ServicioAplicacionListarFormularios servicioListarFormulario;
    private final ServicioAplicacionGuardarFormulario servicioGuardarFormulario;

    public ControladorFormulario(ServicioAplicacionListarFormularios servicioListarFormulario, ServicioAplicacionGuardarFormulario servicioGuardarFormulario) {
        this.servicioListarFormulario = servicioListarFormulario;
        this.servicioGuardarFormulario = servicioGuardarFormulario;
    }

    @GetMapping
    public List<Formulario> listar() {

        return this.servicioListarFormulario.ejecutar();
    }

    @PostMapping
    public ResponseEntity<DtoFormulario> guardar(@RequestBody DtoFormulario dtoFormulario){

        ResponseEntity<DtoFormulario> responseEntity;
        servicioGuardarFormulario.guardar(dtoFormulario);
        responseEntity = new ResponseEntity<>(HttpStatus.ACCEPTED);

        return responseEntity;
    }
}
