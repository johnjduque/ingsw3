package com.uco.myproject.dominio.modelo;

public record AvisoPrivacidad(String codigo, String descripcionAvisoPrivacidad) {

    public static AvisoPrivacidad of(String codigo, String descripcionAvisoPrivacidad) {
        validarObligatorioTexto(codigo, "El código no puede ser vacío");
        validarObligatorioTexto(descripcionAvisoPrivacidad, "La descripción no puede ser vacío");

        return new AvisoPrivacidad(codigo, descripcionAvisoPrivacidad);
    }

    private static void validarObligatorioTexto(String valor, String mensaje) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcionAvisoPrivacidad() {
        return descripcionAvisoPrivacidad;
    }
}
