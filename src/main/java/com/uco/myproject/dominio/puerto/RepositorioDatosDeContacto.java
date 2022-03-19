package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.DatosDeContacto;

public interface RepositorioDatosDeContacto {

    DatosDeContacto consultarPorId(String codigo);
    Long guardar(DatosDeContacto datosDeContacto);
}
