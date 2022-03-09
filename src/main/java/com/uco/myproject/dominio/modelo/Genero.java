package com.uco.myproject.dominio.modelo;

public class Genero {

    private final String codigo;
    private final String nombre;

    public static Genero of(String codigo, String nombre){
        validarObligatorio(codigo, "El codigo no puede ser vacio");
        validarObligatorio(nombre, "El nombre no puede ser vacío");

        return new Genero(codigo, nombre);
    }

    public Genero(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    private static void validarObligatorio(String valor, String mensaje){
        if(valor == null || valor.isBlank()){
            throw new IllegalArgumentException(mensaje);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}
