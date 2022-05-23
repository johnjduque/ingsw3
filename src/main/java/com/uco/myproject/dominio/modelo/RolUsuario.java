package com.uco.myproject.dominio.modelo;

import com.uco.myproject.dominio.validarobligatorio.ValidarArgumento;

public class RolUsuario {

    private final String rol;

    public static RolUsuario of(String rol) {

        ValidarArgumento.validarObligatorio(rol, "El rol no puede ser vacio");

        return new RolUsuario(rol);
    }

    private RolUsuario(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }
}
