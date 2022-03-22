package com.uco.myproject.aplicacion.dto;

public class DtoTipoDeDocumento {

    private String codigo;
    private String nombre;

    public DtoTipoDeDocumento(String  codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}
