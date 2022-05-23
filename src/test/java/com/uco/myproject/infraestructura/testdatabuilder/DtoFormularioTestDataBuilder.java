package com.uco.myproject.infraestructura.testdatabuilder;

import com.uco.myproject.aplicacion.dto.DtoFormulario;
import com.uco.myproject.dominio.modelo.Formulario;
import com.uco.myproject.dominio.testdatabuilder.FormularioTestDataBuilder;

public class DtoFormularioTestDataBuilder {

    private Long documentoIdentidadJefeHogar;
    private String clasificacionSisben;
    private boolean poseeDerechosDePropiedad;
    private boolean aceptoJuramento;
    private boolean aceptoAvisoDePrivacidad;
    private String correoElectronico;

    public DtoFormularioTestDataBuilder() {
        this.documentoIdentidadJefeHogar = 1234567890L;
        this.clasificacionSisben = "A1";
        this.poseeDerechosDePropiedad = false;
        this.aceptoJuramento = true;
        this.aceptoAvisoDePrivacidad = true;
        this.correoElectronico = "john@gmail.com";
    }

    public DtoFormularioTestDataBuilder conDocumentoIdentidadJefeHogar(Long documentoIdentidadJefeHogar){
        this.documentoIdentidadJefeHogar = documentoIdentidadJefeHogar;
        return this;
    }

    public DtoFormularioTestDataBuilder conClasificacionSisben(String clasificacionSisben){
        this.clasificacionSisben = clasificacionSisben;
        return this;
    }

    public DtoFormularioTestDataBuilder conPoseeDerechosDePropiedad(boolean poseeDerechosDePropiedad){
        this.poseeDerechosDePropiedad = poseeDerechosDePropiedad;
        return this;
    }

    public DtoFormularioTestDataBuilder conAceptoJuramento(boolean aceptoJuramento){
        this.aceptoJuramento = aceptoJuramento;
        return this;
    }

    public DtoFormularioTestDataBuilder conAceptoAvisoDePrivacidad(boolean aceptoAvisoDePrivacidad){
        this.aceptoAvisoDePrivacidad = aceptoAvisoDePrivacidad;
        return this;
    }

    public DtoFormularioTestDataBuilder conCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
        return this;
    }

    public DtoFormulario build(){
        return new DtoFormulario(documentoIdentidadJefeHogar,clasificacionSisben,poseeDerechosDePropiedad,aceptoJuramento,aceptoAvisoDePrivacidad,correoElectronico);
    }
}
