package com.uco.myproject.infraestructura.adaptador.entidad;

public class EntidadTipoDeDocumento {

    private String codigo;
    private String nombre;

    public EntidadTipoDeDocumento() {
    }

    public EntidadTipoDeDocumento(String codigo, String nombre) {
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