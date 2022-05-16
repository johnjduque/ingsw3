package com.uco.myproject.dominio.modelo;

import com.uco.myproject.dominio.validarobligatorio.ValidarNumero;

public class AhorroPrevio{

    private Long documentoIdentidadJefeHogar;
    private float cuentaAhorroProgramado;
    private float cesantias;
    private float subsidioCajaCompesacion;

    public static AhorroPrevio of(Long documentoIdentidadJefeHogar,float cuentaAhorroProgramado, float cesantias, float subsidioCajaCompesacion) {
        ValidarNumero.validarObligatorioNumero(documentoIdentidadJefeHogar,"La identificacion no puede ser vacía o menor a cero");
        ValidarNumero.validarObligatorioNumero(cuentaAhorroProgramado, "La cuenta de Ahorro programado no puede ser vacío o menor a cero");
        ValidarNumero.validarObligatorioNumero(cesantias, "Las cesantías no pueden ser vacías o menor a cero");
        ValidarNumero.validarObligatorioNumero(subsidioCajaCompesacion, "El subsidio de la caja de compesación dno puede ser vacía o menor a cero");

        return new AhorroPrevio(documentoIdentidadJefeHogar,cuentaAhorroProgramado, cesantias, subsidioCajaCompesacion);
    }

    public AhorroPrevio(Long documentoIdentidadJefeHogar,float cuentaAhorroProgramado, float cesantias, float subsidioCajaCompesacion) {
        this.documentoIdentidadJefeHogar = documentoIdentidadJefeHogar;
        this.cuentaAhorroProgramado = cuentaAhorroProgramado;
        this.cesantias = cesantias;
        this.subsidioCajaCompesacion = subsidioCajaCompesacion;
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

    public Long getDocumentoIdentidadJefeHogar() {
        return documentoIdentidadJefeHogar;
    }
}
