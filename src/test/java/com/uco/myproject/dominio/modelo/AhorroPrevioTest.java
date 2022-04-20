package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AhorroPrevioTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        int cuentaAhorroProgramado = 1000000;
        int cesantias = 1500000;
        int subsidioCajaCompesacion = 25000000;

        //act
        AhorroPrevio ahorroPrevio = AhorroPrevio.of(cuentaAhorroProgramado, cesantias, subsidioCajaCompesacion);

        //assert
        Assertions.assertEquals(1000000,ahorroPrevio.getCuentaAhorroProgramado());
        Assertions.assertEquals(1500000,ahorroPrevio.getCesantias());
        Assertions.assertEquals(25000000,ahorroPrevio.getSubsidioCajaCompesacion());
    }

    @Test
    void validarCamposNegativos(){
        //arrange
        int cuentaAhorroProgramado = -3;
        int cesantias = 1500000;
        int subsidioCajaCompesacion = 25000000;

        //act - assert (ejecuta el metodo a probar)

        Assertions.assertEquals("La cuenta de Ahorro programado no puede ser vacío o menor a cero",Assertions.assertThrows(IllegalArgumentException.class, () ->
                AhorroPrevio.of(cuentaAhorroProgramado,cesantias,subsidioCajaCompesacion)
        ).getMessage());
    }

}
