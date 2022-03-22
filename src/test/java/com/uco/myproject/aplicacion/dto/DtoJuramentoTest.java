package com.uco.myproject.aplicacion.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoJuramentoTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String descripcionJuramento = "juro que toda la información ingresada en el formulario es veridica...";

        //act
        DtoJuramento juramento = new DtoJuramento(codigo, descripcionJuramento);

        //assert
        Assertions.assertEquals("1",juramento.getCodigo());
        Assertions.assertEquals("juro que toda la información ingresada en el formulario es veridica...",juramento.getDescripcionJurmento());
    }
}