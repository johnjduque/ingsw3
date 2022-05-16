package com.uco.myproject.dominio.testdatabuilder;

import com.uco.myproject.dominio.modelo.AhorroPrevio;

public class AhorroPrevioTestDataBuilder {

    private Long documentoIdentidadJefeHogar;
    private float cuentaAhorroProgramado;
    private float cesantias;
    private float subsidioCajaCompesacion;

    public AhorroPrevioTestDataBuilder() {
        this.documentoIdentidadJefeHogar = 1234567890L;
        this.cuentaAhorroProgramado = 1000000;
        this.cesantias = 1500000;
        this.subsidioCajaCompesacion = 25000000;
    }

    public AhorroPrevioTestDataBuilder conDocumentoIdentidadJefeHogar(Long documentoIdentidadJefeHogar){
        this.documentoIdentidadJefeHogar = documentoIdentidadJefeHogar;
        return this;
    }

    public AhorroPrevioTestDataBuilder conCuentaAhorroProgramado(float cuentaAhorroProgramado){
        this.cuentaAhorroProgramado = cuentaAhorroProgramado;
        return this;
    }

    public AhorroPrevioTestDataBuilder conCesantias(float cesantias){
        this.cesantias = cesantias;
        return this;
    }

    public AhorroPrevioTestDataBuilder consubsidioCajaCompesacion(float subsidioCajaCompesacion){
        this.subsidioCajaCompesacion = subsidioCajaCompesacion;
        return this;
    }

    public AhorroPrevio build(){return AhorroPrevio.of(documentoIdentidadJefeHogar,
            cuentaAhorroProgramado,cesantias,subsidioCajaCompesacion);}
}
