package com.uco.myproject.aplicacion.dto;

public class DtoAvisoPrivacidad {

    private String codigo;
    private String descripcionAvisoPrivacidad;

    public DtoAvisoPrivacidad(String codigo, String descripcionAvisoPrivacidad) {
        this.codigo = codigo;
        this.descripcionAvisoPrivacidad = descripcionAvisoPrivacidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcionAvisoPrivacidad() {
        return descripcionAvisoPrivacidad;
    }
}
