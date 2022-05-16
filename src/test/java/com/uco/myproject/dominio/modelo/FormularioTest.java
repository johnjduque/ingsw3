package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

class FormularioTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        var personas = new ArrayList<Persona>();
        Persona persona = new Persona(1234,"John","","Duque","",LocalDate.of(1900,4,2),1000000);
        personas.add(persona);
        Long documentoIdentidadJefeHogar = Long.valueOf(1234567890);
        String clasificacionSisben = "A1";
        boolean poseeDerechosDePropiedad = false;
        boolean aceptoJuramento = true;
        boolean aceptoAvisoDePrivacidad = true;
        String correoElectronico = "jduque@gmail.com";
        AhorroPrevio ahorroPrevio = new AhorroPrevio(1234567890L,1000000,0,20000000);

        //act
        Formulario formulario = Formulario.of(documentoIdentidadJefeHogar,personas,clasificacionSisben,poseeDerechosDePropiedad,aceptoJuramento,aceptoAvisoDePrivacidad,correoElectronico,ahorroPrevio);

        //assert
        Assertions.assertEquals(1234567890,formulario.getDocumentoIdentidadJefeHogar());
        Assertions.assertEquals("A1",formulario.getClasificacionSisben());
        Assertions.assertEquals(false,formulario.isPoseeDerechosDePropiedad());
        Assertions.assertEquals(true,formulario.isAceptoJuramento());
        Assertions.assertEquals(true,formulario.isAceptoAvisoDePrivacidad());
        Assertions.assertEquals("jduque@gmail.com",formulario.getCorreoElectronico());
        Assertions.assertEquals(1000000,formulario.getAhorroPrevio().getCuentaAhorroProgramado());
        Assertions.assertEquals(0,formulario.getAhorroPrevio().getCesantias());
        Assertions.assertEquals(20000000,formulario.getAhorroPrevio().getSubsidioCajaCompesacion());
    }

    @Test
    void validarCamposFaltantes(){
        //arrange
        var personas = new ArrayList<Persona>();
        Persona persona = new Persona(1234,"John","","Duque","",LocalDate.of(1900,4,2),1000000);
        personas.add(persona);
        Long documentoIdentidadJefeHogar = Long.valueOf(1234567890);
        String clasificacionSisben = null;
        boolean poseeDerechosDePropiedad = false;
        boolean aceptoJuramento = true;
        boolean aceptoAvisoDePrivacidad = true;
        String correoElectronico = "jduque@gmail.com";
        AhorroPrevio ahorroPrevio = new AhorroPrevio(1234567890L,1000000,500000,20000000);

        //act - assert
        Assertions.assertEquals("Sino posee clasificacion del sisben, no se puede postular",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Formulario.of(documentoIdentidadJefeHogar,personas,clasificacionSisben,poseeDerechosDePropiedad,aceptoJuramento,aceptoAvisoDePrivacidad,correoElectronico,ahorroPrevio)
        ).getMessage());
    }

    @Test
    void validarCamposVacios(){
        //arrange
        var personas = new ArrayList<Persona>();
        Persona persona = new Persona(1234,"John","","Duque","",LocalDate.of(1900,4,2),1000000);
        personas.add(persona);
        Long documentoIdentidadJefeHogar = Long.valueOf(1234567890);
        String clasificacionSisben = "";
        boolean poseeDerechosDePropiedad = false;
        boolean aceptoJuramento = true;
        boolean aceptoAvisoDePrivacidad = true;
        String correoElectronico = "jduque@gmail.com";
        AhorroPrevio ahorroPrevio = new AhorroPrevio(1234567890L,1000000,500000,20000000);

        //act - assert
        Assertions.assertEquals("Sino posee clasificacion del sisben, no se puede postular",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Formulario.of(documentoIdentidadJefeHogar,personas,clasificacionSisben,poseeDerechosDePropiedad,aceptoJuramento,aceptoAvisoDePrivacidad,correoElectronico,ahorroPrevio)
        ).getMessage());
    }

    @Test
    void emailNoValido(){
        //arrange
        var personas = new ArrayList<Persona>();
        Persona persona = new Persona(1234,"John","","Duque","", LocalDate.of(1900,4,2),1000000);
        personas.add(persona);
        Long documentoIdentidadJefeHogar = Long.valueOf(1234567890);
        String clasificacionSisben = "A1";
        boolean poseeDerechosDePropiedad = false;
        boolean aceptoJuramento = true;
        boolean aceptoAvisoDePrivacidad = true;
        String correoElectronico = "jduquegmail.com";
        AhorroPrevio ahorroPrevio = new AhorroPrevio(1234567890L,1000000,500000,20000000);

        //act - assert
        Assertions.assertEquals("El correo electronico ingresado no es válido",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Formulario.of(documentoIdentidadJefeHogar,personas,clasificacionSisben,poseeDerechosDePropiedad,aceptoJuramento,aceptoAvisoDePrivacidad,correoElectronico,ahorroPrevio)
        ).getMessage());
    }
}
