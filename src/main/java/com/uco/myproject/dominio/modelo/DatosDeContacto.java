package com.uco.myproject.dominio.modelo;

public record DatosDeContacto(String codigo, String numeroFijo, String numeroCelular,
                              String correoElectronico) {

    public static DatosDeContacto of(String codigo, String numeroFijo, String numeroCelular, String correoElectronico) {
        validarObligatorio(codigo, "El código no puede ser vacío");
        validarObligatorio(numeroFijo, "El número fijo no puede ser vacío, sino tiene fijo coloque celular");
        validarObligatorio(numeroCelular, "El número celular no puede ser vacío");
        validarObligatorio(correoElectronico, "El correo electrónico no puede ser vacío");

        return new DatosDeContacto(codigo, numeroFijo, numeroCelular, correoElectronico);
    }

    private static void validarObligatorio(String valor, String mensaje) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNumeroFijo() {
        return numeroFijo;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}
