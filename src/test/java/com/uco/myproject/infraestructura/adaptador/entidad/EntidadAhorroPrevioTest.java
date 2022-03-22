package com.uco.myproject.infraestructura.adaptador.entidad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntidadAhorroPrevioTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        int cuentaAhorroProgramado = 0;
        int cesantias = 1500000;
        int subsidioCajaCompesacion = 25000000;

        //act
        EntidadAhorroPrevio entidadAhorroPrevio = new EntidadAhorroPrevio(codigo, cuentaAhorroProgramado, cesantias, subsidioCajaCompesacion);

        //assert
        Assertions.assertEquals("1",entidadAhorroPrevio.getCodigo());
        Assertions.assertEquals(0,entidadAhorroPrevio.getCuentaAhorroProgramado());
        Assertions.assertEquals(1500000,entidadAhorroPrevio.getCesantias());
        Assertions.assertEquals(25000000,entidadAhorroPrevio.getSubsidioCajaCompesacion());
    }
}