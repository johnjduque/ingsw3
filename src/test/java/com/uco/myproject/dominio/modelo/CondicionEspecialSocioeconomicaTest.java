package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CondicionEspecialSocioeconomicaTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "madre cabeza de hogar";

        //act
        CondicionEspecialSocioeconomica condicionEspecialSocioeconomica = CondicionEspecialSocioeconomica.of(codigo, nombre);

        // assert
        Assertions.assertEquals("1",condicionEspecialSocioeconomica.getCodigo());
        Assertions.assertEquals("madre cabeza de hogar",condicionEspecialSocioeconomica.getNombre());
    }

    @Test
    void validarCamposFalantes(){
        //arrange
        String codigo = null;
        String nombre = "madre cabeza de hogar";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        CondicionEspecialSocioeconomica.of(codigo, nombre)
                ).getMessage());
    }

    @Test
    void validarCamposVacios(){
        //arrage
        String codigo = "";
        String nombre = "madre cabeza de hogar";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        CondicionEspecialSocioeconomica.of(codigo, nombre)
                ).getMessage());
    }

}