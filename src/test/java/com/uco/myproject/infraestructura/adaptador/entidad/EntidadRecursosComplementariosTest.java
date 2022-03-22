package com.uco.myproject.infraestructura.adaptador.entidad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntidadRecursosComplementariosTest {

    @Test
    void validarCreacionExitosa(){
        //arrange

        String codigo = "1";
        String nombre = "cdt";
        int ahorroPrevioCualquierModalidad = 1000000;

        //act
        EntidadRecursosComplementarios recursosComplementarios = new EntidadRecursosComplementarios(codigo,nombre,ahorroPrevioCualquierModalidad);

        //assert
        Assertions.assertEquals("1",recursosComplementarios.getCodigo());
        Assertions.assertEquals("cdt",recursosComplementarios.getNombre());
        Assertions.assertEquals(1000000,recursosComplementarios.getAhorroPrevioCualquierModalidad());
    }
}