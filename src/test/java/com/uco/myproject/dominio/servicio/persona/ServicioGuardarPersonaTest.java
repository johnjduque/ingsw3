package com.uco.myproject.dominio.servicio.persona;

import com.uco.myproject.dominio.modelo.Persona;
import com.uco.myproject.dominio.puerto.RepositorioPersona;
import com.uco.myproject.dominio.testdatabuilder.PersonaTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ServicioGuardarPersonaTest {

    @Test
    void guardarExitoso() {

        // arrange
        var persona = new PersonaTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioPersona.class);
        var servicio = new ServicioGuardarPersona(repositorio);


        Mockito.when(repositorio.guardar(Mockito.any(Persona.class))).thenReturn(Math.toIntExact(1234567890L));

        // act
        var id = servicio.ejecutar(persona);

        // assert
        Mockito.verify(repositorio, Mockito.times(1)).guardar(persona);
        Assertions.assertEquals(1234567890l, id);

    }

    @Test
    void siPersonaYaExisteDeberiaRetornarError() {

        //arrange
        var persona = new PersonaTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioPersona.class);
        var servicio = new ServicioGuardarPersona(repositorio);

        Mockito.when(repositorio.existe(Mockito.any())).thenReturn(true);

        //act - assert
        Assertions.assertEquals("Ya existe la persona con los datos ingresados",
                Assertions.assertThrows(IllegalStateException.class, () ->
                        servicio.ejecutar(persona)
                ).getMessage());

    }
}