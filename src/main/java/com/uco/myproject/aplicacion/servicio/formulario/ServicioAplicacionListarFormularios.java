package com.uco.myproject.aplicacion.servicio.formulario;

import com.uco.myproject.dominio.modelo.Formulario;
import com.uco.myproject.dominio.puerto.RepositorioFormulario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioAplicacionListarFormularios {

    private final RepositorioFormulario repositorioFormulario;

    public ServicioAplicacionListarFormularios(RepositorioFormulario repositorioFormulario) {
        this.repositorioFormulario = repositorioFormulario;
    }

    public List<Formulario> ejecutar() {
        return repositorioFormulario.listar();
    }
}
