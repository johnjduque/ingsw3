package com.uco.myproject.aplicacion.servicio.ahorroprevio;

import com.uco.myproject.aplicacion.dto.DtoAhorroPrevio;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.dominio.modelo.AhorroPrevio;
import com.uco.myproject.dominio.servicio.ahorroprevio.ServicioActualizarAhorroPrevio;
import org.springframework.stereotype.Component;

@Component
public record ServicioAplicacionActualizarAhorroPrevio(
        ServicioActualizarAhorroPrevio servicioActualizarAhorroPrevio) {

    public DtoRespuesta<Boolean> ejecutar(Long id, DtoAhorroPrevio dtoAhorroPrevio) {
        AhorroPrevio ahorroPrevio = AhorroPrevio.of(dtoAhorroPrevio.getDocumentoIdentidadJefeHogar(), dtoAhorroPrevio.getCuentaAhorroProgramado(),
                dtoAhorroPrevio.getCesantias(), dtoAhorroPrevio.getSubsidioCajaCompesacion());
        return new DtoRespuesta<>(this.servicioActualizarAhorroPrevio.ejecutar(id, ahorroPrevio));
    }
}
