package com.uco.myproject.dominio.servicio.persona;

import com.uco.myproject.dominio.puerto.RepositorioPersona;
import org.springframework.stereotype.Service;

@Service
public class ServicioEliminarPersona {

    private static final String MENSAJE_NO_EXISTE = "La persona que intenta eliminar no está registrada";

    private final RepositorioPersona repositorioPersona;

    public ServicioEliminarPersona(RepositorioPersona repositorioPersona){
        this.repositorioPersona = repositorioPersona;
    }

    public boolean ejecutar(int documentoIdentidad) {
        if(repositorioPersona.consultarPorId(documentoIdentidad) != null){
            return this.repositorioPersona.eliminar(documentoIdentidad);
        }else
        {
            throw new IllegalStateException(MENSAJE_NO_EXISTE);
        }
    }
}
