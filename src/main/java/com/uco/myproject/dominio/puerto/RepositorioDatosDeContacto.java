package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.DatosDeContacto;

public interface RepositorioDatosDeContacto {

    DatosDeContacto consultarPorId(String codigo);
    void guardar(DatosDeContacto datosDeContacto);
}
