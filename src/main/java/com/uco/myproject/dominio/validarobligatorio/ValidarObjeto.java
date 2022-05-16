package com.uco.myproject.dominio.validarobligatorio;

public class ValidarObjeto {

    public ValidarObjeto() {
        // TODO document why this constructor is empty
    }

    public static void validarObjeto(Object objeto, String mensaje){
        if(objeto == null || objeto.equals("")){
            throw new IllegalArgumentException(mensaje);
        }
    }
}
