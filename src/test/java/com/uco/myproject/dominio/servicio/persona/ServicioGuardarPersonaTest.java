package com.uco.myproject.dominio.servicio.persona;

import com.uco.myproject.dominio.puerto.*;
import com.uco.myproject.dominio.testdatabuilder.PersonaTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ServicioGuardarPersonaTest {

    @Test
    void personaYaRegistrada(){

        var persona = new PersonaTestDataBuilder().build();
        var repositorioPersona = Mockito.mock(RepositorioPersona.class);
        var repositorioTipoDeDocumento = Mockito.mock(RepositorioTipoDeDocumento.class);
        var repositorioGenero = Mockito.mock(RepositorioGenero.class);
        var repositorioEstadoCivil = Mockito.mock(RepositorioEstadoCivil.class);
        var repositorioCondicionEspecialMedica = Mockito.mock(RepositorioCondicionEspecialMedica.class);
        var repositorioCondicionEspecialSocioeconomica = Mockito.mock(RepositorioCondicionEspecialSocioeconomica.class);
        var repositorioTipoDePostulante = Mockito.mock(RepositorioTipoDePostulante.class);
        var repositorioOcupacion = Mockito.mock(RepositorioOcupacion.class);
        var repositorioOrientacionSexual = Mockito.mock(RepositorioOrientacionSexual.class);
        var repositorioDatosDeContacto = Mockito.mock(RepositorioDatosDeContacto.class);
        var servicio = new ServicioGuardarPersona(repositorioPersona,repositorioTipoDeDocumento,repositorioGenero,repositorioEstadoCivil,
                repositorioCondicionEspecialMedica,repositorioCondicionEspecialSocioeconomica,repositorioTipoDePostulante,
                repositorioOcupacion,repositorioOrientacionSexual,repositorioDatosDeContacto);

        Mockito.when(repositorioPersona.existe(Mockito.any())).thenReturn(true);

        Assertions.assertEquals("La persona con el número de identificación ingresado ya se encuentra registrado",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        servicio.guardar(persona)).getMessage());
    }

    @Test
    void GuardarExitoso(){

        var persona = new PersonaTestDataBuilder().build();
        var repositorioPersona = Mockito.mock(RepositorioPersona.class);
        var repositorioTipoDeDocumento = Mockito.mock(RepositorioTipoDeDocumento.class);
        var repositorioGenero = Mockito.mock(RepositorioGenero.class);
        var repositorioEstadoCivil = Mockito.mock(RepositorioEstadoCivil.class);
        var repositorioCondicionEspecialMedica = Mockito.mock(RepositorioCondicionEspecialMedica.class);
        var repositorioCondicionEspecialSocioeconomica = Mockito.mock(RepositorioCondicionEspecialSocioeconomica.class);
        var repositorioTipoDePostulante = Mockito.mock(RepositorioTipoDePostulante.class);
        var repositorioOcupacion = Mockito.mock(RepositorioOcupacion.class);
        var repositorioOrientacionSexual = Mockito.mock(RepositorioOrientacionSexual.class);
        var repositorioDatosDeContacto = Mockito.mock(RepositorioDatosDeContacto.class);
        var servicio = new ServicioGuardarPersona(repositorioPersona,repositorioTipoDeDocumento,repositorioGenero,repositorioEstadoCivil,
                repositorioCondicionEspecialMedica,repositorioCondicionEspecialSocioeconomica,repositorioTipoDePostulante,
                repositorioOcupacion,repositorioOrientacionSexual,repositorioDatosDeContacto);

        Mockito.when(repositorioPersona.guardar(Mockito.any())).thenReturn(1l);

        var id = servicio.guardar(persona);

        Mockito.verify(repositorioPersona, Mockito.times(1)).guardar(persona);
        Assertions.assertEquals(1l,id);
    }
}