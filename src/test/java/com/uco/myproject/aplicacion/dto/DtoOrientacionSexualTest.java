package com.uco.myproject.aplicacion.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoOrientacionSexualTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "heterosexual";

        //act
        DtoOrientacionSexual orientacionSexual = new DtoOrientacionSexual(codigo, nombre);

        //assert
        Assertions.assertEquals("1",orientacionSexual.getCodigo());
        Assertions.assertEquals("heterosexual",orientacionSexual.getNombre());
    }
}