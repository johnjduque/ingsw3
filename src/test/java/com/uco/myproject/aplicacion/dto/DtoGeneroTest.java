package com.uco.myproject.aplicacion.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoGeneroTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "femenino";

        //act
        DtoGenero genero = new DtoGenero(codigo, nombre);

        //assert
        Assertions.assertEquals("1",genero.getCodigo());
        Assertions.assertEquals("femenino",genero.getNombre());
    }
}