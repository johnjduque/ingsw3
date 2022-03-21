package com.uco.myproject.dominio.servicio.persona;

import com.uco.myproject.dominio.puerto.RepositorioPersona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ServicioBorrarPersonaTest {

    @Test
    void personaNoRegistrada(){

        var repositorio = Mockito.mock(RepositorioPersona.class);
        var servicio = new ServicioBorrarPersona(repositorio);

        Mockito.when(!repositorio.existe(Mockito.any())).thenReturn(true);

        Assertions.assertEquals("El usuario que intenta eliminar no se encuentra registrado",
                Assertions.assertThrows(IllegalArgumentException.class, () ->
                        servicio.borrar(1)).getMessage());
    }
}