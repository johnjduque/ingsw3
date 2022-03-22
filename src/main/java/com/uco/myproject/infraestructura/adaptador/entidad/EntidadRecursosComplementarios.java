package com.uco.myproject.infraestructura.adaptador.entidad;

public class EntidadRecursosComplementarios {

    private String codigo;
    private String nombre;
    private int ahorroPrevioCualquierModalidad;

    public EntidadRecursosComplementarios(String codigo, String nombre, int ahorroPrevioCualquierModalidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ahorroPrevioCualquierModalidad = ahorroPrevioCualquierModalidad;
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

    public int getAhorroPrevioCualquierModalidad() {
        return ahorroPrevioCualquierModalidad;
    }

    public void setAhorroPrevioCualquierModalidad(int ahorroPrevioCualquierModalidad) {
        this.ahorroPrevioCualquierModalidad = ahorroPrevioCualquierModalidad;
    }
}
