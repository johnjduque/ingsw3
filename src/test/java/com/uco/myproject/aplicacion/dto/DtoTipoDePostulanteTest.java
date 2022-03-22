package com.uco.myproject.aplicacion.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoTipoDePostulanteTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "jefe de hogar";

        //act
        DtoTipoDePostulante tipoDePostulante = new DtoTipoDePostulante(codigo, nombre);

        //assert
        Assertions.assertEquals("1",tipoDePostulante.getCodigo());
        Assertions.assertEquals("jefe de hogar",tipoDePostulante.getNombre());
    }
}