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

    public void borrar(String codigo){
        if(this.repositorioPersona.consultarPorId(codigo) == null){
            throw new IllegalArgumentException(MENSAJE_NO_ESXISTE);
        }

        this.repositorioPersona.borrar(codigo);
    }
}
