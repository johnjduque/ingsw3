package com.uco.myproject.aplicacion.dto;

import com.uco.myproject.dominio.modelo.AhorroPrevio;
import com.uco.myproject.dominio.modelo.Persona;
import com.uco.myproject.dominio.modelo.RecursosComplementarios;

import java.util.ArrayList;

public class DtoFormulario {

    private String radicado;
    private ArrayList<DtoPersona> personas;
    private int ClasificacionSisben;
    private boolean poseeDerechosDePropiedad;
    private boolean aceptoJuramento;
    private boolean aceptoAvisoPrivacidad;
    private DtoRecursosComplementarios recursosComplementarios;
    private DtoAhorroPrevio ahorroPrevio;

    public DtoFormulario() {
    }

    public DtoFormulario(String radicado, ArrayList<DtoPersona> personas, int clasificacionSisben,
                         boolean poseeDerechosDePropiedad, boolean aceptoJuramento,
                         boolean aceptoAvisoPrivacidad, DtoRecursosComplementarios recursosComplementarios,
                         DtoAhorroPrevio ahorroPrevio) {
        this.radicado = radicado;
        this.personas = personas;
        ClasificacionSisben = clasificacionSisben;
        this.poseeDerechosDePropiedad = poseeDerechosDePropiedad;
        this.aceptoJuramento = aceptoJuramento;
        this.aceptoAvisoPrivacidad = aceptoAvisoPrivacidad;
        this.recursosComplementarios = recursosComplementarios;
        this.ahorroPrevio = ahorroPrevio;
    }

    public String getRadicado() {
        return radicado;
    }

    public ArrayList<DtoPersona> getPersonas() {
        return personas;
    }

    public int getClasificacionSisben() {
        return ClasificacionSisben;
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
