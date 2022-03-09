package com.uco.myproject.aplicacion.dto;

public class DtoOrientacionSexual {

    private String codigo;
    private String nombre;

    public DtoOrientacionSexual() {
    }

    public DtoOrientacionSexual(String codigo, String nombre) {
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
