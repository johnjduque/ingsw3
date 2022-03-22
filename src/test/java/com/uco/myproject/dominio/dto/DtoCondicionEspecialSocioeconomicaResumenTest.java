package com.uco.myproject.dominio.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoCondicionEspecialSocioeconomicaResumenTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "madre cabeza de hogar";

        //act
        DtoCondicionEspecialSocioeconomicaResumen condicionEspecialSocioeconomica = new DtoCondicionEspecialSocioeconomicaResumen(codigo, nombre);

        // assert
        Assertions.assertEquals("1",condicionEspecialSocioeconomica.getCodigo());
        Assertions.assertEquals("madre cabeza de hogar",condicionEspecialSocioeconomica.getNombre());
    }
}