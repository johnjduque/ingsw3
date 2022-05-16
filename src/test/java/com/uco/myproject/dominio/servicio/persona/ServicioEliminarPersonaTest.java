package com.uco.myproject.dominio.servicio.persona;

import com.uco.myproject.dominio.puerto.RepositorioPersona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ServicioEliminarPersonaTest {

    @Test
    void noExistePersona()
    {
        var repositorio = Mockito.mock(RepositorioPersona.class);
        var servicio= new ServicioEliminarPersona(repositorio);

        Mockito.when(!repositorio.existe(Mockito.any())).thenReturn(true);

        Assertions.assertEquals("La persona que intenta eliminar no está registrada", Assertions.assertThrows(IllegalStateException.class,
                () -> servicio.ejecutar(1)).getMessage());
    }
}