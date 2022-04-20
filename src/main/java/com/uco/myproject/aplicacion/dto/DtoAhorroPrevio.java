package com.uco.myproject.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DtoAhorroPrevio {

    private float CuentaAhorroProgramado;
    private float Cesantias;
    private float SubsidioCajaCompesacion;

    public float getCuentaAhorroProgramado() {
        return CuentaAhorroProgramado;
    }

    public void setCuentaAhorroProgramado(float cuentaAhorroProgramado) {
        CuentaAhorroProgramado = cuentaAhorroProgramado;
    }

    public float getCesantias() {
        return Cesantias;
    }

    public void setCesantias(float cesantias) {
        Cesantias = cesantias;
    }

    public float getSubsidioCajaCompesacion() {
        return SubsidioCajaCompesacion;
    }

    public void setSubsidioCajaCompesacion(float subsidioCajaCompesacion) {
        SubsidioCajaCompesacion = subsidioCajaCompesacion;
    }
}