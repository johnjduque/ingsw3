package com.uco.myproject.aplicacion.dto;

public class DtoJuramento {

    private String codigo;
    private String descripcionJurmento;

    public DtoJuramento() {
    }

    public DtoJuramento(String codigo, String descripcionJurmento) {
        this.codigo = codigo;
        this.descripcionJurmento = descripcionJurmento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcionJurmento() {
        return descripcionJurmento;
    }
}
