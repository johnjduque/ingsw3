package com.uco.myproject.aplicacion.servicio;

import com.uco.myproject.aplicacion.dto.respuesta.DtoRespuesta;
import com.uco.myproject.dominio.servicio.persona.ServicioBorrarPersona;
import org.springframework.stereotype.Component;

@Component
public record ServicioAplicacionBorrarPersona(
        ServicioBorrarPersona servicioBorrarPersona) {

    public DtoRespuesta<Boolean> borrar(int documentoIdentidad) {
        return new DtoRespuesta<>(this.servicioBorrarPersona.borrar(documentoIdentidad));
    }
}
