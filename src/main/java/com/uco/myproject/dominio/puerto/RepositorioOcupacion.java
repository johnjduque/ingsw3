package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.Ocupacion;

import java.util.List;

public interface RepositorioOcupacion {

    List<Ocupacion> listar();
    Ocupacion consultarPorId(String codigo);
    boolean existe(Ocupacion ocupacion);
}
