package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.EstadoCivil;

import java.util.List;

public interface RepositorioEstadoCivil {

    List<EstadoCivil> listar();
    EstadoCivil consultarPorId(String codigo);
    boolean existe(EstadoCivil estadoCivil);
}
