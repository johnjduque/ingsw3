package com.uco.myproject.aplicacion.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoRecursosComplementariosTest {

    @Test
    void validarCreacionExitosa(){
        //arrange

        String codigo = "1";
        String nombre = "cdt";
        int ahorroPrevioCualquierModalidad = 1000000;

        //act
        DtoRecursosComplementarios recursosComplementarios = new DtoRecursosComplementarios(codigo,nombre,ahorroPrevioCualquierModalidad);

        //assert
        Assertions.assertEquals("1",recursosComplementarios.getCodigo());
        Assertions.assertEquals("cdt",recursosComplementarios.getNombre());
        Assertions.assertEquals(1000000,recursosComplementarios.getahorroPrevioCualquierModalidad());
    }
}