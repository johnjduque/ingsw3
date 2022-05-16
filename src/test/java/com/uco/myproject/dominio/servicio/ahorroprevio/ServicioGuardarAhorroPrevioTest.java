package com.uco.myproject.dominio.servicio.ahorroprevio;

import com.uco.myproject.dominio.modelo.AhorroPrevio;
import com.uco.myproject.dominio.puerto.RepositorioAhorroPrevio;
import com.uco.myproject.dominio.testdatabuilder.AhorroPrevioTestDataBuilder;
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
}