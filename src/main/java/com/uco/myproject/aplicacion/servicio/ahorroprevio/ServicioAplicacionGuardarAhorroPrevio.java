package com.uco.myproject.aplicacion.servicio.ahorroprevio;

import com.uco.myproject.aplicacion.dto.DtoAhorroPrevio;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.dominio.modelo.AhorroPrevio;
import com.uco.myproject.dominio.servicio.ahorroprevio.ServicioGuardarAhorroPrevio;
import org.springframework.stereotype.Service;

@Service
public class ServicioAplicacionGuardarAhorroPrevio {

    private final ServicioGuardarAhorroPrevio servicioGuardarAhorroPrevio;

    public ServicioAplicacionGuardarAhorroPrevio(ServicioGuardarAhorroPrevio servicioGuardarAhorroPrevio) {
        this.servicioGuardarAhorroPrevio = servicioGuardarAhorroPrevio;
    }

    public DtoRespuesta<Long> ejecutar(DtoAhorroPrevio dto) {

        AhorroPrevio ahorroPrevio = AhorroPrevio.of(dto.getCuentaAhorroProgramado(),dto.getCesantias(),dto.getSubsidioCajaCompesacion());

        return new DtoRespuesta<>(servicioGuardarAhorroPrevio.ejecutar(ahorroPrevio));
    }
}
