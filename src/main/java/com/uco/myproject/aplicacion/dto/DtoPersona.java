package com.uco.myproject.aplicacion.dto;

import java.util.Date;

public class DtoPersona {

    private String codigo;
    private int documentoIdentidad;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private int ingresoMensual;
    private DtoTipoDeDocumento tipoDeDocumento;
    private DtoGenero genero;
    private DtoEstadoCivil estadoCivil;
    private DtoCondicionEspecialMedica condicionEspecialMedica;
    private DtoCondicionEspecialSocioeconomica condicionEspecialSocioeconomica;
    private DtoTipoDePostulante tipoDePostulante;
    private DtoOcupacion ocupacion;
    private DtoOrientacionSexual orientacionSexual;
    private DtoDatosDeContacto datosDeContacto;

    public DtoPersona() {
    }

    public DtoPersona(String codigo, int documentoIdentidad, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento, int ingresoMensual, DtoTipoDeDocumento tipoDeDocumento, DtoGenero genero, DtoEstadoCivil estadoCivil, DtoCondicionEspecialMedica condicionEspecialMedica, DtoCondicionEspecialSocioeconomica condicionEspecialSocioeconomica, DtoTipoDePostulante tipoDePostulante, DtoOcupacion ocupacion, DtoOrientacionSexual orientacionSexual, DtoDatosDeContacto datosDeContacto) {
        this.codigo = codigo;
        this.documentoIdentidad = documentoIdentidad;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.ingresoMensual = ingresoMensual;
        this.tipoDeDocumento = tipoDeDocumento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.condicionEspecialMedica = condicionEspecialMedica;
        this.condicionEspecialSocioeconomica = condicionEspecialSocioeconomica;
        this.tipoDePostulante = tipoDePostulante;
        this.ocupacion = ocupacion;
        this.orientacionSexual = orientacionSexual;
        this.datosDeContacto = datosDeContacto;
    }

    public String getCodigo() {
        return codigo;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getIngresoMensual() {
        return ingresoMensual;
    }

    public DtoTipoDeDocumento getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public DtoGenero getGenero() {
        return genero;
    }

    public DtoEstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public DtoCondicionEspecialMedica getCondicionEspecialMedica() {
        return condicionEspecialMedica;
    }

    public DtoCondicionEspecialSocioeconomica getCondicionEspecialSocioeconomica() {
        return condicionEspecialSocioeconomica;
    }
    public DtoTipoDePostulante getTipoDePostulante() {
        return tipoDePostulante;
    }

    public DtoOcupacion getOcupacion() {
        return ocupacion;
    }

    public DtoOrientacionSexual getOrientacionSexual() {
        return orientacionSexual;
    }

    public DtoDatosDeContacto getDatosDeContacto() {
        return datosDeContacto;
    }
}
