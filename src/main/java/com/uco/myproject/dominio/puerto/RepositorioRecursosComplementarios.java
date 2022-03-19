package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.RecursosComplementarios;

import java.util.List;

public interface RepositorioRecursosComplementarios {

    List<RecursosComplementarios> listar();
    RecursosComplementarios cosultarPorId(String codigo);
    Long guardar(RecursosComplementarios recursosComplementarios);
    boolean existe(RecursosComplementarios recursosComplementarios);
}
