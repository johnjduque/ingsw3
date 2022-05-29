package com.uco.myproject.dominio.testdatabuilder;

import com.uco.myproject.dominio.modelo.Persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonaTestDataBuilder {

    private Long documentoIdentidad;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private LocalDate fechaNacimiento;
    private int ingresoMensual;

    public PersonaTestDataBuilder() {
        this.documentoIdentidad = 1234567890L;
        this.primerNombre = "juan";
        this.segundoNombre = "";
        this.primerApellido = "castaño";
        this.segundoApellido = "";
        this.fechaNacimiento = obtenerFecha("04-02-1990");
        this.ingresoMensual = 1000000;
    }

    private LocalDate obtenerFecha (String fecha){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fecha, format);

        return fechaNacimiento;
    }

    public PersonaTestDataBuilder conDcumentoIdentidad(Long documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
        return this;
    }

    public PersonaTestDataBuilder conPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
        return this;
    }

    public PersonaTestDataBuilder conSegundoNombre(String segundoNombre) {
        this.segundoApellido = segundoNombre;
        return this;
    }

    public PersonaTestDataBuilder conPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
        return this;
    }

    public PersonaTestDataBuilder conSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
        return this;
    }

    public PersonaTestDataBuilder conIngresoMensual(int ingresoMensual) {
        this.ingresoMensual =   ingresoMensual;
        return this;
    }

    public Persona build() {
        return Persona.of(documentoIdentidad,primerNombre,segundoNombre,primerApellido,segundoApellido,fechaNacimiento,ingresoMensual);
    }
}
