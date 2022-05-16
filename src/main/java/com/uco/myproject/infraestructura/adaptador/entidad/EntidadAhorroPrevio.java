package com.uco.myproject.infraestructura.adaptador.entidad;

import javax.persistence.*;

@Entity
@Table(name = "ahorroprevio")
public class EntidadAhorroPrevio {

    @Id
    private Long documentoIdentidadJefeHogar;

    private float cuentaAhorroProgramado;
    private float cesantias;
    private float subsidioCajaCompesacion;

    public EntidadAhorroPrevio(Long documentoIdentidadJefeHogar,float cuentaAhorroProgramado, float cesantias, float subsidioCajaCompesacion) {
        this.documentoIdentidadJefeHogar = documentoIdentidadJefeHogar;
        this.cuentaAhorroProgramado = cuentaAhorroProgramado;
        this.cesantias = cesantias;
        this.subsidioCajaCompesacion = subsidioCajaCompesacion;
    }

    public EntidadAhorroPrevio() {

    }

    public float getCuentaAhorroProgramado() {
        return cuentaAhorroProgramado;
    }

    public void setCuentaAhorroProgramado(float cuentaAhorroProgramado) {
        this.cuentaAhorroProgramado = cuentaAhorroProgramado;
    }

    public float getCesantias() {
        return cesantias;
    }

    public void setCesantias(float cesantias) {
        this.cesantias = cesantias;
    }

    public float getSubsidioCajaCompesacion() {
        return subsidioCajaCompesacion;
    }

    public void setSubsidioCajaCompesacion(float subsidioCajaCompesacion) {
        this.subsidioCajaCompesacion = subsidioCajaCompesacion;
    }

    public Long getDocumentoIdentidadJefeHogar() {
        return documentoIdentidadJefeHogar;
    }

    public void setDocumentoIdentidadJefeHogar(Long documentoIdentidadJefeHogar) {
        this.documentoIdentidadJefeHogar = documentoIdentidadJefeHogar;
    }
}
