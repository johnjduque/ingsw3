package com.uco.myproject.dominio.modelo;

import com.uco.myproject.dominio.validarobligatorio.ValidarArgumento;

import java.util.List;

public class Usuario {

    private final String usuario;
    private String clave;

    private List<RolUsuario> roles;

    public static Usuario of(String usuario, String clave,List<RolUsuario> roles) {

        ValidarArgumento.validarObligatorio(usuario, "El usuario no puede ser vacio");
        ValidarArgumento.validarObligatorio(clave, "La clave no puede ser vacio");
        ValidarArgumento.validarLongitud(clave, 6L, "La clave debe tener una longitud mínima de %s");
        ValidarArgumento.validarNoVacia(roles, "Debe tener por lo menos un rol");

        return new Usuario(usuario, clave, roles);
    }

    private Usuario(String usuario, String clave, List<RolUsuario> roles) {
        this.usuario = usuario;
        this.clave = clave;
        this.roles = roles;
    }

    public List<RolUsuario> getRoles() {
        return roles;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public void asignarClaveCifrada(String clave) {
        this.clave = clave;
    }
}
