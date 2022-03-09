package com.uco.myproject.aplicacion.dto;

public class DtoCondicionEspecialMedica {

    private String codigo;
    private String nombre;

    public DtoCondicionEspecialMedica() {
    }

    public DtoCondicionEspecialMedica(String codigo, String nombre) {
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
