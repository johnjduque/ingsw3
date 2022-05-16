package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.Persona;

import java.util.List;

public interface RepositorioPersona {

    List<Persona> listar();
    Persona consultarPorId(int documentoIdentidad);
    int guardar(Persona persona);
    boolean existe(Persona persona);
    boolean eliminar(int documentoIdentidad);
    boolean actualizar(int documentoIdentidad, Persona persona);
}
