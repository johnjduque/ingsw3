package com.uco.myproject.infraestructura.adaptador.entidad;

import com.uco.myproject.dominio.modelo.Juramento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntidadJuramentoTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String descripcionJuramento = "juro que toda la información ingresada en el formulario es veridica...";

        //act
        EntidadJuramento juramento = new EntidadJuramento(codigo, descripcionJuramento);

        //assert
        Assertions.assertEquals("1",juramento.getCodigo());
        Assertions.assertEquals("juro que toda la información ingresada en el formulario es veridica...",juramento.getDescripcionJuramento());
    }
}