package com.uco.myproject.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DtoFormulario {

    private Long documentoIdentidadJefeHogar;
    private String clasificacionSisben;
    private boolean poseeDerechosDePropiedad;
    private boolean aceptoJuramento;
    private boolean aceptoAvisoDePrivacidad;
    private String correoElectronico;

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
