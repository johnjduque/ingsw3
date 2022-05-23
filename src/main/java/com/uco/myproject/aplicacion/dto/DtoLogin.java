package com.uco.myproject.aplicacion.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DtoLogin {

    private String usuario;
    private String clave;

    public DtoLogin(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
}
