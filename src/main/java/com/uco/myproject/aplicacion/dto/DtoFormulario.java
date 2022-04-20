package com.uco.myproject.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class DtoFormulario {

    private List<DtoPersona> personas;
    private String clasificacionSisben;
    private boolean poseeDerechosDePropiedad;
    private boolean aceptoJuramento;
    private boolean aceptoAvisoDePrivacidad;
    private String correoElectronico;
    private DtoAhorroPrevio ahorroPrevio;

    public List<DtoPersona> getPersonas() {
        return personas;
    }

    public String getClasificacionSisben() {
        return clasificacionSisben;
    }

    public boolean isPoseeDerechosDePropiedad() {
        return poseeDerechosDePropiedad;
    }

    public boolean isAceptoJuramento() {
        return aceptoJuramento;
    }

    public boolean isAceptoAvisoDePrivacidad() {
        return aceptoAvisoDePrivacidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public DtoAhorroPrevio getAhorroPrevio() {
        return ahorroPrevio;
    }
}
