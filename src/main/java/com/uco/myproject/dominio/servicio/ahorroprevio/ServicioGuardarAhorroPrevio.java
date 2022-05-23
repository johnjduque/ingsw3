package com.uco.myproject.dominio.servicio.ahorroprevio;

import com.uco.myproject.dominio.modelo.AhorroPrevio;
import com.uco.myproject.dominio.puerto.RepositorioAhorroPrevio;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarAhorroPrevio {

    private static final String MENSAJE_YA_EXISTE = "Ya existe el ahorro previo con ese documento";

    private final RepositorioAhorroPrevio repositorioAhorroPrevio;

    public ServicioGuardarAhorroPrevio(RepositorioAhorroPrevio repositorioAhorroPrevio) {
        this.repositorioAhorroPrevio = repositorioAhorroPrevio;
    }

    public Long ejecutar(AhorroPrevio ahorroPrevio) {

        if(ahorroPrevio.getDocumentoIdentidadJefeHogar() != null && repositorioAhorroPrevio.existe(ahorroPrevio)) {
            throw new IllegalStateException(MENSAJE_YA_EXISTE);
        }

        return repositorioAhorroPrevio.guardar(ahorroPrevio);
    }
}
