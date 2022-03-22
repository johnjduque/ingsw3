package com.uco.myproject.dominio.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoEstadoCivilResumenTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "casado";

        //act
        DtoEstadoCivilResumen estadoCivil = new DtoEstadoCivilResumen(codigo, nombre);

        //assert
        Assertions.assertEquals("1",estadoCivil.getCodigo());
        Assertions.assertEquals("casado",estadoCivil.getNombre());
    }
}