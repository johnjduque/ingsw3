package com.uco.myproject.dominio.servicio.formulario;

import com.uco.myproject.dominio.modelo.Formulario;
import com.uco.myproject.dominio.puerto.RepositorioFormulario;
import org.springframework.stereotype.Service;

@Service
public class ServicioObtenerFormularioPorCodigo {

    private static final String MENSAJE_NO_EXISTE = "El formulario no existe";

    private static final String MENSAJE_EXISTE = "Consulta exitosa";

    private final RepositorioFormulario repositorioFormulario;

    public ServicioObtenerFormularioPorCodigo(RepositorioFormulario repositorioFormulario) {
        this.repositorioFormulario = repositorioFormulario;
    }

    public Formulario obtenerPorCodigo(Long id){
        if (!this.repositorioFormulario.existe(this.repositorioFormulario.consultarPorId(id))){
            throw new IllegalStateException(MENSAJE_NO_EXISTE);
        }
        if (this.repositorioFormulario.existe(this.repositorioFormulario.consultarPorId(id))){
            throw new IllegalStateException(MENSAJE_EXISTE);
        }
        return this.repositorioFormulario.consultarPorId(id);
    }
}
