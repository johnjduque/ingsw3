package com.uco.myproject.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DtoAhorroPrevio {

    private Long documentoIdentidadJefeHogar;
    private float cuentaAhorroProgramado;
    private float cesantias;
    private float subsidioCajaCompesacion;

    public float getCuentaAhorroProgramado() {
        return cuentaAhorroProgramado;
    }

    public float getCesantias() {
        return cesantias;
    }

    public float getSubsidioCajaCompesacion() {
        return subsidioCajaCompesacion;
    }

    public Long getDocumentoIdentidadJefeHogar() {
        return documentoIdentidadJefeHogar;
    }
}