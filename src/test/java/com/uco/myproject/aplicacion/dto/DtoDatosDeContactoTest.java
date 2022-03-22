package com.uco.myproject.aplicacion.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DtoDatosDeContactoTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String numeroFijo = "6046150156";
        String numeroCelular = "3568345689";
        String correoElectronico = "jduque@uco.net.co";

        //act
        DtoDatosDeContacto datosDeContacto = new DtoDatosDeContacto(codigo, numeroFijo,
                numeroCelular, correoElectronico);

        //assert
        Assertions.assertEquals("1",datosDeContacto.getCodigo());
        Assertions.assertEquals("6046150156",datosDeContacto.getNumeroFijo());
        Assertions.assertEquals("3568345689",datosDeContacto.getNumeroCelular());
        Assertions.assertEquals("jduque@uco.net.co",datosDeContacto.getCorreoElectronico());
    }
}