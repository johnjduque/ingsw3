package com.uco.myproject.dominio.validarobligatorio;

public class ValidarEmail {

    private static final String PATRON_EMAIL = "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$";

    public ValidarEmail() {
    }

    public static void validarObligatorioEmail (String email, String mensaje){
        if (!aceptacionEmail(email,PATRON_EMAIL)){
            throw new IllegalArgumentException(mensaje);
        }
    }

    private static boolean aceptacionEmail(String email, String PATRON_EMAIL){
        return email.matches(PATRON_EMAIL);
    }
}
