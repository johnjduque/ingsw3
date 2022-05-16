package com.uco.myproject.dominio.modelo;

import com.uco.myproject.dominio.validarobligatorio.ValidarNumero;
import com.uco.myproject.dominio.validarobligatorio.ValidarObjeto;
import com.uco.myproject.dominio.validarobligatorio.ValidarTexto;

import java.time.LocalDate;

public class Persona {

    private int documentoIdentidad;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private LocalDate fechaNacimiento;
    private int ingresoMensual;

    public static Persona of(int documentoIdentidad, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, LocalDate fechaNacimiento, int ingresoMensual) {
        ValidarNumero.validarObligatorioNumero(documentoIdentidad,"El documento de identidad no puede ser vacío o menor a cero");
        ValidarTexto.validarObligatorioTexto(primerNombre, "El primer nombre no puede ser vacio");
        ValidarTexto.validarObligatorioTexto(primerApellido, "El primer apellido no puede ser vacio");
        ValidarObjeto.validarObjeto(fechaNacimiento,"La fecha de nacimiento es obligatoria");
        ValidarNumero.validarObligatorioNumero(ingresoMensual,"El ingreso mensual no puede ser vacio o menor a cero, sino posee ingreso coloque 0");

        return new Persona(documentoIdentidad,primerNombre,segundoNombre,primerApellido,segundoApellido,fechaNacimiento,ingresoMensual);
    }

    public Persona(int documentoIdentidad, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, LocalDate fechaNacimiento, int ingresoMensual) {
        this.documentoIdentidad = documentoIdentidad;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.ingresoMensual = ingresoMensual;
    }

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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getIngresoMensual() {
        return ingresoMensual;
    }
}
