package com.uco.myproject.dominio.servicio.persona;

import com.uco.myproject.dominio.puerto.RepositorioPersona;
import org.springframework.stereotype.Service;

@Service
public class ServicioBorrarPersona {

    private static final String MENSAJE_NO_ESXISTE = "El usuario que intenta eliminar no se encuentra registrado";
    private final RepositorioPersona repositorioPersona;

    public ServicioBorrarPersona(RepositorioPersona repositorioPersona) {
        this.repositorioPersona = repositorioPersona;
    }

    public boolean borrar(String documentoIdentidad){
        if(this.repositorioPersona.consultarPorId(documentoIdentidad) == null){
            throw new IllegalArgumentException(MENSAJE_NO_ESXISTE);
        }

        return this.repositorioPersona.borrar(documentoIdentidad);
    }
}
