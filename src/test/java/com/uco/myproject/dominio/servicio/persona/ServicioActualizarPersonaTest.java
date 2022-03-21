package com.uco.myproject.dominio.servicio.persona;

import com.uco.myproject.dominio.puerto.RepositorioPersona;
import com.uco.myproject.dominio.testdatabuilder.PersonaTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ServicioActualizarPersonaTest {

    @Test
    void personaNoRegistrada(){

        var persona = new PersonaTestDataBuilder().build();
        var repositorio = Mockito.mock(RepositorioPersona.class);
        var servicio = new ServicioActualizarPersona(repositorio);

        Mockito.when(!repositorio.existe(Mockito.any())).thenReturn(true);

        Assertions.assertEquals("El ususario que desea actualizar no se encuentra registrado",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        servicio.actualizar(1,persona)).getMessage());
    }
}