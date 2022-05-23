package com.uco.myproject.dominio.validarobligatorio;

import java.util.List;

public class ValidarArgumento {

    private ValidarArgumento() {}

    public static void validarObligatorio(String valor, String mensaje) {
        if(valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public static void validarLongitud(String valor, Long longitud, String mensaje) {
        if(valor.length() < longitud) {
            throw new IllegalArgumentException(String.format(mensaje, longitud));
        }
    }

    public static void validarNoVacia(List<? extends Object> lista, String mensaje) {
        if(lista == null  || lista.isEmpty()) {
            throw new IllegalArgumentException(mensaje);
        }
    }
}
