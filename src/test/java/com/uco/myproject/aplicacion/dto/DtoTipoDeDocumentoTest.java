package com.uco.myproject.aplicacion.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoTipoDeDocumentoTest {

    @Test
    void validarCreacionExitosa() {
        //arrange
        String codigo = "1";
        String nombre = "cédula de ciudadanía";

        //act
        DtoTipoDeDocumento tipoDeDocumento = new DtoTipoDeDocumento(codigo, nombre);

        //assert
        Assertions.assertEquals("1",tipoDeDocumento.getCodigo());
        Assertions.assertEquals("cédula de ciudadanía",tipoDeDocumento.getNombre());

    }
}