package com.uco.myproject.aplicacion.servicio;

import com.uco.myproject.dominio.servicio.persona.ServicioBorrarPersona;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionBorrarPersona {

    private final ServicioBorrarPersona servicioBorrarPersona;

    public ServicioAplicacionBorrarPersona(ServicioBorrarPersona servicioBorrarPersona) {
        this.servicioBorrarPersona = servicioBorrarPersona;
    }

    public void borrar(String codigo){
        this.servicioBorrarPersona.borrar(codigo);
    }
}
