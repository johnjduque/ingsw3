package com.uco.myproject.infraestructura.adaptador.entidad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntidadAvisoPrivacidadTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String descripcionAvisoPrivacidad = "acepto los términos y condiciones, además las políticas de tratamiento de datos personales ...";

        //act
        EntidadAvisoPrivacidad avisoPrivacidad = new EntidadAvisoPrivacidad(codigo, descripcionAvisoPrivacidad);

        //assert
        Assertions.assertEquals("1",avisoPrivacidad.getCodigo());
        Assertions.assertEquals("acepto los términos y condiciones, además las políticas de tratamiento de datos personales ...",avisoPrivacidad.getDescripcionAvisoPrivacidad());
    }
}