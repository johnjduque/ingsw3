package com.uco.myproject.dominio.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoOrientacionSexualResumenTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "heterosexual";

        //act
        DtoOrientacionSexualResumen orientacionSexual = new DtoOrientacionSexualResumen(codigo, nombre);

        //assert
        Assertions.assertEquals("1",orientacionSexual.getCodigo());
        Assertions.assertEquals("heterosexual",orientacionSexual.getNombre());
    }
}