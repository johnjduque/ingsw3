package com.uco.myproject.infraestructura.adaptador.entidad;

import javax.persistence.*;

@Entity
@Table(name = "ahorroprevio")
public class EntidadAhorroPrevio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private float cuentaAhorroProgramado;
    private float cesantias;
    private float subsidioCajaCompesacion;

    public EntidadAhorroPrevio(float cuentaAhorroProgramado, float cesantias, float subsidioCajaCompesacion) {
        this.cuentaAhorroProgramado = cuentaAhorroProgramado;
        this.cesantias = cesantias;
        this.subsidioCajaCompesacion = subsidioCajaCompesacion;
    }

    public EntidadAhorroPrevio() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
