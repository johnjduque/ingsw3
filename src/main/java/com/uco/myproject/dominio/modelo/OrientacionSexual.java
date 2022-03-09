package com.uco.myproject.dominio.modelo;

public class OrientacionSexual {

    private final String codigo;
    private final String nombre;

    public static OrientacionSexual of(String codigo, String nombre){
        validarObligatorio(codigo, "El código no puede ser vacío");
        validarObligatorio(nombre, "El nombre no puede ser vacío");

        return new OrientacionSexual(codigo, nombre);
    }

    public OrientacionSexual(String codigo, String nombre) {
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
