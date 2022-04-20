package com.uco.myproject.infraestructura.adaptador.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "persona")
public class EntidadPersona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private int documentoIdentidad;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private LocalDate fechaNacimiento;
    private int ingresoMensual;

    public EntidadPersona(int documentoIdentidad, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, LocalDate fechaNacimiento, int ingresoMensual) {
        this.documentoIdentidad = documentoIdentidad;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.ingresoMensual = ingresoMensual;
    }

    public EntidadPersona() {

    }
}
