package com.uco.myproject.dominio.validarobligatorio;

public class ValidarCumpleONoCumple {

    public ValidarCumpleONoCumple() {
        // TODO document why this constructor is empty
    }

    public static void validarObligatorioPoseeDerechosDePropiedad(boolean condicion, String mensaje) {
        if (condicion) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public static void validarObligatorioaceptoJuramento(boolean condicion, String mensaje) {
        if (!condicion) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public static void validarObligatorioaceptoAvisoDePrivacidad(boolean condicion, String mensaje) {
        if (!condicion) {
            throw new IllegalArgumentException(mensaje);
        }
    }

}
