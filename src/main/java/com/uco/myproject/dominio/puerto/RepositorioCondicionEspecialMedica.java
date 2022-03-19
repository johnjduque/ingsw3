package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.CondicionEspecialMedica;

import java.util.List;

public interface RepositorioCondicionEspecialMedica {

    List<CondicionEspecialMedica> listar();
    CondicionEspecialMedica consultarPorId(String codigo);
    boolean existe(CondicionEspecialMedica condicionEspecialMedica);
}
