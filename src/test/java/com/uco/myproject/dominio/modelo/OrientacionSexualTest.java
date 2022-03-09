package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrientacionSexualTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "heterosexual";

        //act
        OrientacionSexual orientacionSexual = OrientacionSexual.of(codigo, nombre);

        //assert
        Assertions.assertEquals("1",orientacionSexual.getCodigo());
        Assertions.assertEquals("heterosexual",orientacionSexual.getNombre());
    }

    @Test
    void validarCamposFaltantes(){
        //arrange
        String codigo = null;
        String nombre = "heterosexual";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        OrientacionSexual.of(codigo, nombre)
                ).getMessage());
    }

    @Test
    void validarCamposVacios(){
        //arrange
        String condigo = "";
        String nombre = "heterosexual";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        OrientacionSexual.of(condigo, nombre)
                ).getMessage());
    }
}