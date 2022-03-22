package com.uco.myproject.dominio.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoOcupacionResumenTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "pensionado";

        //act
        DtoOcupacionResumen ocupacion = new DtoOcupacionResumen(codigo, nombre);

        //assert
        Assertions.assertEquals("1",ocupacion.getCodigo());
        Assertions.assertEquals("pensionado",ocupacion.getNombre());
    }
}