package com.uco.myproject.aplicacion.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DtoFormulario {

    private Long documentoIdentidadJefeHogar;
    private String clasificacionSisben;
    private boolean poseeDerechosDePropiedad;
    private boolean aceptoJuramento;
    private boolean aceptoAvisoDePrivacidad;
    private String correoElectronico;

    public DtoFormulario(Long documentoIdentidadJefeHogar, String clasificacionSisben, boolean poseeDerechosDePropiedad, boolean aceptoJuramento, boolean aceptoAvisoDePrivacidad, String correoElectronico) {
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

    public boolean isPoseeDerechosDePropiedad() {
        return poseeDerechosDePropiedad;
    }

    public boolean isAceptoJuramento() {
        return aceptoJuramento;
    }

    public boolean isAceptoAvisoDePrivacidad() {
        return aceptoAvisoDePrivacidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public Long getDocumentoIdentidadJefeHogar() {
        return documentoIdentidadJefeHogar;
    }
}
