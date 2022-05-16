package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.dto.DtoPersona;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.aplicacion.servicio.persona.ServicioAplicacionActualizarPersona;
import com.uco.myproject.aplicacion.servicio.persona.ServicioAplicacionEliminarPersona;
import com.uco.myproject.aplicacion.servicio.persona.ServicioAplicacionGuardarPersona;
import com.uco.myproject.aplicacion.servicio.persona.ServicioAplicacionListarPersona;
import com.uco.myproject.dominio.modelo.Persona;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class ControladorPersona {

    private final ServicioAplicacionEliminarPersona servicioEliminarPersona;
    private final ServicioAplicacionGuardarPersona servicioGuardarPersona;
    private final ServicioAplicacionListarPersona servicioListarPersona;
    private final ServicioAplicacionActualizarPersona servicioActualizarPersona;

    public ControladorPersona(ServicioAplicacionEliminarPersona servicioEliminarPersona, ServicioAplicacionGuardarPersona servicioGuardarPersona, ServicioAplicacionListarPersona servicioListarPersona, ServicioAplicacionActualizarPersona servicioActualizarPersona) {
        this.servicioEliminarPersona = servicioEliminarPersona;
        this.servicioGuardarPersona = servicioGuardarPersona;
        this.servicioListarPersona = servicioListarPersona;
        this.servicioActualizarPersona = servicioActualizarPersona;
    }

    @DeleteMapping(value = "/{documentoIdentidad}")
    public DtoRespuesta<Boolean> eliminar(@PathVariable int documentoIdentidad) {
        return this.servicioEliminarPersona.ejecutar(documentoIdentidad);
    }
    @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoPersona dto) {

        return this.servicioGuardarPersona.ejecutar(dto);
    }

    @GetMapping
    public List<Persona> listar(){
        return this.servicioListarPersona.ejecutar();
    }

    @PutMapping(value = "/{documentoIdentidad}")
    public DtoRespuesta<Boolean> actualizar(@PathVariable int documentoIdentidad,@RequestBody DtoPersona dtoPersona){
        return  this.servicioActualizarPersona.ejecutar(documentoIdentidad,dtoPersona);
    }
}
