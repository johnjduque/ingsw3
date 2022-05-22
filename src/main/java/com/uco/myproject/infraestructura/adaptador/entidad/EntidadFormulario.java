package com.uco.myproject.infraestructura.adaptador.entidad;

import javax.persistence.*;

@Entity
@Table(name = "formulario")
public class EntidadFormulario {

    @Id
    private Long documentoIdentidadJefeHogar;

    private String clasificacionSisben;
    private boolean poseeDerechosDePropiedad;
    private boolean aceptoJuramento;
    private boolean aceptoAvisoDePrivacidad;
    private String correoElectronico;

    public EntidadFormulario() {
    }

    public EntidadFormulario(Long documentoIdentidadJefeHogar, String clasificacionSisben, boolean poseeDerechosDePropiedad, boolean aceptoJuramento, boolean aceptoAvisoDePrivacidad, String correoElectronico) {
        this.documentoIdentidadJefeHogar = documentoIdentidadJefeHogar;
        this.clasificacionSisben = clasificacionSisben;
        this.poseeDerechosDePropiedad = poseeDerechosDePropiedad;
        this.aceptoJuramento = aceptoJuramento;
        this.aceptoAvisoDePrivacidad = aceptoAvisoDePrivacidad;
        this.correoElectronico = correoElectronico;
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

    public Long getDocumentoIdentidadJefeHogar() {
        return documentoIdentidadJefeHogar;
    }

    public void setDocumentoIdentidadJefeHogar(Long documentoIdentidadJefeHogar) {
        this.documentoIdentidadJefeHogar = documentoIdentidadJefeHogar;
    }
}
