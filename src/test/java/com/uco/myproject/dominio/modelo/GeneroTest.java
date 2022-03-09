package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GeneroTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "femenino";

        //act
        Genero genero = Genero.of(codigo, nombre);

        //assert
        Assertions.assertEquals("1",genero.getCodigo());
        Assertions.assertEquals("femenino",genero.getNombre());
    }

    @Test
    void validarCamposFaltantes(){
        //arrange
        String codigo = null;
        String nombre = "femenino";

        //act - assert
        Assertions.assertEquals("El codigo no puede ser vacio",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        Genero.of(codigo, nombre)
                ).getMessage());
    }

    @Test
    void validarCamposVacios() {
        //arrange
        String codigo = "1";
        String nombre = "";

        //act - assert
        Assertions.assertEquals("El nombre no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        Genero.of(codigo, nombre)
                ).getMessage());
    }
}