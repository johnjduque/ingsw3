package com.uco.myproject.infraestructura.adaptador.entidad;

import com.uco.myproject.dominio.modelo.OrientacionSexual;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntidadOrientacionSexualTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "heterosexual";

        //act
        EntidadOrientacionSexual orientacionSexual = new EntidadOrientacionSexual(codigo, nombre);

        //assert
        Assertions.assertEquals("1",orientacionSexual.getCodigo());
        Assertions.assertEquals("heterosexual",orientacionSexual.getNombre());
    }
}