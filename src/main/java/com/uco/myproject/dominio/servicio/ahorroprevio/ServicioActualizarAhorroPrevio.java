package com.uco.myproject.dominio.servicio.ahorroprevio;

import com.uco.myproject.dominio.modelo.AhorroPrevio;
import com.uco.myproject.dominio.puerto.RepositorioAhorroPrevio;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarAhorroPrevio {

    private static final String AHORRO_NO_ACTUALIZADA = "El ahorro no se puede actualizar, no se encuentra en el sistema";

    private final RepositorioAhorroPrevio repositorioAhorroPrevio;

    public ServicioActualizarAhorroPrevio(RepositorioAhorroPrevio repositorioAhorroPrevio)
    {
        this.repositorioAhorroPrevio = repositorioAhorroPrevio;
    }

    public Boolean ejecutar(Long id, AhorroPrevio ahorroPrevio){
        if(repositorioAhorroPrevio.consultarPorId(id) != null){
            return repositorioAhorroPrevio.actualizar(id, ahorroPrevio);
        }else
        {
            throw new IllegalStateException(AHORRO_NO_ACTUALIZADA);
        }
    }
}
