package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.servicio.ahorroprevio.ServicioAplicacionGuardarAhorroPrevio;
import com.uco.myproject.aplicacion.servicio.ahorroprevio.ServicioAplicacionListarAhorroPrevio;
import com.uco.myproject.dominio.modelo.AhorroPrevio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ahorrosprevios")
public class ControladorAhorroPrevio {

    private final ServicioAplicacionGuardarAhorroPrevio servicioGuardarAhorroPrevio;
    private final ServicioAplicacionListarAhorroPrevio servicioListarAhorroPrevio;

    public ControladorAhorroPrevio(ServicioAplicacionGuardarAhorroPrevio servicioGuardarAhorroPrevio, ServicioAplicacionListarAhorroPrevio servicioListarAhorroPrevio) {
        this.servicioGuardarAhorroPrevio = servicioGuardarAhorroPrevio;
        this.servicioListarAhorroPrevio = servicioListarAhorroPrevio;
    }

    /*@PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoAhorroPrevio dto) {
        return this.servicioGuardarAhorroPrevio.ejecutar(dto);
    }*/

    @GetMapping
    public List<AhorroPrevio> listar(){
        return servicioListarAhorroPrevio.ejecutar();
    }
}
