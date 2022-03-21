package com.uco.myproject.infraestructura.adaptador.entidad;

public class EntidadJuramento {

    private String codigo;
    private String descripcionJuramento;

    public EntidadJuramento() {
    }

    public EntidadJuramento(String codigo, String descripcionJuramento) {
        this.codigo = codigo;
        this.descripcionJuramento = descripcionJuramento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcionJuramento() {
        return descripcionJuramento;
    }

    public void setDescripcionJuramento(String descripcionJuramento) {
        this.descripcionJuramento = descripcionJuramento;
    }
}
