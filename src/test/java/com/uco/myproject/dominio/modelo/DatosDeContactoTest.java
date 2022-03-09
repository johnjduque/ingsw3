package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DatosDeContactoTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String numeroFijo = "6046150156";
        String numeroCelular = "3568345689";
        String correoElectronico = "jduque@uco.net.co";

        //act
        DatosDeContacto datosDeContacto = DatosDeContacto.of(codigo, numeroFijo,
                numeroCelular, correoElectronico);

        //assert
        Assertions.assertEquals("1",datosDeContacto.getCodigo());
        Assertions.assertEquals("6046150156",datosDeContacto.getNumeroFijo());
        Assertions.assertEquals("3568345689",datosDeContacto.getNumeroCelular());
        Assertions.assertEquals("jduque@uco.net.co",datosDeContacto.getCorreoElectronico());
    }

    @Test
    void validarCamposFaltantes(){
        //arrange
        String codigo = null;
        String numeroFijo = "6046150156";
        String numeroCelular = "3568345689";
        String correoElectronico = "jduque@uco.net.co";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        DatosDeContacto.of(codigo, numeroFijo, numeroCelular, correoElectronico)
                ).getMessage());
    }

    @Test
    void validarCamposVacios(){
        //arrange
        String codigo = "";
        String numeroFijo = "6046150156";
        String numeroCelular = "3568345689";
        String correoElectronico = "jduque@uco.net.co";

        //act - assert
        Assertions.assertEquals("El código no puede ser vacío",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        DatosDeContacto.of(codigo, numeroFijo, numeroCelular, correoElectronico)
                ).getMessage());
    }

}