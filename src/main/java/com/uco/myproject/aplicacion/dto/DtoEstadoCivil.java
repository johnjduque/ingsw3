package com.uco.myproject.aplicacion.dto;

public class DtoEstadoCivil {

    private String codigo;
    private String nombre;

    public DtoEstadoCivil() {
    }

    public DtoEstadoCivil(String codigo, String nombre) {
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