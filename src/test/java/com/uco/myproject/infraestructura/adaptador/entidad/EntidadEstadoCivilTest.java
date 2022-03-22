package com.uco.myproject.infraestructura.adaptador.entidad;

import com.uco.myproject.dominio.modelo.EstadoCivil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntidadEstadoCivilTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "casado";

        //act
        EntidadEstadoCivil estadoCivil = new EntidadEstadoCivil(codigo, nombre);

        //assert
        Assertions.assertEquals("1",estadoCivil.getCodigo());
        Assertions.assertEquals("casado",estadoCivil.getNombre());
    }
}