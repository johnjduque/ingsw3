package com.uco.myproject.infraestructura.adaptador.entidad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntidadTipoDePostulanteTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "jefe de hogar";

        //act
        EntidadTipoDePostulante tipoDePostulante = new EntidadTipoDePostulante(codigo, nombre);

        //assert
        Assertions.assertEquals("1",tipoDePostulante.getCodigo());
        Assertions.assertEquals("jefe de hogar",tipoDePostulante.getNombre());
    }
}