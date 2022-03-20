package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.dto.DtoPersonaResumen;
import com.uco.myproject.dominio.modelo.Persona;

import java.util.List;

public interface RepositorioPersona {

    List<DtoPersonaResumen> listar();
    DtoPersonaResumen consultarPorId(String id);
    void guardar(Persona persona);
    void actualizar(String codigo, Persona persona);
    void borrar(String codigo);
    boolean existe(DtoPersonaResumen persona);
}
