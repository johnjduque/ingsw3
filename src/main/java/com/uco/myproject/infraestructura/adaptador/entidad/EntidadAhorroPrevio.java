package com.uco.myproject.infraestructura.adaptador.entidad;

public class EntidadAhorroPrevio {

    private String codigo;
    private int cuentaAhorroProgramado;
    private int cesantias;
    private int subsidioCajaCompesacion;

    public EntidadAhorroPrevio(String codigo, int cuentaAhorroProgramado, int cesantias, int subsidioCajaCompesacion) {
        this.codigo = codigo;
        this.cuentaAhorroProgramado = cuentaAhorroProgramado;
        this.cesantias = cesantias;
        this.subsidioCajaCompesacion = subsidioCajaCompesacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCuentaAhorroProgramado() {
        return cuentaAhorroProgramado;
    }

    public void setCuentaAhorroProgramado(int cuentaAhorroProgramado) {
        this.cuentaAhorroProgramado = cuentaAhorroProgramado;
    }

    public int getCesantias() {
        return cesantias;
    }

    public void setCesantias(int cesantias) {
        this.cesantias = cesantias;
    }

    public int getSubsidioCajaCompesacion() {
        return subsidioCajaCompesacion;
    }

    public void setSubsidioCajaCompesacion(int subsidioCajaCompesacion) {
        this.subsidioCajaCompesacion = subsidioCajaCompesacion;
    }
}
