package com.uco.myproject.dominio.servicio.formulario;

import com.uco.myproject.dominio.modelo.Formulario;
import com.uco.myproject.dominio.puerto.RepositorioFormulario;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarFormulario {

    private static final String MENSAJE_YA_EXISTE = "Ya existe el formulario con ese radicado";

    private final RepositorioFormulario repositorioFormulario;

    public ServicioGuardarFormulario(RepositorioFormulario repositorioFormulario) {
        this.repositorioFormulario = repositorioFormulario;
    }

    public void ejecutar(Formulario formulario) {

        if(formulario.getId()!= null && repositorioFormulario.existe(formulario)) {
            throw new IllegalStateException(MENSAJE_YA_EXISTE);
        }

        repositorioFormulario.guardar(formulario);
    }
}
