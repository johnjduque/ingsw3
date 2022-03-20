package com.uco.myproject.dominio.servicio.persona;

import com.uco.myproject.dominio.dto.DtoPersonaResumen;
import com.uco.myproject.dominio.puerto.RepositorioPersona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioListarPersonas {

    private final RepositorioPersona repositorioPersona;

    public ServicioListarPersonas(RepositorioPersona repositorioPersona) {
        this.repositorioPersona = repositorioPersona;
    }

    public List<DtoPersonaResumen> listar(){
        return this.repositorioPersona.listar();
    }
}
