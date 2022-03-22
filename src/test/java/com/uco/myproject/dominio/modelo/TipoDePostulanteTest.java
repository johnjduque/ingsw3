package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TipoDePostulanteTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "jefe de hogar";

        //act
        TipoDePostulante tipoDePostulante = TipoDePostulante.of(codigo, nombre);

        //assert
        Assertions.assertEquals("1",tipoDePostulante.getCodigo());
        Assertions.assertEquals("jefe de hogar",tipoDePostulante.getNombre());
    }

    @Test
    void validarCamposVacios(){
        //arrange
        String codigo = null;
        String nombre = "jefe de hogar";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        TipoDePostulante.of(codigo, nombre)
                ).getMessage());
    }

    @Test
    void validarCamposFaltantes(){
        //arrange
        String codigo = "";
        String nombre = "jefe de hogar";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        TipoDePostulante.of(codigo, nombre)
                ).getMessage());
    }

}