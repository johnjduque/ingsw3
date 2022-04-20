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
        if (texto == null){
            return true;
        }
        return false;
    }

    private static boolean textoEsEspacios(String texto){
        if(texto.isBlank()){
            return true;
        }
        return false;
    }
}
