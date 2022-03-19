package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.Formulario;

import java.util.List;

public interface RepositorioFormulario {

    List<Formulario> listar();
    Formulario consultarPorId(String codigo);
    Long guardar(Formulario formulario);
    boolean existe(Formulario formulario);
}
