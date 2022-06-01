package com.uco.myproject.dominio.servicio.formulario;

import com.uco.myproject.dominio.modelo.Formulario;
import com.uco.myproject.dominio.puerto.RepositorioFormulario;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarFormulario {

    private static final String MENSAJE_YA_EXISTE = "Ya existe el formulario con los datos ingresados";

    private final RepositorioFormulario repositorioFormulario;

    public ServicioGuardarFormulario(RepositorioFormulario repositorioFormulario) {
        this.repositorioFormulario = repositorioFormulario;
    }

    public Long ejecutar(Formulario formulario) {

        if(formulario.getDocumentoIdentidadJefeHogar() != null && repositorioFormulario.existe(formulario)) {
            throw new IllegalStateException(MENSAJE_YA_EXISTE);
        }

        return repositorioFormulario.guardar(formulario);
    }
}
