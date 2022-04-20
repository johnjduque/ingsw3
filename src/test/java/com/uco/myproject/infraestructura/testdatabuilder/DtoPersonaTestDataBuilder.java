package com.uco.myproject.infraestructura.testdatabuilder;

import com.uco.myproject.aplicacion.dto.*;
import com.uco.myproject.dominio.modelo.*;
import com.uco.myproject.dominio.testdatabuilder.PersonaTestDataBuilder;

import java.util.Date;

public class DtoPersonaTestDataBuilder {

    private String codigo;
    private int documentoIdentidad;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private int ingresoMensual;

    public DtoPersonaTestDataBuilder() {
        this.codigo = "1";
        this.documentoIdentidad = 1036936749;
        this.primerNombre = "John";
        this.segundoNombre = "";
        this.primerApellido = "Duque";
        this.segundoApellido = "";
        this.fechaNacimiento = new Date();
        this.ingresoMensual = 1000000;
    }

    public DtoPersonaTestDataBuilder conCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public DtoPersonaTestDataBuilder conNombre(String primerNombre){
        this.primerNombre = primerNombre;
        return this;
    }

    public DtoPersonaTestDataBuilder conApellido(String primerApellido){
        this.primerApellido = primerApellido;
        return this;
    }

    public DtoPersonaTestDataBuilder conIngresoMensual(int ingresoMensual){
        this.ingresoMensual = ingresoMensual;
        return this;
    }
}
