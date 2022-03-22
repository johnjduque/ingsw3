package com.uco.myproject.infraestructura.adaptador.entidad;

import com.uco.myproject.dominio.modelo.TipoDeDocumento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntidadTipoDeDocumentoTest {

    @Test
    void validarCreacionExitosa() {
        //arrange
        String codigo = "1";
        String nombre = "cédula de ciudadanía";

        //act
        EntidadTipoDeDocumento tipoDeDocumento = new EntidadTipoDeDocumento(codigo, nombre);

        //assert
        Assertions.assertEquals("1",tipoDeDocumento.getCodigo());
        Assertions.assertEquals("cédula de ciudadanía",tipoDeDocumento.getNombre());

    }
}