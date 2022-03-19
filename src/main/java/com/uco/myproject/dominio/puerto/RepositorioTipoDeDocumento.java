package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.TipoDeDocumento;

import java.util.List;

public interface RepositorioTipoDeDocumento {

    List<TipoDeDocumento> listar();
    TipoDeDocumento consultarPorId(String codigo);
    boolean existe(TipoDeDocumento tipoDeDocumento);
}
