package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TipoDeDocumentoTest {

    @Test
    void validarCreacionExitosa() {
        //arrange
        String codigo = "1";
        String nombre = "cédula de ciudadanía";

        //act
        TipoDeDocumento tipoDeDocumento = TipoDeDocumento.of(codigo, nombre);

        //assert
        Assertions.assertEquals("1",tipoDeDocumento.getCodigo());
        Assertions.assertEquals("cédula de ciudadanía",tipoDeDocumento.getNombre());

    }

    @Test
    void validarCamposVacios(){
        //arrange
        String codigo = "";
        String nombre = "cédula de ciudadanía";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",Assertions.assertThrows(IllegalArgumentException.class, () ->
                TipoDeDocumento.of(codigo, nombre)).getMessage());
    }

    @Test
    void validarCamposFaltantes(){
        //arrange
        String codigo = null;
        String nombre = "cédula de ciudadanía";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",Assertions.assertThrows(IllegalArgumentException.class, () ->
                TipoDeDocumento.of(codigo, nombre)).getMessage());
    }
}