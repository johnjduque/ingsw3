package com.uco.myproject.dominio.servicio.persona;

import com.uco.myproject.dominio.modelo.Persona;
import com.uco.myproject.dominio.puerto.RepositorioPersona;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarPersona {

    private static final String MENSAJE_NO_EXISTE = "El ususario que desea actualizar no se encuentra registrado";
    private final RepositorioPersona repositorioPersona;

    public ServicioActualizarPersona(RepositorioPersona repositorioPersona) {
        this.repositorioPersona = repositorioPersona;
    }

    public void actualizar(String codigo, Persona persona){
        if(this.repositorioPersona.consultarPorId(codigo) == null){
            throw new IllegalArgumentException(MENSAJE_NO_EXISTE);
        }

        this.repositorioPersona.actualizar(codigo, persona);
    }
}
