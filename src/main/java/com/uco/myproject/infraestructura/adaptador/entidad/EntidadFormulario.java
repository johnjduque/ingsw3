package com.uco.myproject.infraestructura.adaptador.entidad;

import javax.persistence.*;
import java.util.List;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<EntidadPersona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<EntidadPersona> personas) {
        this.personas = personas;
    }

    public String getClasificacionSisben() {
        return clasificacionSisben;
    }

    public void setClasificacionSisben(String clasificacionSisben) {
        this.clasificacionSisben = clasificacionSisben;
    }

    public boolean isPoseeDerechosDePropiedad() {
        return poseeDerechosDePropiedad;
    }

    public void setPoseeDerechosDePropiedad(boolean poseeDerechosDePropiedad) {
        this.poseeDerechosDePropiedad = poseeDerechosDePropiedad;
    }

    public boolean isAceptoJuramento() {
        return aceptoJuramento;
    }

    public void setAceptoJuramento(boolean aceptoJuramento) {
        this.aceptoJuramento = aceptoJuramento;
    }

    public boolean isAceptoAvisoDePrivacidad() {
        return aceptoAvisoDePrivacidad;
    }

    public void setAceptoAvisoDePrivacidad(boolean aceptoAvisoDePrivacidad) {
        this.aceptoAvisoDePrivacidad = aceptoAvisoDePrivacidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public EntidadAhorroPrevio getAhorroPrevio() {
        return ahorroPrevio;
    }

    public void setAhorroPrevio(EntidadAhorroPrevio ahorroPrevio) {
        this.ahorroPrevio = ahorroPrevio;
    }
}
