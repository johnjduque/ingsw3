package com.uco.myproject.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class DtoUsuario {

    private String usuario;
    private String clave;

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
}
