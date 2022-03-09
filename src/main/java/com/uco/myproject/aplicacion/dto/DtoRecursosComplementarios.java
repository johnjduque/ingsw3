package com.uco.myproject.aplicacion.dto;

public class DtoRecursosComplementarios {

    private String codigo;
    private String nombre;
    private int ahorroPrevioCualquierModalidad;

    public DtoRecursosComplementarios() {
    }

    public DtoRecursosComplementarios(String codigo, String nombre, int ahorroPrevioCualquierModalidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ahorroPrevioCualquierModalidad = ahorroPrevioCualquierModalidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getahorroPrevioCualquierModalidad() {
        return ahorroPrevioCualquierModalidad;
    }
}
