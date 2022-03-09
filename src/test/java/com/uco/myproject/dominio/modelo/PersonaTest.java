package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class PersonaTest {

    @Test
    void validarCreacionExitosa() {
        //patron 3a

        //arrange (prepara todos los datos para la prueba)
        String codigo = "1";
        int documentoIdentidad = 1036936749;
        String primerNombre = "John";
        String segundoNombre = "";
        String primerApellido = "Duque";
        String segundoApellido = "";
        Date fechaNacimiento = new Date();
        int ingresoMensual = 1000000;
        TipoDeDocumento tipoDeDocumento = new TipoDeDocumento("1","cédula");
        Genero genero = new Genero("1","femenino");
        EstadoCivil estadoCivil = new EstadoCivil("1","casado");
        CondicionEspecialMedica condicionEspecialMedica = new CondicionEspecialMedica("1","discapacitado");
        CondicionEspecialSocioeconomica condicionEspecialSocioeconomica = new CondicionEspecialSocioeconomica("1","cabeza madre de hogar");
        TipoDePostulante tipoDePostulante = new TipoDePostulante("1","jefe de hogar");
        Ocupacion ocupacion = new Ocupacion("1","empleado");
        OrientacionSexual orientacionSexual = new OrientacionSexual("1","heterosexual");
        DatosDeContacto datosDeContacto = new DatosDeContacto("1","6046150151","3207123838","jduque@rionegro.gov.co");

        //act (ejecuta el metodo a probar)
        Persona persona = Persona.of(codigo,documentoIdentidad,primerNombre,segundoNombre,primerApellido,
                segundoApellido,fechaNacimiento,ingresoMensual,tipoDeDocumento,genero,estadoCivil,condicionEspecialMedica,
                condicionEspecialSocioeconomica,tipoDePostulante,ocupacion,orientacionSexual,datosDeContacto);

        //assert se valida el resultado

        Assertions.assertEquals("1",persona.getCodigo());
        Assertions.assertEquals(1036936749,persona.getDocumentoIdentidad());
        Assertions.assertEquals("John",persona.getPrimerNombre());
        Assertions.assertEquals("",persona.getSegundoNombre());
        Assertions.assertEquals("Duque",persona.getPrimerApellido());
        Assertions.assertEquals("",persona.getSegundoApellido());
        Assertions.assertEquals(1000000,persona.getIngresoMensual());
    }
}
