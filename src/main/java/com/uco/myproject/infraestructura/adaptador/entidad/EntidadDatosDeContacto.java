package com.uco.myproject.infraestructura.adaptador.entidad;

public class EntidadDatosDeContacto {

    private String codigo;
    private String numeroFijo;
    private String numeroCeluar;
    private String correoElectronico;

    public EntidadDatosDeContacto() {
    }

    public EntidadDatosDeContacto(String codigo, String numeroFijo, String numeroCeluar, String correoElectronico) {
        this.codigo = codigo;
        this.numeroFijo = numeroFijo;
        this.numeroCeluar = numeroCeluar;
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

    public String getNumeroCeluar() {
        return numeroCeluar;
    }

    public void setNumeroCeluar(String numeroCeluar) {
        this.numeroCeluar = numeroCeluar;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
