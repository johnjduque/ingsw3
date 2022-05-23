package com.uco.myproject.dominio.servicio.ahorroprevio;

import com.uco.myproject.dominio.modelo.AhorroPrevio;
import com.uco.myproject.dominio.puerto.RepositorioAhorroPrevio;
import com.uco.myproject.dominio.puerto.RepositorioFormulario;
import com.uco.myproject.dominio.servicio.formulario.ServicioGuardarFormulario;
import com.uco.myproject.dominio.testdatabuilder.AhorroPrevioTestDataBuilder;
import com.uco.myproject.dominio.testdatabuilder.FormularioTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ServicioGuardarAhorroPrevioTest {

    @Test
    void guardarExitoso() {

        // arrange
        var ahorroPrevio = new AhorroPrevioTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioAhorroPrevio.class);
        var servicio = new ServicioGuardarAhorroPrevio(repositorio);


        Mockito.when(repositorio.guardar(Mockito.any(AhorroPrevio.class))).thenReturn(Long.valueOf(Math.toIntExact(1234567890L)));

        // act
        var id = servicio.ejecutar(ahorroPrevio);

        // assert
        Mockito.verify(repositorio, Mockito.times(1)).guardar(ahorroPrevio);
        Assertions.assertEquals(1234567890l, id);

    }

    @Test
    void siAhorroPrevioYaExisteDeberiaRetornarError() {

        //arrange
        var ahorroPrevio = new AhorroPrevioTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioAhorroPrevio.class);
        var servicio = new ServicioGuardarAhorroPrevio(repositorio);

        Mockito.when(repositorio.existe(Mockito.any())).thenReturn(true);

        //act - assert
        Assertions.assertEquals("Ya existe el ahorro previo con los datos ingresados",
                Assertions.assertThrows(IllegalStateException.class, () ->
                        servicio.ejecutar(ahorroPrevio)
                ).getMessage());

    }
}