package com.uco.myproject.infraestructura.adaptador.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
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
}
