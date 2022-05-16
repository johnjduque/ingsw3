package com.uco.myproject.aplicacion.servicio.persona;

import com.uco.myproject.aplicacion.dto.DtoPersona;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.dominio.modelo.Persona;
import com.uco.myproject.dominio.servicio.persona.ServicioActualizarPersona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ServicioAplicacionActualizarPersona {

    private final ServicioActualizarPersona servicioActualizarPersona;

    public ServicioAplicacionActualizarPersona(ServicioActualizarPersona servicioActualizarPersona) {
        this.servicioActualizarPersona = servicioActualizarPersona;
    }

    public DtoRespuesta<Boolean> ejecutar(int documentoIdentidad, DtoPersona dtoPersona){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(dtoPersona.getFechaNacimiento(), format);

        Persona persona = Persona.of(dtoPersona.getDocumentoIdentidad(),dtoPersona.getPrimerNombre(),
                dtoPersona.getSegundoNombre(),dtoPersona.getPrimerApellido(),dtoPersona.getSegundoApellido(),
               fechaNacimiento,dtoPersona.getIngresoMensual());
        return new DtoRespuesta<>(this.servicioActualizarPersona.ejecutar(documentoIdentidad,persona));
    }
}
