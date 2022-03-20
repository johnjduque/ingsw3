package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.CondicionEspecialSocioeconomica;

import java.util.List;

public interface RepositorioCondicionEspecialSocioeconomica {

    List<CondicionEspecialSocioeconomica> listar();
    CondicionEspecialSocioeconomica consultarPorId();
    boolean existe(CondicionEspecialSocioeconomica condicionEspecialSocioeconomica);
}