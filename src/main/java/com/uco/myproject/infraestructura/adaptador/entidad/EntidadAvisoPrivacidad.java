package com.uco.myproject.infraestructura.adaptador.entidad;

public class EntidadAvisoPrivacidad {

    private String codigo;
    private String descripcionAvisoPrivacidad;

    public EntidadAvisoPrivacidad(String codigo, String descripcionAvisoPrivacidad) {
        this.codigo = codigo;
        this.descripcionAvisoPrivacidad = descripcionAvisoPrivacidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcionAvisoPrivacidad() {
        return descripcionAvisoPrivacidad;
    }

    public void setDescripcionAvisoPrivacidad(String descripcionAvisoPrivacidad) {
        this.descripcionAvisoPrivacidad = descripcionAvisoPrivacidad;
    }
}
