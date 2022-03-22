package com.uco.myproject.infraestructura.adaptador.entidad;

import com.uco.myproject.dominio.modelo.CondicionEspecialMedica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntidadCondicionEspecialMedicaTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "discapacitado";

        //act
        EntidadCondicionEspecialMedica condicionEspecialMedica = new EntidadCondicionEspecialMedica(codigo, nombre);

        //assert
        Assertions.assertEquals("1",condicionEspecialMedica.getCodigo());
        Assertions.assertEquals("discapacitado",condicionEspecialMedica.getNombre());
    }
}