package com.uco.myproject.dominio.modelo;

public class AvisoPrivacidad {

    private final String codigo;
    private final String descripcionAvisoPrivacidad;

    public static AvisoPrivacidad of(String codigo, String descripcionAvisoPrivacidad){
        validarObligatorioTexto(codigo, "El código no puede ser vacío");
        validarObligatorioTexto(descripcionAvisoPrivacidad, "La descripción no puede ser vacío");

        return new AvisoPrivacidad(codigo,descripcionAvisoPrivacidad);
    }

    public AvisoPrivacidad(String codigo, String descripcionAvisoPrivacidad) {
        this.codigo = codigo;
        this.descripcionAvisoPrivacidad = descripcionAvisoPrivacidad;
    }

    private static void validarObligatorioTexto(String valor, String mensaje){
        if(valor == null || valor.isBlank()){
            throw new IllegalArgumentException(mensaje);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcionAvisoPrivacidad() {
        return descripcionAvisoPrivacidad;
    }
}
