package com.uco.myproject.dominio.dto;

public class DtoDatosDeContactoResumen {

    private String codigo;
    private String numeroFijo;
    private String numeroCelular;
    private String correoElectronico;

    public DtoDatosDeContactoResumen() {
    }

    public DtoDatosDeContactoResumen(String codigo, String numeroFijo, String numeroCelular, String correoElectronico) {
        this.codigo = codigo;
        this.numeroFijo = numeroFijo;
        this.numeroCelular = numeroCelular;
        this.correoElectronico = correoElectronico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumeroFijo() {
        return numeroFijo;
    }

    public void setNumeroFijo(String numeroFijo) {
        this.numeroFijo = numeroFijo;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
