package com.uco.myproject.dominio.modelo;

import com.uco.myproject.dominio.validarobligatorio.ValidarNumero;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AhorroPrevio{

    private Long id;
    private float cuentaAhorroProgramado;
    private float cesantias;
    private float subsidioCajaCompesacion;

    public static AhorroPrevio of(float cuentaAhorroProgramado, float cesantias, float subsidioCajaCompesacion) {
        ValidarNumero.validarObligatorioNumero(cuentaAhorroProgramado, "La cuenta de Ahorro programado no puede ser vacío o menor a cero");
        ValidarNumero.validarObligatorioNumero(cesantias, "Las cesantías no pueden ser vacías o menor a cero");
        ValidarNumero.validarObligatorioNumero(subsidioCajaCompesacion, "El subsidio de la caja de compesación dno puede ser vacía o menor a cero");

        return new AhorroPrevio(cuentaAhorroProgramado, cesantias, subsidioCajaCompesacion);
    }

    public AhorroPrevio(float cuentaAhorroProgramado, float esantias, float subsidioCajaCompesacion) {
        this.cuentaAhorroProgramado = cuentaAhorroProgramado;
        this.cesantias = cesantias;
        this.subsidioCajaCompesacion = subsidioCajaCompesacion;
    }

    public Long getId() {
        return id;
    }

    public float getCuentaAhorroProgramado() {
        return cuentaAhorroProgramado;
    }

    public float getCesantias() {
        return cesantias;
    }

    public float getSubsidioCajaCompesacion() {
        return subsidioCajaCompesacion;
    }
}
