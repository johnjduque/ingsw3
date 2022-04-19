package com.uco.myproject.aplicacion.dto;

public class DtoAhorroPrevio {

    private String codigo;
    private int cuentaAhorroProgramado;
    private int cesantias;
    private int subsidioCajaCompesacion;

    public DtoAhorroPrevio(String codigo, int cuentaAhorroProgramado, int cesantias, int subsidioCajaCompesacion) {
        this.codigo = codigo;
        this.cuentaAhorroProgramado = cuentaAhorroProgramado;
        this.cesantias = cesantias;
        this.subsidioCajaCompesacion = subsidioCajaCompesacion;
    }

}
