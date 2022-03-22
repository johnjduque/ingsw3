package com.uco.myproject.dominio.dto;

import java.util.Date;

public class DtoPersonaResumen {

    private String codigo;
    private int documentoIdentidad;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private int ingresoMensual;
    private DtoTipoDeDocumentoResumen tipoDeDocumento;
    private DtoGeneroResumen genero;
    private DtoEstadoCivilResumen estadoCivil;
    private DtoCondicionEspecialMedicaResumen condicionEspecialMedica;
    private DtoCondicionEspecialSocioeconomicaResumen condicionEspecialSocioeconomica;
    private DtoTipoDePostulanteResumen tipoDePostulante;
    private DtoOcupacionResumen ocupacion;
    private DtoOrientacionSexualResumen orientacionSexual;
    private DtoDatosDeContactoResumen datosDeContacto;

    public DtoPersonaResumen(String codigo, int documentoIdentidad, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento, int ingresoMensual, DtoTipoDeDocumentoResumen tipoDeDocumento, DtoGeneroResumen genero, DtoEstadoCivilResumen estadoCivil, DtoCondicionEspecialMedicaResumen condicionEspecialMedica, DtoCondicionEspecialSocioeconomicaResumen condicionEspecialSocioeconomica, DtoTipoDePostulanteResumen tipoDePostulante, DtoOcupacionResumen ocupacion, DtoOrientacionSexualResumen orientacionSexual, DtoDatosDeContactoResumen datosDeContacto) {
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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(int documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(int ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public DtoTipoDeDocumentoResumen getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(DtoTipoDeDocumentoResumen tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public DtoGeneroResumen getGenero() {
        return genero;
    }

    public void setGenero(DtoGeneroResumen genero) {
        this.genero = genero;
    }

    public DtoEstadoCivilResumen getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(DtoEstadoCivilResumen estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public DtoCondicionEspecialMedicaResumen getCondicionEspecialMedica() {
        return condicionEspecialMedica;
    }

    public void setCondicionEspecialMedica(DtoCondicionEspecialMedicaResumen condicionEspecialMedica) {
        this.condicionEspecialMedica = condicionEspecialMedica;
    }

    public DtoCondicionEspecialSocioeconomicaResumen getCondicionEspecialSocioeconomica() {
        return condicionEspecialSocioeconomica;
    }

    public void setCondicionEspecialSocioeconomica(DtoCondicionEspecialSocioeconomicaResumen condicionEspecialSocioeconomica) {
        this.condicionEspecialSocioeconomica = condicionEspecialSocioeconomica;
    }

    public DtoTipoDePostulanteResumen getTipoDePostulante() {
        return tipoDePostulante;
    }

    public void setTipoDePostulante(DtoTipoDePostulanteResumen tipoDePostulante) {
        this.tipoDePostulante = tipoDePostulante;
    }

    public DtoOcupacionResumen getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(DtoOcupacionResumen ocupacion) {
        this.ocupacion = ocupacion;
    }

    public DtoOrientacionSexualResumen getOrientacionSexual() {
        return orientacionSexual;
    }

    public void setOrientacionSexual(DtoOrientacionSexualResumen orientacionSexual) {
        this.orientacionSexual = orientacionSexual;
    }

    public DtoDatosDeContactoResumen getDatosDeContacto() {
        return datosDeContacto;
    }

    public void setDatosDeContacto(DtoDatosDeContactoResumen datosDeContacto) {
        this.datosDeContacto = datosDeContacto;
    }
}
