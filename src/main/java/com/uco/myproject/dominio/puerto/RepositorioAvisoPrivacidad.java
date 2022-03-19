package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.AvisoPrivacidad;

import java.util.List;

public interface RepositorioAvisoPrivacidad {

    List<AvisoPrivacidad> listar();
    AvisoPrivacidad consultarPorId(String codigo);
    boolean existe(AvisoPrivacidad avisoPrivacidad);
}
