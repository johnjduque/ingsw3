package com.uco.myproject.aplicacion.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoOcupacionTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "pensionado";

        //act
        DtoOcupacion ocupacion = new DtoOcupacion(codigo, nombre);

        //assert
        Assertions.assertEquals("1",ocupacion.getCodigo());
        Assertions.assertEquals("pensionado",ocupacion.getNombre());
    }
}