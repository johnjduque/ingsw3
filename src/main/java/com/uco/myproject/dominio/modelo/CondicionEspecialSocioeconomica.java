package com.uco.myproject.dominio.modelo;

public record CondicionEspecialSocioeconomica(String codigo, String nombre) {

    public static CondicionEspecialSocioeconomica of(String codigo, String nombre) {
        validarObligatorio(codigo, "El código no puede ser vacío");
        validarObligatorio(nombre, "El nombre no puede ser vacío");

        return new CondicionEspecialSocioeconomica(codigo, nombre);
    }

    private static void validarObligatorio(String valor, String mensaje) {
        if (valor == null || valor.isBlank()) {
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
