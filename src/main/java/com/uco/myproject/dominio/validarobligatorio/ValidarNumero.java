package com.uco.myproject.dominio.validarobligatorio;

public class ValidarNumero {

    public ValidarNumero() {
    }

    public static void validarObligatorioNumero(float valor, String mensaje) {
        if (validarNumeroNulo(valor)) {
            throw new NullPointerException(mensaje);
        }
        if(validarNumeroMenorQueCero(valor)){
            throw new NumberFormatException(mensaje);
        }
    }

    private static boolean validarNumeroNulo(float valor) {
        return esNulo(valor);
    }

    private static boolean validarNumeroMenorQueCero(float valor){
        return valor < 0;
    }

    private static <T> boolean esNulo(T objeto){
        return objeto == null;
    }
}
