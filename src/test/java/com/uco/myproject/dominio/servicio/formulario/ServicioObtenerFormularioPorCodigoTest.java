package com.uco.myproject.dominio.servicio.formulario;

import com.uco.myproject.dominio.puerto.RepositorioFormulario;
import com.uco.myproject.dominio.testdatabuilder.FormularioTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ServicioObtenerFormularioPorCodigoTest {

    @Test
    void obtenerExitoso() {

        //arrange
        var formulario = new FormularioTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioFormulario.class);
        var servicio = new ServicioObtenerFormularioPorCodigo(repositorio);

        Mockito.when(repositorio.existe(Mockito.any())).thenReturn(true);

        //act - assert
        Assertions.assertEquals("Consulta exitosa",
                Assertions.assertThrows(IllegalStateException.class, () ->
                        servicio.obtenerPorCodigo(formulario.getDocumentoIdentidadJefeHogar())
                ).getMessage());

    }

    @Test
    void siFormularioNoExisteDeberiaRetornarError() {

        //arrange
        var formulario = new FormularioTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioFormulario.class);
        var servicio = new ServicioObtenerFormularioPorCodigo(repositorio);

        Mockito.when(repositorio.existe(Mockito.any())).thenReturn(false);

        //act - assert
        Assertions.assertEquals("El formulario no existe",
                Assertions.assertThrows(IllegalStateException.class, () ->
                        servicio.obtenerPorCodigo(formulario.getDocumentoIdentidadJefeHogar())
                ).getMessage());

    }

}