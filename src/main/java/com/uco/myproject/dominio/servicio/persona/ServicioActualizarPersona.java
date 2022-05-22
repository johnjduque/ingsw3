package com.uco.myproject.dominio.servicio.persona;

import com.uco.myproject.dominio.modelo.Persona;
import com.uco.myproject.dominio.puerto.RepositorioPersona;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarPersona {

    private static final String PERSONA_NO_ACTUALIZADA = "La persona no se puede actualizar, no se encuentra en el sistema";

    private final RepositorioPersona repositorioPersona;

    public ServicioActualizarPersona(RepositorioPersona repositorioPersona)
    {
        this.repositorioPersona = repositorioPersona;
    }

    public Boolean ejecutar(Long documentoIdentidad, Persona persona){
        if(repositorioPersona.consultarPorId(documentoIdentidad) != null){
            return repositorioPersona.actualizar(documentoIdentidad, persona);
        }else
        {
            throw new IllegalStateException(PERSONA_NO_ACTUALIZADA);
        }
    }
}
