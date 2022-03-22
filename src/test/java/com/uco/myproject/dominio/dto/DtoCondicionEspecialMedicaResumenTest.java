package com.uco.myproject.dominio.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoCondicionEspecialMedicaResumenTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "discapacitado";

        //act
        DtoCondicionEspecialMedicaResumen condicionEspecialMedica = new DtoCondicionEspecialMedicaResumen(codigo, nombre);

        //assert
        Assertions.assertEquals("1",condicionEspecialMedica.getCodigo());
        Assertions.assertEquals("discapacitado",condicionEspecialMedica.getNombre());
    }
}