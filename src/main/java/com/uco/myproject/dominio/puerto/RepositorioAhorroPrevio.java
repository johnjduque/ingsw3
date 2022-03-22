package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.AhorroPrevio;

public interface RepositorioAhorroPrevio {

    AhorroPrevio consultarPorId(String codigo);
    void guardar(AhorroPrevio ahorroPrevio);
    boolean existe(AhorroPrevio ahorroPrevio);
}
