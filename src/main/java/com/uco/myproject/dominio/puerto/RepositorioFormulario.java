package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.Formulario;

import java.util.List;

public interface RepositorioFormulario {

    List<Formulario> listar();
    Formulario consultarPorId(Long id);
    void guardar(Formulario formulario);
    boolean existe(Formulario formulario);
    void eliminar(Long id);
    void actualizar(Long id, Formulario formulario);
}
