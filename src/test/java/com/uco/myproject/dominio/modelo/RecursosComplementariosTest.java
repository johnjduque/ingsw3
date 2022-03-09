package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecursosComplementariosTest {

    @Test
    void validarCreacionExitosa(){
        //arrange

        String codigo = "1";
        String nombre = "cdt";
        int ahorroPrevioCualquierModalidad = 1000000;

        //act
        RecursosComplementarios recursosComplementarios = RecursosComplementarios.of(codigo,nombre,ahorroPrevioCualquierModalidad);

        //assert
        Assertions.assertEquals("1",recursosComplementarios.getCodigo());
        Assertions.assertEquals("cdt",recursosComplementarios.getNombre());
        Assertions.assertEquals(1000000,recursosComplementarios.getahorroPrevioCualquierModalidad());
    }

}