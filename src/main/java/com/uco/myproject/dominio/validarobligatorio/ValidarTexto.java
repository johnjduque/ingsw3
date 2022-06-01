package com.uco.myproject.dominio.validarobligatorio;

public class ValidarTexto {

    public ValidarTexto() {
    }

    public static void validarObligatorioTexto(String texto, String mensaje) {
        if (textoEsNulo(texto) || textoEsEspacios(texto)) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    private static boolean textoEsNulo(String texto){
        return texto == null;
    }

    private static boolean textoEsEspacios(String texto){
        return texto.isBlank();
    }
}
