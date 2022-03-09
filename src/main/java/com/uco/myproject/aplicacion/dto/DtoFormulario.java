package com.uco.myproject.aplicacion.dto;

import java.util.List;

public class DtoFormulario {

    private String radicado;
    private List<DtoPersona> personas;
    private int clasificacionSisben;
    private boolean poseeDerechosDePropiedad;
    private boolean aceptoJuramento;
    private boolean aceptoAvisoPrivacidad;
    private DtoRecursosComplementarios recursosComplementarios;
    private DtoAhorroPrevio ahorroPrevio;

    public DtoFormulario() {
    }

    public DtoFormulario(String radicado, List<DtoPersona> personas, int clasificacionSisben,
                         boolean poseeDerechosDePropiedad, boolean aceptoJuramento,
                         boolean aceptoAvisoPrivacidad, DtoRecursosComplementarios recursosComplementarios,
                         DtoAhorroPrevio ahorroPrevio) {
        this.radicado = radicado;
        this.personas = personas;
        this.clasificacionSisben = clasificacionSisben;
        this.poseeDerechosDePropiedad = poseeDerechosDePropiedad;
        this.aceptoJuramento = aceptoJuramento;
        this.aceptoAvisoPrivacidad = aceptoAvisoPrivacidad;
        this.recursosComplementarios = recursosComplementarios;
        this.ahorroPrevio = ahorroPrevio;
    }

    public String getRadicado() {
        return radicado;
    }

    public List<DtoPersona> getPersonas() {
        return personas;
    }

    public int getClasificacionSisben() {
        return clasificacionSisben;
    }

    public boolean isPoseeDerechosDePropiedad() {
        return poseeDerechosDePropiedad;
    }

    public boolean isAceptoJuramento() {
        return aceptoJuramento;
    }

    public boolean isAceptoAvisoPrivacidad() {
        return aceptoAvisoPrivacidad;
    }

    public DtoRecursosComplementarios getRecursosComplementarios() {
        return recursosComplementarios;
    }

    public DtoAhorroPrevio getAhorroPrevio() {
        return ahorroPrevio;
    }
}
