package com.uco.myproject.dominio.modelo;

import java.util.List;

public class Formulario {

    private final String radicado;
    private final List<Persona> personas;
    private final int clasificacionSisben;
    private final boolean poseeDerechosDePropiedad;
    private final boolean aceptoJuramento;
    private final boolean aceptoAvisoPrivacidad;
    private final RecursosComplementarios recursosComplementarios;
    private final AhorroPrevio ahorroPrevio;


    public Formulario(String radicado, List<Persona> personas, int clasificacionSisben,
                      boolean poseeDerechosDePropiedad, boolean aceptoJuramento,
                      boolean aceptoAvisoPrivacidad, RecursosComplementarios recursosComplementarios,
                      AhorroPrevio ahorroPrevio) {
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

    public List<Persona> getPersonas() {
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

    public RecursosComplementarios getRecursosComplementarios() {
        return recursosComplementarios;
    }

    public AhorroPrevio getAhorroPrevio() {
        return ahorroPrevio;
    }
}
