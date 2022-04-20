package com.uco.myproject.dominio.servicio.formulario;

import com.uco.myproject.dominio.puerto.RepositorioFormulario;
import org.springframework.stereotype.Service;

@Service
public class ServicioEliminarFormulario {

    private static final String MENSAJE_NO_EXISTE = "El formulario que intenta eliminar no está registrado";

    private final RepositorioFormulario repositorioFormulario;

    public ServicioEliminarFormulario(RepositorioFormulario repositorioFormulario){
        this.repositorioFormulario = repositorioFormulario;
    }

    public void ejecutar(Long id) {
        if(repositorioFormulario.consultarPorId(id) != null){
            repositorioFormulario.eliminar(id);
        }else
        {
            throw new IllegalStateException(MENSAJE_NO_EXISTE);
        }
    }
}
