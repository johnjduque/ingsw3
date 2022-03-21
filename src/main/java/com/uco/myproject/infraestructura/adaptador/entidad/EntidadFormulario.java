package com.uco.myproject.infraestructura.adaptador.entidad;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Formulario")
public class EntidadFormulario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String codigo;
    @ManyToOne
    @JoinColumn(name = "Persona")
    private List<EntidadPersona> personas;
    private int clasificacionSisben;
    private boolean poseeDerechosDePropiedad;
    private boolean aceptoJurmento;
    private boolean aceptoAvisoPrivacidad;
    @OneToOne
    @JoinColumn(name = "RecursosComplementarios")
    private EntidadRecursosComplementarios recursosComplementarios;
    @OneToOne
    @JoinColumn(name = "AhorroPrevio")
    private EntidadAhorroPrevio ahorroPrevio;

    public EntidadFormulario() {
    }

    public EntidadFormulario(String codigo, List<EntidadPersona> personas, int clasificacionSisben, boolean poseeDerechosDePropiedad, boolean aceptoJurmento, boolean aceptoAvisoPrivacidad, EntidadRecursosComplementarios recursosComplementarios, EntidadAhorroPrevio ahorroPrevio) {
        this.codigo = codigo;
        this.personas = personas;
        this.clasificacionSisben = clasificacionSisben;
        this.poseeDerechosDePropiedad = poseeDerechosDePropiedad;
        this.aceptoJurmento = aceptoJurmento;
        this.aceptoAvisoPrivacidad = aceptoAvisoPrivacidad;
        this.recursosComplementarios = recursosComplementarios;
        this.ahorroPrevio = ahorroPrevio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<EntidadPersona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<EntidadPersona> personas) {
        this.personas = personas;
    }

    public int getClasificacionSisben() {
        return clasificacionSisben;
    }

    public void setClasificacionSisben(int clasificacionSisben) {
        this.clasificacionSisben = clasificacionSisben;
    }

    public boolean isPoseeDerechosDePropiedad() {
        return poseeDerechosDePropiedad;
    }

    public void setPoseeDerechosDePropiedad(boolean poseeDerechosDePropiedad) {
        this.poseeDerechosDePropiedad = poseeDerechosDePropiedad;
    }

    public boolean isAceptoJurmento() {
        return aceptoJurmento;
    }

    public void setAceptoJurmento(boolean aceptoJurmento) {
        this.aceptoJurmento = aceptoJurmento;
    }

    public boolean isAceptoAvisoPrivacidad() {
        return aceptoAvisoPrivacidad;
    }

    public void setAceptoAvisoPrivacidad(boolean aceptoAvisoPrivacidad) {
        this.aceptoAvisoPrivacidad = aceptoAvisoPrivacidad;
    }

    public EntidadRecursosComplementarios getRecursosComplementarios() {
        return recursosComplementarios;
    }

    public void setRecursosComplementarios(EntidadRecursosComplementarios recursosComplementarios) {
        this.recursosComplementarios = recursosComplementarios;
    }

    public EntidadAhorroPrevio getAhorroPrevio() {
        return ahorroPrevio;
    }

    public void setAhorroPrevio(EntidadAhorroPrevio ahorroPrevio) {
        this.ahorroPrevio = ahorroPrevio;
    }
}
