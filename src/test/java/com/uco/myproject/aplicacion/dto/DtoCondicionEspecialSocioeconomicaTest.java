package com.uco.myproject.aplicacion.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoCondicionEspecialSocioeconomicaTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "madre cabeza de hogar";

        //act
        DtoCondicionEspecialSocioeconomica condicionEspecialSocioeconomica = new DtoCondicionEspecialSocioeconomica(codigo, nombre);

        // assert
        Assertions.assertEquals("1",condicionEspecialSocioeconomica.getCodigo());
        Assertions.assertEquals("madre cabeza de hogar",condicionEspecialSocioeconomica.getNombre());
    }
}