package com.uco.myproject.dominio.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoTipoDeDocumentoResumenTest {

    @Test
    void validarCreacionExitosa() {
        //arrange
        String codigo = "1";
        String nombre = "cédula de ciudadanía";

        //act
        DtoTipoDeDocumentoResumen tipoDeDocumento = new DtoTipoDeDocumentoResumen(codigo, nombre);

        //assert
        Assertions.assertEquals("1",tipoDeDocumento.getCodigo());
        Assertions.assertEquals("cédula de ciudadanía",tipoDeDocumento.getNombre());

    }
}