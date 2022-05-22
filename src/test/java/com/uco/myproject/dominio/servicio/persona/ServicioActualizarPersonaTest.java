package com.uco.myproject.dominio.servicio.persona;

import com.uco.myproject.dominio.puerto.RepositorioPersona;
import com.uco.myproject.dominio.testdatabuilder.PersonaTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ServicioActualizarPersonaTest {

    @Test
    void noExisteUusuarioParaActualizar()
    {
        var persona = new PersonaTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioPersona.class);
        var servicio = new ServicioActualizarPersona(repositorio);

        Mockito.when(!repositorio.existe(Mockito.any())).thenReturn(true);

        Assertions.assertEquals("La persona no se puede actualizar, no se encuentra en el sistema",
                Assertions.assertThrows(IllegalStateException.class,
            () -> servicio.ejecutar(1L, persona)).getMessage());
    }
}