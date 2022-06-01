package com.uco.myproject.aplicacion.servicio.persona;

import com.uco.myproject.aplicacion.dto.DtoPersona;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.dominio.modelo.Persona;
import com.uco.myproject.dominio.servicio.persona.ServicioGuardarPersona;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class ServicioAplicacionGuardarPersona {

    private final ServicioGuardarPersona servicioGuardarPersona;

    public ServicioAplicacionGuardarPersona(ServicioGuardarPersona servicioGuardarPersona) {
        this.servicioGuardarPersona = servicioGuardarPersona;
    }

    public DtoRespuesta<Long> ejecutar(DtoPersona dto) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNacimiento = LocalDate.parse(dto.getFechaNacimiento(), format);
        Persona persona = Persona.of(dto.getDocumentoIdentidad(),dto.getPrimerNombre(),dto.getSegundoNombre(),dto.getPrimerApellido(),
                    dto.getSegundoApellido(),fechaNacimiento,dto.getIngresoMensual());

        return new DtoRespuesta<>((long) servicioGuardarPersona.ejecutar(persona));
    }
}
