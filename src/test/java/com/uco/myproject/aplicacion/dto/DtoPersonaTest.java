package com.uco.myproject.aplicacion.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class DtoPersonaTest {

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
        DtoTipoDeDocumento tipoDeDocumento = new DtoTipoDeDocumento("1","cédula");
        DtoGenero genero = new DtoGenero("1","femenino");
        DtoEstadoCivil estadoCivil = new DtoEstadoCivil("1","casado");
        DtoCondicionEspecialMedica condicionEspecialMedica = new DtoCondicionEspecialMedica("1","discapacitado");
        DtoCondicionEspecialSocioeconomica condicionEspecialSocioeconomica = new DtoCondicionEspecialSocioeconomica("1","cabeza madre de hogar");
        DtoTipoDePostulante tipoDePostulante = new DtoTipoDePostulante("1","jefe de hogar");
        DtoOcupacion ocupacion = new DtoOcupacion("1","empleado");
        DtoOrientacionSexual orientacionSexual = new DtoOrientacionSexual("1","heterosexual");
        DtoDatosDeContacto datosDeContacto = new DtoDatosDeContacto("1","6046150151","3207123838","jduque@rionegro.gov.co");

        //act (ejecuta el metodo a probar)
        DtoPersona persona = new DtoPersona(codigo,documentoIdentidad,primerNombre,segundoNombre,primerApellido,
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