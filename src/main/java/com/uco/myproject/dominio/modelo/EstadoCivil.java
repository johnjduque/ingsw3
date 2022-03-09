package com.uco.myproject.dominio.modelo;

public class EstadoCivil {

    private final String codigo;
    private final String nombre;

    public static EstadoCivil of(String codigo, String nombre){
        validarObligatorio(codigo, "El código no puede ser vacío");
        validarObligatorio(nombre, "El nombre no puede ser vacío");

        return new EstadoCivil(codigo, nombre);
    }

    public EstadoCivil(String codigo, String nombre) {
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
