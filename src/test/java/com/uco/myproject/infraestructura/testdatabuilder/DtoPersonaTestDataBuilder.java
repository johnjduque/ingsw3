package com.uco.myproject.infraestructura.testdatabuilder;

import com.uco.myproject.aplicacion.dto.DtoPersona;

public class DtoPersonaTestDataBuilder {

    private int documentoIdentidad;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String fechaNacimiento;
    private int ingresoMensual;

    public DtoPersonaTestDataBuilder() {
        this.documentoIdentidad = 1234567890;
        this.primerNombre = "juan";
        this.segundoNombre = "";
        this.primerApellido = "castaño";
        this.segundoApellido = "";
        this.fechaNacimiento = String.valueOf(1900/04/02);
        this.ingresoMensual = 1000000;
    }

    public DtoPersonaTestDataBuilder conDcumentoIdentidad(int documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
        return this;
    }

    public DtoPersonaTestDataBuilder conPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
        return this;
    }

    public DtoPersonaTestDataBuilder conSegundoNombre(String segundoNombre) {
        this.segundoApellido = segundoNombre;
        return this;
    }

    public DtoPersonaTestDataBuilder conPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
        return this;
    }

    public DtoPersonaTestDataBuilder conSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
        return this;
    }

    public DtoPersonaTestDataBuilder conIngresoMensual(int ingresoMensual) {
        this.ingresoMensual =   ingresoMensual;
        return this;
    }

    public DtoPersona build() {

        return new DtoPersona(documentoIdentidad,primerNombre,segundoNombre,primerApellido,segundoApellido,fechaNacimiento,ingresoMensual);
    }
}
