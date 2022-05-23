package com.uco.myproject.aplicacion.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DtoAhorroPrevio {

    private Long documentoIdentidadJefeHogar;
    private float cuentaAhorroProgramado;
    private float cesantias;
    private float subsidioCajaCompesacion;

    public DtoAhorroPrevio(Long documentoIdentidadJefeHogar, float cuentaAhorroProgramado, float cesantias, float subsidioCajaCompesacion) {
        this.documentoIdentidadJefeHogar = documentoIdentidadJefeHogar;
        this.cuentaAhorroProgramado = cuentaAhorroProgramado;
        this.cesantias = cesantias;
        this.subsidioCajaCompesacion = subsidioCajaCompesacion;
    }

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