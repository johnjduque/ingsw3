package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.dto.DtoAhorroPrevio;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.aplicacion.servicio.ahorroprevio.ServicioAplicacionActualizarAhorroPrevio;
import com.uco.myproject.aplicacion.servicio.ahorroprevio.ServicioAplicacionGuardarAhorroPrevio;
import com.uco.myproject.aplicacion.servicio.ahorroprevio.ServicioAplicacionListarAhorroPrevio;
import com.uco.myproject.dominio.modelo.AhorroPrevio;
import com.uco.myproject.infraestructura.aspecto.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ahorrosprevios")
public class ControladorAhorroPrevio {

    private final ServicioAplicacionGuardarAhorroPrevio servicioGuardarAhorroPrevio;
    private final ServicioAplicacionListarAhorroPrevio servicioListarAhorroPrevio;
    private final ServicioAplicacionActualizarAhorroPrevio servicioActualizarAhorroPrevio;

    public ControladorAhorroPrevio(ServicioAplicacionGuardarAhorroPrevio servicioGuardarAhorroPrevio, ServicioAplicacionListarAhorroPrevio servicioListarAhorroPrevio, ServicioAplicacionActualizarAhorroPrevio servicioActualizarAhorroPrevio) {
        this.servicioGuardarAhorroPrevio = servicioGuardarAhorroPrevio;
        this.servicioListarAhorroPrevio = servicioListarAhorroPrevio;
        this.servicioActualizarAhorroPrevio = servicioActualizarAhorroPrevio;
    }

    @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoAhorroPrevio dto) {
        return this.servicioGuardarAhorroPrevio.ejecutar(dto);
    }

    @GetMapping
    public List<AhorroPrevio> listar(){
        return servicioListarAhorroPrevio.ejecutar();
    }

    @PutMapping(value = "/{id}")
    @Secured(roles = {"FUNCIONARIO_PUBLICO"})
    public DtoRespuesta<Boolean> actualizar(@PathVariable Long id, @RequestBody DtoAhorroPrevio dtoAhorroPrevio){
        return this.servicioActualizarAhorroPrevio.ejecutar(id,dtoAhorroPrevio);
    }
}
