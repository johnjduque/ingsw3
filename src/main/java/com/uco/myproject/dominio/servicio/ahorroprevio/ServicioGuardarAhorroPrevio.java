package com.uco.myproject.dominio.servicio.ahorroprevio;

import com.uco.myproject.dominio.modelo.AhorroPrevio;
import com.uco.myproject.dominio.puerto.RepositorioAhorroPrevio;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarAhorroPrevio {

    private final RepositorioAhorroPrevio repositorioAhorroPrevio;

    public ServicioGuardarAhorroPrevio(RepositorioAhorroPrevio repositorioAhorroPrevio) {
        this.repositorioAhorroPrevio = repositorioAhorroPrevio;
    }

    public Long ejecutar(AhorroPrevio ahorroPrevio) {

        return repositorioAhorroPrevio.guardar(ahorroPrevio);
    }
}
