package com.uco.myproject.aplicacion.dto;

public class DtoDatosDeContacto {

    private String codigo;
    private String numeroFijo;
    private String numeroCelular;
    private String correoElectronico;

    public DtoDatosDeContacto() {
    }

    public DtoDatosDeContacto(String codigo, String numeroFijo, String numeroCelular, String correoElectronico) {
        this.codigo = codigo;
        this.numeroFijo = numeroFijo;
        this.numeroCelular = numeroCelular;
        this.correoElectronico = correoElectronico;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNumeroFijo() {
        return numeroFijo;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}
