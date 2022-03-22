package com.uco.myproject.infraestructura.adaptador.entidad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class EntidadPersonaTest {


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
        EntidadTipoDeDocumento tipoDeDocumento = new EntidadTipoDeDocumento("1","cédula");
        EntidadGenero genero = new EntidadGenero("1","femenino");
        EntidadEstadoCivil estadoCivil = new EntidadEstadoCivil("1","casado");
        EntidadCondicionEspecialMedica condicionEspecialMedica = new EntidadCondicionEspecialMedica("1","discapacitado");
        EntidadCondicionEspecialSocioeconomica condicionEspecialSocioeconomica = new EntidadCondicionEspecialSocioeconomica("1","cabeza madre de hogar");
        EntidadTipoDePostulante tipoDePostulante = new EntidadTipoDePostulante("1","jefe de hogar");
        EntidadOcupacion ocupacion = new EntidadOcupacion("1","empleado");
        EntidadOrientacionSexual orientacionSexual = new EntidadOrientacionSexual("1","heterosexual");
        EntidadDatosDeContacto datosDeContacto = new EntidadDatosDeContacto("1","6046150151","3207123838","jduque@rionegro.gov.co");

        //act (ejecuta el metodo a probar)
        EntidadPersona persona = new EntidadPersona(codigo,documentoIdentidad,primerNombre,segundoNombre,primerApellido,
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