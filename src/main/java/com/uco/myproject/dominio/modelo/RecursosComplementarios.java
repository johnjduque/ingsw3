package com.uco.myproject.dominio.modelo;

public class RecursosComplementarios {

    private final String codigo;
    private final String nombre;
    private final int ahorroPrevioCualquierModalidad;

    public static RecursosComplementarios of(String codigo, String nombre, int ahorroPrevioCualquierModalidad){
        validarObligatorioTexto(codigo, "El código no puede ser vacío");
        validarObligatorioTexto(nombre, "El nombre no puede ser vacío");
        validarObligatorioNumero(ahorroPrevioCualquierModalidad, "El Ahorro previo cualquier modalidad no pueden ser vacías");

        return new RecursosComplementarios(codigo,nombre,ahorroPrevioCualquierModalidad);
    }

    public RecursosComplementarios(String codigo, String nombre, int ahorroPrevioCualquierModalidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ahorroPrevioCualquierModalidad = ahorroPrevioCualquierModalidad;
    }

    private static void validarObligatorioTexto(String valor, String mensaje){
        if(valor == null || valor.isBlank()){
            throw new IllegalArgumentException(mensaje);
        }
    }

    private static void validarObligatorioNumero(int valor, String mensaje){
        if(esNulo(valor)){
            throw new NumberFormatException(mensaje);
        }
    }

    public static <T> boolean esNulo(T objeto){return objeto == null;}

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
