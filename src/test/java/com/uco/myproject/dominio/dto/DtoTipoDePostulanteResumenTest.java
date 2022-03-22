package com.uco.myproject.dominio.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoTipoDePostulanteResumenTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "jefe de hogar";

        //act
        DtoTipoDePostulanteResumen tipoDePostulante = new DtoTipoDePostulanteResumen(codigo, nombre);

        //assert
        Assertions.assertEquals("1",tipoDePostulante.getCodigo());
        Assertions.assertEquals("jefe de hogar",tipoDePostulante.getNombre());
    }
}