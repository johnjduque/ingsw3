package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FormularioTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        Long documentoIdentidadJefeHogar = Long.valueOf(1234567890);
        String clasificacionSisben = "A1";
        boolean poseeDerechosDePropiedad = false;
        boolean aceptoJuramento = true;
        boolean aceptoAvisoDePrivacidad = true;
        String correoElectronico = "jduque@gmail.com";

        //act
        Formulario formulario = Formulario.of(documentoIdentidadJefeHogar,clasificacionSisben,poseeDerechosDePropiedad,aceptoJuramento,aceptoAvisoDePrivacidad,correoElectronico);

        //assert
        Assertions.assertEquals(1234567890,formulario.getDocumentoIdentidadJefeHogar());
        Assertions.assertEquals("A1",formulario.getClasificacionSisben());
        Assertions.assertEquals(false,formulario.isPoseeDerechosDePropiedad());
        Assertions.assertEquals(true,formulario.isAceptoJuramento());
        Assertions.assertEquals(true,formulario.isAceptoAvisoDePrivacidad());
        Assertions.assertEquals("jduque@gmail.com",formulario.getCorreoElectronico());
    }

    @Test
    void validarCamposFaltantes(){
        //arrange
        Long documentoIdentidadJefeHogar = Long.valueOf(1234567890);
        String clasificacionSisben = null;
        boolean poseeDerechosDePropiedad = false;
        boolean aceptoJuramento = true;
        boolean aceptoAvisoDePrivacidad = true;
        String correoElectronico = "jduque@gmail.com";

        //act - assert
        Assertions.assertEquals("Sino posee clasificacion del sisben, no se puede postular",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Formulario.of(documentoIdentidadJefeHogar,clasificacionSisben,poseeDerechosDePropiedad,aceptoJuramento,aceptoAvisoDePrivacidad,correoElectronico)
        ).getMessage());
    }

    @Test
    void validarCamposVacios(){
        //arrange
        Long documentoIdentidadJefeHogar = Long.valueOf(1234567890);
        String clasificacionSisben = "";
        boolean poseeDerechosDePropiedad = false;
        boolean aceptoJuramento = true;
        boolean aceptoAvisoDePrivacidad = true;
        String correoElectronico = "jduque@gmail.com";

        //act - assert
        Assertions.assertEquals("Sino posee clasificacion del sisben, no se puede postular",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Formulario.of(documentoIdentidadJefeHogar,clasificacionSisben,poseeDerechosDePropiedad,aceptoJuramento,aceptoAvisoDePrivacidad,correoElectronico)
        ).getMessage());
    }

    @Test
    void emailNoValido(){
        //arrange
        Long documentoIdentidadJefeHogar = Long.valueOf(1234567890);
        String clasificacionSisben = "A1";
        boolean poseeDerechosDePropiedad = false;
        boolean aceptoJuramento = true;
        boolean aceptoAvisoDePrivacidad = true;
        String correoElectronico = "jduquegmail.com";

        //act - assert
        Assertions.assertEquals("El correo electronico ingresado no es válido",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Formulario.of(documentoIdentidadJefeHogar,clasificacionSisben,poseeDerechosDePropiedad,aceptoJuramento,aceptoAvisoDePrivacidad,correoElectronico)
        ).getMessage());
    }
}
