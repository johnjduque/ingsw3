package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.dto.DtoPersona;
import com.uco.myproject.aplicacion.dto.respuesta.DtoRespuesta;
import com.uco.myproject.aplicacion.servicio.ServicioAplicacionActualizarPersona;
import com.uco.myproject.aplicacion.servicio.ServicioAplicacionBorrarPersona;
import com.uco.myproject.aplicacion.servicio.ServicioAplicacionGuardarPersona;
import com.uco.myproject.aplicacion.servicio.ServicioAplicacionListarPersonas;
import com.uco.myproject.dominio.dto.DtoPersonaResumen;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class ControladorPersona {

    private final ServicioAplicacionGuardarPersona servicioAplicacionGuardarPersona;
    private final ServicioAplicacionListarPersonas servicioAplicacionListarPersonas;
    private final ServicioAplicacionBorrarPersona servicioAplicacionBorrarPersona;
    private final ServicioAplicacionActualizarPersona servicioAplicacionActualizarPersona;

    public ControladorPersona(ServicioAplicacionGuardarPersona servicioAplicacionGuardarPersona, ServicioAplicacionListarPersonas servicioAplicacionListarPersonas, ServicioAplicacionBorrarPersona servicioAplicacionBorrarPersona, ServicioAplicacionActualizarPersona servicioAplicacionActualizarPersona) {
        this.servicioAplicacionGuardarPersona = servicioAplicacionGuardarPersona;
        this.servicioAplicacionListarPersonas = servicioAplicacionListarPersonas;
        this.servicioAplicacionBorrarPersona = servicioAplicacionBorrarPersona;
        this.servicioAplicacionActualizarPersona = servicioAplicacionActualizarPersona;
    }

    @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoPersona dtoPersona){
        return this.servicioAplicacionGuardarPersona.guardar(dtoPersona);
    }

    @GetMapping
    public List<DtoPersonaResumen> listar(){
        return servicioAplicacionListarPersonas.listar();
    }

    @DeleteMapping(value = "/{documentoIdentidad}")
    public DtoRespuesta<Boolean> borrar(@PathVariable String documentoIdentidad){
        return this.servicioAplicacionBorrarPersona.borrar(documentoIdentidad);
    }

    @PutMapping(value = "/{documentoIdentidad}")
    public DtoRespuesta<Boolean> actualizar(@PathVariable String documentoIdentidad, @RequestBody DtoPersona dtoPersona){
        return this.servicioAplicacionActualizarPersona.actualizar(documentoIdentidad, dtoPersona);
    }
}
