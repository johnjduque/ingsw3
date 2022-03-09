package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OcupacionTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "pensionado";

        //act
        Ocupacion ocupacion = Ocupacion.of(codigo, nombre);

        //assert
        Assertions.assertEquals("1",ocupacion.getCodigo());
        Assertions.assertEquals("pensionado",ocupacion.getNombre());
    }

    @Test
    void validarCamposFaltantes(){
        //arrange
        String codigo = null;
        String nombre = "pensionado";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        Ocupacion.of(codigo, nombre)
                ).getMessage());
    }

    @Test
    void validarCamposVacios(){
        //arrange
        String codigo = "";
        String nombre = "pensionado";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        Ocupacion.of(codigo, nombre)
                ).getMessage());
    }
}