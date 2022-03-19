package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.Genero;

import java.util.List;

public interface RepositorioGenero {

    List<Genero> listar();
    Genero consultarPorId(String codigo);
    boolean existe(Genero genero);
}
