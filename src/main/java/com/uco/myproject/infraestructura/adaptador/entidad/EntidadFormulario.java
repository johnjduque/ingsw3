package com.uco.myproject.infraestructura.adaptador.entidad;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@Table(name = "formulario")
public class EntidadFormulario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona_id")
    private List<EntidadPersona> personas;
    private String clasificacionSisben;
    private boolean poseeDerechosDePropiedad;
    private boolean aceptoJuramento;
    private boolean aceptoAvisoDePrivacidad;
    private String correoElectronico;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ahorroprevio_id")
    private EntidadAhorroPrevio ahorroPrevio;

    public EntidadFormulario() {
    }

    public EntidadFormulario(Long id, List<EntidadPersona> personas, String clasificacionSisben, boolean poseeDerechosDePropiedad, boolean aceptoJuramento, boolean aceptoAvisoDePrivacidad, String correoElectronico, EntidadAhorroPrevio ahorroPrevio) {
        this.personas = personas;
        this.clasificacionSisben = clasificacionSisben;
        this.poseeDerechosDePropiedad = poseeDerechosDePropiedad;
        this.aceptoJuramento = aceptoJuramento;
        this.aceptoAvisoDePrivacidad = aceptoAvisoDePrivacidad;
        this.correoElectronico = correoElectronico;
        this.ahorroPrevio = ahorroPrevio;
    }

    public EntidadFormulario(List<EntidadPersona> personas, String clasificacionSisben, boolean poseeDerechosDePropiedad, boolean aceptoJuramento, boolean aceptoAvisoDePrivacidad, String correoElectronico, EntidadAhorroPrevio ahorroPrevio) {
        this.personas = personas;
        this.clasificacionSisben = clasificacionSisben;
        this.poseeDerechosDePropiedad = poseeDerechosDePropiedad;
        this.aceptoJuramento = aceptoJuramento;
        this.aceptoAvisoDePrivacidad = aceptoAvisoDePrivacidad;
        this.correoElectronico = correoElectronico;
        this.ahorroPrevio = ahorroPrevio;
    }
}
