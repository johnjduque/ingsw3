package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.dto.DtoPersona;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.aplicacion.servicio.ServicioAplicacionGuardarPersona;
import com.uco.myproject.aplicacion.servicio.ServicioAplicacionListarPersonas;
import com.uco.myproject.dominio.modelo.Persona;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class ControladorPersona {

    private final ServicioAplicacionGuardarPersona servicioGuardarPersona;
    private final ServicioAplicacionListarPersonas servicioListarPersona;

    public ControladorPersona(ServicioAplicacionGuardarPersona servicioGuardarPersona, ServicioAplicacionListarPersonas servicioListarPersona) {
        this.servicioGuardarPersona = servicioGuardarPersona;
        this.servicioListarPersona = servicioListarPersona;
    }

    @GetMapping
    public List<Persona> listar(){return servicioListarPersona.ejecutar();}

    @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoPersona dto){return this.servicioGuardarPersona.ejecutar(dto);}
}
