package com.uco.myproject.aplicacion.servicio.persona;

import com.uco.myproject.dominio.modelo.Persona;
import com.uco.myproject.dominio.puerto.RepositorioPersona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioAplicacionListarPersona {

    private final RepositorioPersona repositorioPersona;

    public ServicioAplicacionListarPersona(RepositorioPersona repositorioPersona) {
        this.repositorioPersona = repositorioPersona;
    }

    public List<Persona> ejecutar(){
        return repositorioPersona.listar();
    }
}
