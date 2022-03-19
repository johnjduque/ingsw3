package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.TipoDePostulante;

import java.util.List;

public interface RepositorioTipoDePostulante {

    List<TipoDePostulante> listar();
    TipoDePostulante consultarPorId(String codigo);
    boolean existe(TipoDePostulante tipoDePostulante);
}
