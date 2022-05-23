package com.uco.myproject.dominio.servicio.formulario;

import com.uco.myproject.dominio.modelo.Formulario;
import com.uco.myproject.dominio.puerto.RepositorioFormulario;
import com.uco.myproject.dominio.testdatabuilder.FormularioTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ServicioGuardarFormularioTest {

    @Test
    void guardarExitoso() {

        // arrange
        var formulario = new FormularioTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioFormulario.class);
        var servicio = new ServicioGuardarFormulario(repositorio);


        Mockito.when(repositorio.guardar(Mockito.any(Formulario.class))).thenReturn((long) Math.toIntExact(1234567890L));

        // act
        var id = servicio.ejecutar(formulario);

        // assert
        Mockito.verify(repositorio, Mockito.times(1)).guardar(formulario);
        Assertions.assertEquals(1234567890l, id);

    }

    @Test
    void siFormularioYaExisteDeberiaRetornarError() {

        //arrange
        var formulario = new FormularioTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioFormulario.class);
        var servicio = new ServicioGuardarFormulario(repositorio);

        Mockito.when(repositorio.existe(Mockito.any())).thenReturn(true);

        //act - assert
        Assertions.assertEquals("Ya existe el formulario con los datos ingresados",
                Assertions.assertThrows(IllegalStateException.class, () ->
                        servicio.ejecutar(formulario)
                ).getMessage());

    }
}