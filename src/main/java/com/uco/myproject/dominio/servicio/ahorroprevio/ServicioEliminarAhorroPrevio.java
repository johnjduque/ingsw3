package com.uco.myproject.dominio.servicio.ahorroprevio;

import com.uco.myproject.dominio.puerto.RepositorioAhorroPrevio;
import org.springframework.stereotype.Service;

@Service
public class ServicioEliminarAhorroPrevio {

    private static final String MENSAJE_NO_EXISTE = "El ahorro que intenta eliminar no está registrada";

    private final RepositorioAhorroPrevio repositorioAhorroPrevio;

    public ServicioEliminarAhorroPrevio(RepositorioAhorroPrevio repositorioAhorroPrevioA){
        this.repositorioAhorroPrevio = repositorioAhorroPrevioA;
    }

    public boolean ejecutar(Long id) {
        if(repositorioAhorroPrevio.consultarPorId(id) != null){
            return repositorioAhorroPrevio.eliminar(id);
        }else
        {
            throw new IllegalStateException(MENSAJE_NO_EXISTE);
        }
    }
}
