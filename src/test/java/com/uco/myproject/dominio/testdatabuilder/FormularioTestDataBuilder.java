package com.uco.myproject.dominio.testdatabuilder;

import com.uco.myproject.dominio.modelo.Formulario;

public class FormularioTestDataBuilder {

    private Long documentoIdentidadJefeHogar;
    private String clasificacionSisben;
    private boolean poseeDerechosDePropiedad;
    private boolean aceptoJuramento;
    private boolean aceptoAvisoDePrivacidad;
    private String correoElectronico;

    public FormularioTestDataBuilder() {
        this.documentoIdentidadJefeHogar = 1234567890L;
        this.clasificacionSisben = "A1";
        this.poseeDerechosDePropiedad = false;
        this.aceptoJuramento = true;
        this.aceptoAvisoDePrivacidad = true;
        this.correoElectronico = "john@gmail.com";
    }

    public FormularioTestDataBuilder conDocumentoIdentidadJefeHogar(Long documentoIdentidadJefeHogar){
        this.documentoIdentidadJefeHogar = documentoIdentidadJefeHogar;
        return this;
    }

    public FormularioTestDataBuilder conClasificacionSisben(String clasificacionSisben){
        this.clasificacionSisben = clasificacionSisben;
        return this;
    }

    public FormularioTestDataBuilder conPoseeDerechosDePropiedad(boolean poseeDerechosDePropiedad){
        this.poseeDerechosDePropiedad = poseeDerechosDePropiedad;
        return this;
    }

    public FormularioTestDataBuilder conAceptoJuramento(boolean aceptoJuramento){
        this.aceptoJuramento = aceptoJuramento;
        return this;
    }

    public FormularioTestDataBuilder conAceptoAvisoDePrivacidad(boolean aceptoAvisoDePrivacidad){
        this.aceptoAvisoDePrivacidad = aceptoAvisoDePrivacidad;
        return this;
    }

    public FormularioTestDataBuilder conCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
        return this;
    }

    public Formulario build(){
        return Formulario.of(documentoIdentidadJefeHogar,clasificacionSisben,poseeDerechosDePropiedad,aceptoJuramento,aceptoAvisoDePrivacidad,correoElectronico);
    }
}
