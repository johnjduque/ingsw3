package com.uco.myproject.infraestructura.adaptador.entidad;

import com.uco.myproject.dominio.modelo.Ocupacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntidadOcupacionTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "pensionado";

        //act
        EntidadOcupacion ocupacion = new EntidadOcupacion(codigo, nombre);

        //assert
        Assertions.assertEquals("1",ocupacion.getCodigo());
        Assertions.assertEquals("pensionado",ocupacion.getNombre());
    }
}