package com.uco.myproject.infraestructura.adaptador.entidad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntidadGeneroTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "femenino";

        //act
        EntidadGenero genero = new EntidadGenero(codigo, nombre);

        //assert
        Assertions.assertEquals("1",genero.getCodigo());
        Assertions.assertEquals("femenino",genero.getNombre());
    }
}