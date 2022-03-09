package com.uco.myproject.aplicacion.dto;

public class DtoGenero {

    private String codigo;
    private String nombre;

    public DtoGenero() {
    }

    public DtoGenero(String codigo, String nombre) {
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
