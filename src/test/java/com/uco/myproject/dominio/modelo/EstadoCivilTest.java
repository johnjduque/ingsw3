package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EstadoCivilTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "casado";

        //act
        EstadoCivil estadoCivil = EstadoCivil.of(codigo, nombre);

        //assert
        Assertions.assertEquals("1",estadoCivil.getCodigo());
        Assertions.assertEquals("casado",estadoCivil.getNombre());
    }

    @Test
    void validarCamposFaltantes(){
        //arrange
        String codigo = null;
        String nombre = "casado";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        EstadoCivil.of(codigo, nombre)
                ).getMessage());
    }

    @Test
    void validarCamposVacios(){
        //arrange
        String codigo = "";
        String nombre = "casado";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        EstadoCivil.of(codigo, nombre)
                ).getMessage());
    }

}