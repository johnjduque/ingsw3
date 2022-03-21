package com.uco.myproject.dominio.servicio.persona;

import com.uco.myproject.dominio.dto.DtoPersonaResumen;
import com.uco.myproject.dominio.modelo.Persona;
import com.uco.myproject.dominio.puerto.*;
import jdk.jfr.Percentage;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarPersona {

    private final RepositorioPersona repositorioPersona;
    private final RepositorioTipoDeDocumento repositorioTipoDeDocumento;
    private final RepositorioGenero repositorioGenero;
    private final RepositorioEstadoCivil repositorioEstadoCivil;
    private final RepositorioCondicionEspecialMedica repositorioCondicionEspecialMedica;
    private final RepositorioCondicionEspecialSocioeconomica repositorioCondicionEspecialSocioeconomica;
    private final RepositorioTipoDePostulante repositorioTipoDePostulante;
    private final RepositorioOcupacion repositorioOcupacion;
    private final RepositorioOrientacionSexual repositorioOrientacionSexual;
    private final RepositorioDatosDeContacto repositorioDatosDeContacto;


    public ServicioGuardarPersona(RepositorioPersona repositorioPersona, RepositorioTipoDeDocumento repositorioTipoDeDocumento, RepositorioGenero repositorioGenero, RepositorioEstadoCivil repositorioEstadoCivil, RepositorioCondicionEspecialMedica repositorioCondicionEspecialMedica, RepositorioCondicionEspecialSocioeconomica repositorioCondicionEspecialSocioeconomica, RepositorioTipoDePostulante repositorioTipoDePostulante, RepositorioOcupacion repositorioOcupacion, RepositorioOrientacionSexual repositorioOrientacionSexual, RepositorioDatosDeContacto repositorioDatosDeContacto) {
        this.repositorioPersona = repositorioPersona;
        this.repositorioTipoDeDocumento = repositorioTipoDeDocumento;
        this.repositorioGenero = repositorioGenero;
        this.repositorioEstadoCivil = repositorioEstadoCivil;
        this.repositorioCondicionEspecialMedica = repositorioCondicionEspecialMedica;
        this.repositorioCondicionEspecialSocioeconomica = repositorioCondicionEspecialSocioeconomica;
        this.repositorioTipoDePostulante = repositorioTipoDePostulante;
        this.repositorioOcupacion = repositorioOcupacion;
        this.repositorioOrientacionSexual = repositorioOrientacionSexual;
        this.repositorioDatosDeContacto = repositorioDatosDeContacto;
    }

    public Long guardar(Persona persona){

        if(verificarPersonaExiste(persona)){}
        return this.repositorioPersona.guardar(persona);
    }

    private boolean verificarPersonaExiste(Persona persona){
        var personaResumen = this.repositorioPersona.consultarPorId(persona.getDocumentoIdentidad());

        if(personaResumen == null){
            throw new IllegalArgumentException("La persona con el número de identificación ingresado ya se encuentra registrado");
        }
        return true;
    }
}
