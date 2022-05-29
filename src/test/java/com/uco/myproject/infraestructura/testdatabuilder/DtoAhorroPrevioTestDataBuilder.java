package com.uco.myproject.infraestructura.testdatabuilder;

import com.uco.myproject.aplicacion.dto.DtoAhorroPrevio;

public class DtoAhorroPrevioTestDataBuilder {

    private Long documentoIdentidadJefeHogar;
    private float cuentaAhorroProgramado;
    private float cesantias;
    private float subsidioCajaCompesacion;

    public DtoAhorroPrevioTestDataBuilder() {
        this.documentoIdentidadJefeHogar = 1234567890L;
        this.cuentaAhorroProgramado = 10.0F;
        this.cesantias = 15.0F;
        this.subsidioCajaCompesacion = 25.0F;
    }

    public DtoAhorroPrevioTestDataBuilder conDocumentoIdentidadJefeHogar(Long documentoIdentidadJefeHogar){
        this.documentoIdentidadJefeHogar = documentoIdentidadJefeHogar;
        return this;
    }

    public DtoAhorroPrevioTestDataBuilder conCuentaAhorroProgramado(float cuentaAhorroProgramado){
        this.cuentaAhorroProgramado = cuentaAhorroProgramado;
        return this;
    }

    public DtoAhorroPrevioTestDataBuilder conCesantias(float cesantias){
        this.cesantias = cesantias;
        return this;
    }

    public DtoAhorroPrevioTestDataBuilder consubsidioCajaCompesacion(float subsidioCajaCompesacion){
        this.subsidioCajaCompesacion = subsidioCajaCompesacion;
        return this;
    }

    public DtoAhorroPrevio build(){
        return new DtoAhorroPrevio(documentoIdentidadJefeHogar,
            cuentaAhorroProgramado,cesantias,subsidioCajaCompesacion);
    }
}

