package com.uco.myproject.aplicacion.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoAhorroPrevioTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        int cuentaAhorroProgramado = 0;
        int cesantias = 1500000;
        int subsidioCajaCompesacion = 25000000;

        //act
        DtoAhorroPrevio ahorroPrevio = new DtoAhorroPrevio(codigo, cuentaAhorroProgramado, cesantias, subsidioCajaCompesacion);

        //assert
        Assertions.assertEquals("1",ahorroPrevio.getCodigo());
        Assertions.assertEquals(0,ahorroPrevio.getCuentaAhorroProgramado());
        Assertions.assertEquals(1500000,ahorroPrevio.getCesantias());
        Assertions.assertEquals(25000000,ahorroPrevio.getSubsidioCajaCompesacion());
    }
}