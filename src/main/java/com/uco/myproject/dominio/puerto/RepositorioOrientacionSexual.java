package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.OrientacionSexual;

import java.util.List;

public interface RepositorioOrientacionSexual {

    List<OrientacionSexual> listar();
    OrientacionSexual consultarPorId(String codigo);
    boolean existe(OrientacionSexual orientacionSexual);
}
