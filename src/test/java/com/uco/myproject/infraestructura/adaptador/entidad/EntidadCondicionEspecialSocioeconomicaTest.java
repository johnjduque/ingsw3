package com.uco.myproject.infraestructura.adaptador.entidad;

import com.uco.myproject.dominio.modelo.CondicionEspecialSocioeconomica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntidadCondicionEspecialSocioeconomicaTest {

    @Test
    void validarCreacionExitosa(){
        //arrange
        String codigo = "1";
        String nombre = "madre cabeza de hogar";

        //act
        EntidadCondicionEspecialSocioeconomica condicionEspecialSocioeconomica = new EntidadCondicionEspecialSocioeconomica(codigo, nombre);

        // assert
        Assertions.assertEquals("1",condicionEspecialSocioeconomica.getCodigo());
        Assertions.assertEquals("madre cabeza de hogar",condicionEspecialSocioeconomica.getNombre());
    }
}