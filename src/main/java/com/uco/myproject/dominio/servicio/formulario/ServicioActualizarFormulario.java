package com.uco.myproject.dominio.servicio.formulario;

import com.uco.myproject.dominio.modelo.Formulario;
import com.uco.myproject.dominio.puerto.RepositorioFormulario;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarFormulario {

    private static final String FORMULARIO_NO_ACTUALIZADA = "El formulario no se puede actualizar, no se encuentra en el sistema";

    private final RepositorioFormulario repositorioFormulario;

    public ServicioActualizarFormulario(RepositorioFormulario repositorioFormulario)
    {
        this.repositorioFormulario = repositorioFormulario;
    }

    public void ejecutar(Long id, Formulario formulario){
        if(repositorioFormulario.consultarPorId(id) != null){
            repositorioFormulario.actualizar(id, formulario);
        }else
        {
            throw new IllegalStateException(FORMULARIO_NO_ACTUALIZADA);
        }
    }
}
