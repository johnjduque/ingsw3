package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JuramentoTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String descripcionJuramento = "juro que toda la información ingresada en el formulario es veridica...";

        //act
        Juramento juramento = Juramento.of(codigo, descripcionJuramento);

        //assert
        Assertions.assertEquals("1",juramento.getCodigo());
        Assertions.assertEquals("juro que toda la información ingresada en el formulario es veridica...",juramento.getDescripcionJurmento());
    }

    @Test
    void validarCamposFaltantes(){
        //arrange
        String codigo = null;
        String descripcionJuramento = "juro que toda la información ingresada en el formulario es veridica...";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        Juramento.of(codigo, descripcionJuramento)
                ).getMessage());
    }

    @Test
    void validarCamposVacios(){
        //arrange
        String codigo = "";
        String descripcionJuramento = "pensionado";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        Juramento.of(codigo, descripcionJuramento)
                ).getMessage());
    }

}