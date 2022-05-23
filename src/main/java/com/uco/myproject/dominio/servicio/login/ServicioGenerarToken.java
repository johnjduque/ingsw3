package com.uco.myproject.dominio.servicio.login;

import java.util.List;

public interface ServicioGenerarToken {

    String ejecutar(String usuario, List<String> roles);
}
