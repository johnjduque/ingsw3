package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.dto.DtoPersonaResumen;
import com.uco.myproject.dominio.modelo.Persona;

import java.util.List;

public interface RepositorioPersona {

    List<DtoPersonaResumen> listar();
    DtoPersonaResumen consultarPorId(int documentoIdentidad);
    Long guardar(Persona persona);
    boolean actualizar(String codigo, Persona persona);
    boolean borrar(String codigo);
    boolean existe(DtoPersonaResumen persona);
}
