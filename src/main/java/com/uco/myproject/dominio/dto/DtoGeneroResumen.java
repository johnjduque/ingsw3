package com.uco.myproject.dominio.dto;

public class DtoGeneroResumen {

    private String codigo;
    private String nombre;

    public DtoGeneroResumen() {
    }

    public DtoGeneroResumen(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
