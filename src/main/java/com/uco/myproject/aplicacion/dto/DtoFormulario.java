package com.uco.myproject.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DtoFormulario {

    private List<DtoPersona> Personas;
    private String ClasificacionSisben;
    private boolean PoseeDerechosDePropiedad;
    private boolean AceptoJuramento;
    private boolean AceptoAvisoDePrivacidad;
    private String CorreoElectronico;
    private DtoAhorroPrevio AhorroPrevio;

    public List<DtoPersona> getPersonas() {
        return Personas;
    }

    public void setPersonas(List<DtoPersona> personas) {
        Personas = personas;
    }

    public String getClasificacionSisben() {
        return ClasificacionSisben;
    }

    public void setClasificacionSisben(String clasificacionSisben) {
        this.ClasificacionSisben = clasificacionSisben;
    }

    public boolean isPoseeDerechosDePropiedad() {
        return PoseeDerechosDePropiedad;
    }

    public void setPoseeDerechosDePropiedad(boolean poseeDerechosDePropiedad) {
        PoseeDerechosDePropiedad = poseeDerechosDePropiedad;
    }

    public boolean isAceptoJuramento() {
        return AceptoJuramento;
    }

    public void setAceptoJuramento(boolean aceptoJuramento) {
        AceptoJuramento = aceptoJuramento;
    }

    public boolean isAceptoAvisoDePrivacidad() {
        return AceptoAvisoDePrivacidad;
    }

    public void setAceptoAvisoDePrivacidad(boolean aceptoAvisoDePrivacidad) {
        AceptoAvisoDePrivacidad = aceptoAvisoDePrivacidad;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }

    public DtoAhorroPrevio getAhorroPrevio() {
        return AhorroPrevio;
    }

    public void setAhorroPrevio(DtoAhorroPrevio ahorroPrevio) {
        AhorroPrevio = ahorroPrevio;
    }
}
