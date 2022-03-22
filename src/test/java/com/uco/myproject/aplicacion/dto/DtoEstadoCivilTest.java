package com.uco.myproject.aplicacion.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoEstadoCivilTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "casado";

        //act
        DtoEstadoCivil estadoCivil = new DtoEstadoCivil(codigo, nombre);

        //assert
        Assertions.assertEquals("1",estadoCivil.getCodigo());
        Assertions.assertEquals("casado",estadoCivil.getNombre());
    }
}