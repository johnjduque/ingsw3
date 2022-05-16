package com.uco.myproject.aplicacion.servicio.persona;

import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.dominio.servicio.persona.ServicioEliminarPersona;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionEliminarPersona {

    private final ServicioEliminarPersona servicioEliminarPersona;

    public ServicioAplicacionEliminarPersona(ServicioEliminarPersona servicioEliminarPersona) {
        this.servicioEliminarPersona = servicioEliminarPersona;
    }

    public DtoRespuesta<Boolean> ejecutar(int documentoIdentidad) {
        return new DtoRespuesta<>(this.servicioEliminarPersona.ejecutar(documentoIdentidad));
    }
}
