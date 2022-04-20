package com.uco.myproject.dominio.validarobligatorio;

public class ValidarNumero {

    public static void validarObligatorioNumero(float valor, String mensaje) {
        if (validarNumeroNulo(valor)) {
            throw new NullPointerException(mensaje);
        }
        if(validarNumeroMenorQueCero(valor)){
            throw new NumberFormatException(mensaje);
        }
    }

    private static boolean validarNumeroNulo(float valor) {
        if (esNulo(valor)) {
            return true;
        }
        return false;
    }

    private static boolean validarNumeroMenorQueCero(float valor){
        if (valor < 0){
            return true;
        }
        return false;
    }

    private static <T> boolean esNulo(T objeto){
        return objeto == null;
    }
}
