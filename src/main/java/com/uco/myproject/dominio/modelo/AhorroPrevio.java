package com.uco.myproject.dominio.modelo;

public record AhorroPrevio(String codigo, int cuentaAhorroProgramado, int cesantias,
                           int subsidioCajaCompesacion) {

    public static AhorroPrevio of(String codigo, int cuentaAhorroProgramado, int cesantias, int subsidioCajaCompesacion) {
        validarObligatorioTexto(codigo, "El código no puede ser vacío");
        validarObligatorioNumero(cuentaAhorroProgramado, "La cuenta de Ahorro programado no puede ser vacío");
        validarObligatorioNumero(cesantias, "Las cesantías no pueden ser vacías");
        validarObligatorioNumero(subsidioCajaCompesacion, "El subsidio de la caja de compesación dno puede ser vacía");

        return new AhorroPrevio(codigo, cuentaAhorroProgramado, cesantias, subsidioCajaCompesacion);
    }

    private static void validarObligatorioTexto(String valor, String mensaje) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    private static void validarObligatorioNumero(int valor, String mensaje) {
        if (esNulo(valor)) {
            throw new NumberFormatException(mensaje);
        }
    }

    public static <T> boolean esNulo(T objeto) {
        return objeto == null;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCuentaAhorroProgramado() {
        return cuentaAhorroProgramado;
    }

    public int getCesantias() {
        return cesantias;
    }

    public int getSubsidioCajaCompesacion() {
        return subsidioCajaCompesacion;
    }

}
