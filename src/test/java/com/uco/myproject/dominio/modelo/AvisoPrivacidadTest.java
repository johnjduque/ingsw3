package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AvisoPrivacidadTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String descripcionAvisoPrivacidad = "acepto los términos y condiciones, además las políticas de tratamiento de datos personales ...";

        //act
        AvisoPrivacidad avisoPrivacidad = AvisoPrivacidad.of(codigo, descripcionAvisoPrivacidad);

        //assert
        Assertions.assertEquals("1",avisoPrivacidad.getCodigo());
        Assertions.assertEquals("acepto los términos y condiciones, además las políticas de tratamiento de datos personales ...",avisoPrivacidad.getDescripcionAvisoPrivacidad());
    }

    @Test
    void validarCamposFaltantes(){
        //arrange
        String codigo = null;
        String descripcionAvisoPrivacidad = "acepto los términos y condiciones, además las políticas de tratamiento de datos personales ...";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        AvisoPrivacidad.of(codigo, descripcionAvisoPrivacidad)
                ).getMessage());
    }

    @Test
    void validarCamposVacios(){
        //arrange
        String codigo = "";
        String descripcionAvisoPrivacidad = "acepto los términos y condiciones, además las políticas de tratamiento de datos personales ...";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        AvisoPrivacidad.of(codigo, descripcionAvisoPrivacidad)
                ).getMessage());
    }

}