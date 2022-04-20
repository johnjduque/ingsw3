package com.uco.myproject.dominio.validarobligatorio;

public class ValidarObjeto {

    public ValidarObjeto() {
    }

    public static void validarObjeto(Object objeto, String mensaje){
        if(objeto == null || objeto.equals("")){
            throw new IllegalArgumentException(mensaje);
        }
    }
}
