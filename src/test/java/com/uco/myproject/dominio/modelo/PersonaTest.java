package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

class PersonaTest {

    @Test
    void validarCreacionExitosa() {
        //patron 3a

        //arrange (prepara todos los datos para la prueba)
        int documentoIdentidad = 1234567890;
        String primerNombre = "juan";
        String segundoNombre = "";
        String primerApellido = "castaño";
        String segundoApellido = "";
        LocalDate fechaNacimiento = LocalDate.of(1990,2,4);
        int ingresoMensual = 1000000;

        //act (ejecuta el metodo a probar)
        Persona persona = Persona.of(documentoIdentidad,primerNombre,segundoNombre,primerApellido,segundoApellido,fechaNacimiento,ingresoMensual);

        //assert se valida el resultado

        Assertions.assertEquals(1234567890,persona.getDocumentoIdentidad());
        Assertions.assertEquals("juan",persona.getPrimerNombre());
        Assertions.assertEquals("",persona.getSegundoNombre());
        Assertions.assertEquals("castaño",persona.getPrimerApellido());
        Assertions.assertEquals("",persona.getSegundoApellido());
        Assertions.assertEquals(LocalDate.of(1990,2,4),persona.getFechaNacimiento());
        Assertions.assertEquals(1000000,persona.getIngresoMensual());
    }

    @Test
    void validarCamposFaltantes() {
        //patron 3a

        //arrange (prepara todos los datos para la prueba)
        int documentoIdentidad = 1234567890;
        String primerNombre = null;
        String segundoNombre = "";
        String primerApellido = "castaño";
        String segundoApellido = "";
        LocalDate fechaNacimiento = LocalDate.of(1990,2,4);;
        int ingresoMensual = 1000000;

        //act - assert (ejecuta el metodo a probar)

        Assertions.assertEquals("El primer nombre no puede ser vacio",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Persona.of(documentoIdentidad,primerNombre,segundoNombre,primerApellido,segundoApellido,fechaNacimiento,ingresoMensual)
        ).getMessage());
    }

    @Test
    void validarCamposVacios() {
        //patron 3a

        //arrange (prepara todos los datos para la prueba)
        int documentoIdentidad = 1234567890;
        String primerNombre = "";
        String segundoNombre = "";
        String primerApellido = "castaño";
        String segundoApellido = "";
        LocalDate fechaNacimiento = LocalDate.of(1990,2,4);
        int ingresoMensual = 1000000;

        //act - assert (ejecuta el metodo a probar)

        Assertions.assertEquals("El primer nombre no puede ser vacio",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Persona.of(documentoIdentidad,primerNombre,segundoNombre,primerApellido,segundoApellido,fechaNacimiento,ingresoMensual)
        ).getMessage());
    }

    @Test
    void validarCamposNegativos() {
        //patron 3a

        //arrange (prepara todos los datos para la prueba)
        int documentoIdentidad = 1234567890;
        String primerNombre = "John";
        String segundoNombre = "";
        String primerApellido = "castaño";
        String segundoApellido = "";
        LocalDate fechaNacimiento = LocalDate.of(1990,2,4);
        int ingresoMensual = -500000;

        //act - assert (ejecuta el metodo a probar)

        Assertions.assertEquals("El ingreso mensual no puede ser vacio o menor a cero, sino posee ingreso coloque 0",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Persona.of(documentoIdentidad,primerNombre,segundoNombre,primerApellido,segundoApellido,fechaNacimiento,ingresoMensual)
        ).getMessage());
    }
}
