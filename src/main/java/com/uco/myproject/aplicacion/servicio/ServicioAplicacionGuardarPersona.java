package com.uco.myproject.aplicacion.servicio;

import com.uco.myproject.aplicacion.dto.DtoPersona;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.dominio.modelo.Persona;
import com.uco.myproject.dominio.servicio.ServicioGuardarPersona;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarPersona {

    private final ServicioGuardarPersona servicioGuardarPersona;

    public ServicioAplicacionGuardarPersona(ServicioGuardarPersona servicioGuardarPersona) {
        this.servicioGuardarPersona = servicioGuardarPersona;
    }

    public DtoRespuesta<Long> ejecutar(DtoPersona dto) {

        Persona persona = Persona.of(dto.getCodigo(),dto.getDocumentoIdentidad(),dto.getPrimerNombre(),dto.getSegundoNombre(),dto.getPrimerApellido(),dto.getSegundoApellido(),
                dto.getFechaNacimiento(),dto.getIngresoMensual(),dto.getTipoDeDocumento(),dto.getGenero(),dto.getEstadoCivil(),dto.getCondicionEspecialMedica(),dto.getCondicionEspecialSocioeconomica(),
                dto.getTipoDePostulante(),dto.getOcupacion(),dto.getOrientacionSexual(),dto.getDatosDeContacto());

        return new DtoRespuesta<>(this.servicioGuardarPersona.ejecutar(persona));
    }
}
