package com.uco.myproject.aplicacion.servicio;

import com.uco.myproject.dominio.dto.*;
import com.uco.myproject.dominio.servicio.persona.ServicioListarPersonas;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record ServicioAplicacionListarPersonas(
        ServicioListarPersonas servicioListarPersonas) {

    public List<DtoPersonaResumen> listar() {
        return this.servicioListarPersonas.listar().stream().map(persona -> new DtoPersonaResumen(
                persona.getCodigo(), persona.getDocumentoIdentidad(), persona.getPrimerNombre(), persona.getSegundoNombre(), persona.getPrimerApellido(),
                persona.getSegundoApellido(), persona.getFechaNacimiento(), persona.getIngresoMensual(), new DtoTipoDeDocumentoResumen(persona.getTipoDeDocumento().getCodigo(), persona.getTipoDeDocumento().getNombre()),
                new DtoGeneroResumen(persona.getGenero().getCodigo(), persona.getGenero().getNombre()), new DtoEstadoCivilResumen(persona.getEstadoCivil().getCodigo(), persona.getEstadoCivil().getNombre()),
                new DtoCondicionEspecialMedicaResumen(persona.getCondicionEspecialMedica().getCodigo(), persona.getCondicionEspecialMedica().getNombre()),
                new DtoCondicionEspecialSocioeconomicaResumen(persona.getCondicionEspecialSocioeconomica().getCodigo(), persona.getCondicionEspecialSocioeconomica().getNombre()),
                new DtoTipoDePostulanteResumen(persona.getTipoDePostulante().getCodigo(), persona.getTipoDePostulante().getNombre()),
                new DtoOcupacionResumen(persona.getOcupacion().getCodigo(), persona.getOcupacion().getNombre()),
                new DtoOrientacionSexualResumen(persona.getOrientacionSexual().getCodigo(), persona.getOrientacionSexual().getNombre()),
                new DtoDatosDeContactoResumen(persona.getDatosDeContacto().getCodigo(), persona.getDatosDeContacto().getNumeroFijo(), persona.getDatosDeContacto().getNumeroCelular(), persona.getDatosDeContacto().getCorreoElectronico()))).toList();
    }
}
