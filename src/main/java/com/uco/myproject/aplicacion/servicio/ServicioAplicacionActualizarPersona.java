package com.uco.myproject.aplicacion.servicio;

import com.uco.myproject.aplicacion.dto.DtoPersona;
import com.uco.myproject.aplicacion.dto.respuesta.DtoRespuesta;
import com.uco.myproject.dominio.modelo.*;
import com.uco.myproject.dominio.servicio.persona.ServicioActualizarPersona;
import org.springframework.stereotype.Component;

@Component
public record ServicioAplicacionActualizarPersona(
        ServicioActualizarPersona servicioActualizarPersona) {

    public DtoRespuesta<Boolean> actualizar(int documentoIdentidad, DtoPersona dtoPersona) {
        Persona persona = Persona.of(dtoPersona.getCodigo(), dtoPersona.getDocumentoIdentidad(), dtoPersona.getPrimerNombre(), dtoPersona.getSegundoNombre(), dtoPersona.getPrimerApellido(),
                dtoPersona.getSegundoApellido(), dtoPersona.getFechaNacimiento(), dtoPersona.getIngresoMensual(), TipoDeDocumento.of(dtoPersona.getTipoDeDocumento().getCodigo(), dtoPersona.getTipoDeDocumento().getNombre()),
                Genero.of(dtoPersona.getGenero().getCodigo(), dtoPersona.getGenero().getNombre()), EstadoCivil.of(dtoPersona.getEstadoCivil().getCodigo(),
                        dtoPersona.getEstadoCivil().getNombre()), CondicionEspecialMedica.of(dtoPersona.getCondicionEspecialMedica().getCodigo(), dtoPersona.getCondicionEspecialMedica().getNombre()),
                CondicionEspecialSocioeconomica.of(dtoPersona.getCondicionEspecialSocioeconomica().getCodigo(), dtoPersona.getCondicionEspecialSocioeconomica().getNombre()),
                TipoDePostulante.of(dtoPersona.getTipoDePostulante().getCodigo(), dtoPersona.getTipoDePostulante().getNombre()),
                Ocupacion.of(dtoPersona.getOcupacion().getCodigo(), dtoPersona.getOcupacion().getNombre()),
                OrientacionSexual.of(dtoPersona.getOrientacionSexual().getCodigo(), dtoPersona.getOrientacionSexual().getNombre()),
                DatosDeContacto.of(dtoPersona.getDatosDeContacto().getCodigo(), dtoPersona.getDatosDeContacto().getNumeroFijo(), dtoPersona.getDatosDeContacto().getNumeroCelular(),
                        dtoPersona.getDatosDeContacto().getCorreoElectronico()));

        return new DtoRespuesta<>(this.servicioActualizarPersona.actualizar(documentoIdentidad, persona));
    }
}
