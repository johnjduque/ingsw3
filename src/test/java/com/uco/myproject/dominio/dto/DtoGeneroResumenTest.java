package com.uco.myproject.dominio.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoGeneroResumenTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "femenino";

        //act
        DtoGeneroResumen genero = new DtoGeneroResumen(codigo, nombre);

        //assert
        Assertions.assertEquals("1",genero.getCodigo());
        Assertions.assertEquals("femenino",genero.getNombre());
    }
}