package com.uco.myproject.dominio.modelo;

public record Juramento(String codigo, String descripcionJurmento) {

    public static Juramento of(String codigo, String descripcionJurmento) {
        validarObligatorioTexto(codigo, "El código no puede ser vacío");
        validarObligatorioTexto(descripcionJurmento, "La descripción no puede ser vacío");

        return new Juramento(codigo, descripcionJurmento);
    }

    private static void validarObligatorioTexto(String valor, String mensaje) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcionJurmento() {
        return descripcionJurmento;
    }
}
