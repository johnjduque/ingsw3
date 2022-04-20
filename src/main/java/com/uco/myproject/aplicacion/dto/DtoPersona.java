package com.uco.myproject.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DtoPersona {

    private int documentoIdentidad;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String fechaNacimiento;
    private int ingresoMensual;

    public int getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getIngresoMensual() {
        return ingresoMensual;
    }
}
