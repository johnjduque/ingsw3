package com.uco.myproject.dominio.modelo;

import com.uco.myproject.dominio.validarobligatorio.*;

import java.util.List;

public class Formulario {

    private Long documentoIdentidadJefeHogar;
    private String clasificacionSisben;
    private boolean poseeDerechosDePropiedad;
    private boolean aceptoJuramento;
    private boolean aceptoAvisoDePrivacidad;
    private String correoElectronico;

    public static Formulario of(Long documentoIdentidadJefeHogar, String clasificacionSisben, boolean poseeDerechosDePropiedad, boolean aceptoJuramento, boolean aceptoAvisoDePrivacidad, String correoElectronico){
        ValidarNumero.validarObligatorioNumero(documentoIdentidadJefeHogar,"La identificacion no puede ser vacía o menor a cero");
        ValidarTexto.validarObligatorioTexto(clasificacionSisben,"Sino posee clasificacion del sisben, no se puede postular");
        ValidarCumpleONoCumple.validarObligatorioPoseeDerechosDePropiedad(poseeDerechosDePropiedad,"Posee derechos de propiedad y no puede continuar la postulación");
        ValidarCumpleONoCumple.validarObligatorioaceptoJuramento(aceptoJuramento,"Es obligatorio aceptar el juramento");
        ValidarCumpleONoCumple.validarObligatorioaceptoAvisoDePrivacidad(aceptoAvisoDePrivacidad,"Es obligario aceptar el tratamiento de datos personales");
        ValidarEmail.validarObligatorioEmail(correoElectronico,"El correo electronico ingresado no es válido");

        return new Formulario(documentoIdentidadJefeHogar,clasificacionSisben,poseeDerechosDePropiedad,aceptoJuramento,aceptoAvisoDePrivacidad,correoElectronico);
    }

    public Formulario() {
    }

    public Formulario(Long documentoIdentidadJefeHogar, String clasificacionSisben, boolean poseeDerechosDePropiedad, boolean aceptoJuramento, boolean aceptoAvisoDePrivacidad, String correoElectronico) {
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
