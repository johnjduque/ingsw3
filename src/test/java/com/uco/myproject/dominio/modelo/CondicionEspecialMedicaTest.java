package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CondicionEspecialMedicaTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "discapacitado";

        //act
        CondicionEspecialMedica condicionEspecialMedica = CondicionEspecialMedica.of(codigo, nombre);

        //assert
        Assertions.assertEquals("1",condicionEspecialMedica.getCodigo());
        Assertions.assertEquals("discapacitado",condicionEspecialMedica.getNombre());
    }

    @Test
    void validarCamposFaltantes(){
        //arrange
        String codigo = null;
        String nombre = "discapacitado";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        CondicionEspecialMedica.of(codigo, nombre)
                ).getMessage());
    }

    @Test
    void validarCamposVacios(){
        //arrange
        String codigo = "";
        String nombre = "discapacitado";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        CondicionEspecialMedica.of(codigo, nombre)
                ).getMessage());
    }
}