package com.uco.myproject.dominio.modelo;

public record Juramento(String codigo, String descripcionJuramento) {

    public static Juramento of(String codigo, String descripcionJuramento) {
        validarObligatorioTexto(codigo, "El código no puede ser vacío");
        validarObligatorioTexto(descripcionJuramento, "La descripción no puede ser vacío");

        return new Juramento(codigo, descripcionJuramento);
    }

    private static void validarObligatorioTexto(String valor, String mensaje) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcionJuramento() {
        return descripcionJuramento;
    }
}
