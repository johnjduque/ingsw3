package com.uco.myproject.aplicacion.servicio.ahorroprevio;

import com.uco.myproject.dominio.modelo.AhorroPrevio;
import com.uco.myproject.dominio.puerto.RepositorioAhorroPrevio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioAplicacionListarAhorroPrevio {

    private final RepositorioAhorroPrevio repositorioAhorroPrevio;

    public ServicioAplicacionListarAhorroPrevio(RepositorioAhorroPrevio repositorioAhorroPrevio) {
        this.repositorioAhorroPrevio = repositorioAhorroPrevio;
    }

    public List<AhorroPrevio> ejecutar(){
        return repositorioAhorroPrevio.listar();
    }
}
