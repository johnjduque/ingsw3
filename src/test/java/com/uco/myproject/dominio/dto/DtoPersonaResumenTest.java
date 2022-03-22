package com.uco.myproject.dominio.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class DtoPersonaResumenTest {

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
        DtoTipoDeDocumentoResumen tipoDeDocumento = new DtoTipoDeDocumentoResumen("1","cédula");
        DtoGeneroResumen genero = new DtoGeneroResumen("1","femenino");
        DtoEstadoCivilResumen estadoCivil = new DtoEstadoCivilResumen("1","casado");
        DtoCondicionEspecialMedicaResumen condicionEspecialMedica = new DtoCondicionEspecialMedicaResumen("1","discapacitado");
        DtoCondicionEspecialSocioeconomicaResumen condicionEspecialSocioeconomica = new DtoCondicionEspecialSocioeconomicaResumen("1","cabeza madre de hogar");
        DtoTipoDePostulanteResumen tipoDePostulante = new DtoTipoDePostulanteResumen("1","jefe de hogar");
        DtoOcupacionResumen ocupacion = new DtoOcupacionResumen("1","empleado");
        DtoOrientacionSexualResumen orientacionSexual = new DtoOrientacionSexualResumen("1","heterosexual");
        DtoDatosDeContactoResumen datosDeContacto = new DtoDatosDeContactoResumen("1","6046150151","3207123838","jduque@rionegro.gov.co");

        //act (ejecuta el metodo a probar)
        DtoPersonaResumen persona = new DtoPersonaResumen(codigo,documentoIdentidad,primerNombre,segundoNombre,primerApellido,
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