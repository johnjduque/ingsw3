package com.uco.myproject.aplicacion.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoCondicionEspecialMedicaTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "discapacitado";

        //act
        DtoCondicionEspecialMedica condicionEspecialMedica = new DtoCondicionEspecialMedica(codigo, nombre);

        //assert
        Assertions.assertEquals("1",condicionEspecialMedica.getCodigo());
        Assertions.assertEquals("discapacitado",condicionEspecialMedica.getNombre());
    }
}