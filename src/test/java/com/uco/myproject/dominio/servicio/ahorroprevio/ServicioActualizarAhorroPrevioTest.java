package com.uco.myproject.dominio.servicio.ahorroprevio;

import com.uco.myproject.dominio.puerto.RepositorioAhorroPrevio;
import com.uco.myproject.dominio.testdatabuilder.AhorroPrevioTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ServicioActualizarAhorroPrevioTest {

    @Test
    void noExisteAhorroParaActualizar()
    {
        var ahorroPrevio = new AhorroPrevioTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioAhorroPrevio.class);
        var servicio = new ServicioActualizarAhorroPrevio(repositorio);

        Mockito.when(!repositorio.existe(Mockito.any())).thenReturn(true);

        Assertions.assertEquals("El ahorro no se puede actualizar, no se encuentra en el sistema",
                Assertions.assertThrows(IllegalStateException.class,
                        () -> servicio.ejecutar(1L, ahorroPrevio)).getMessage());
    }
}