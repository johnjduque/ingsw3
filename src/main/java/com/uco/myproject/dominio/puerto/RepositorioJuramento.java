package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.Juramento;

import java.util.List;

public interface RepositorioJuramento {

    List<Juramento> listar();
    Juramento consultarPorId(String codigo);
    boolean existe(Juramento juramento);
}
