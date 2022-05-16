package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.AhorroPrevio;

import java.util.List;

public interface RepositorioAhorroPrevio {

    List<AhorroPrevio> listar();
    AhorroPrevio consultarPorId(Long id);
    Long guardar(AhorroPrevio ahorroPrevio);
    boolean actualizar(Long id, AhorroPrevio ahorroPrevio);
    boolean existe(AhorroPrevio ahorroPrevio);
}
