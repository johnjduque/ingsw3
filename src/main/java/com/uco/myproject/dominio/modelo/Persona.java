package com.uco.myproject.dominio.modelo;

import java.util.Date;

public class Persona {

    private final String codigo;
    private final int documentoIdentidad;
    private final String primerNombre;
    private final String segundoNombre;
    private final String primerApellido;
    private final String segundoApellido;
    private final Date fechaNacimiento;
    private final int ingresoMensual;
    private final TipoDeDocumento tipoDeDocumento;
    private final Genero genero;
    private final EstadoCivil estadoCivil;
    private final CondicionEspecialMedica condicionEspecialMedica;
    private final CondicionEspecialSocioeconomica condicionEspecialSocioeconomica;
    private final TipoDePostulante tipoDePostulante;
    private final Ocupacion ocupacion;
    private final OrientacionSexual orientacionSexual;
    private final DatosDeContacto datosDeContacto;

    public static Persona of(String codigo, int documentoIdentidad, String primerNombre, String segundoNombre,
                             String primerApellido, String segundoApellido, Date fechaNacimiento,
                             int ingresoMensual, TipoDeDocumento tipoDeDocumento, Genero genero,
                             EstadoCivil estadoCivil, CondicionEspecialMedica condicionEspecialMedica,
                             CondicionEspecialSocioeconomica condicionEspecialSocioeconomica,
                             TipoDePostulante tipoDePostulante, Ocupacion ocupacion,
                             OrientacionSexual orientacionSexual, DatosDeContacto datosDeContacto){
        validarObligatorioTexto(codigo, "El código no puede ser vacío");
        validarObligatorioNumero(documentoIdentidad,"El número de identidad es obligatorio");
        validarObligatorioTexto(primerNombre,"El primer nombre es obligatorio");
        validarObligatorioTexto(primerApellido,"Un apellido es obligatorio");
        validarObligatorioNumero(ingresoMensual,"El ingreso mensual no puede ser vacío");

        return new Persona(codigo,documentoIdentidad,primerNombre,segundoNombre,primerApellido,segundoApellido,
                fechaNacimiento,ingresoMensual,tipoDeDocumento,genero,estadoCivil,condicionEspecialMedica,
                condicionEspecialSocioeconomica,tipoDePostulante,ocupacion,orientacionSexual,datosDeContacto);
    }

    public Persona(String codigo, int documentoIdentidad, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento, int ingresoMensual, TipoDeDocumento tipoDeDocumento, Genero genero, EstadoCivil estadoCivil, CondicionEspecialMedica condicionEspecialMedica, CondicionEspecialSocioeconomica condicionEspecialSocioeconomica, TipoDePostulante tipoDePostulante, Ocupacion ocupacion, OrientacionSexual orientacionSexual, DatosDeContacto datosDeContacto) {
        this.codigo = codigo;
        this.documentoIdentidad = documentoIdentidad;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.ingresoMensual = ingresoMensual;
        this.tipoDeDocumento = tipoDeDocumento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.condicionEspecialMedica = condicionEspecialMedica;
        this.condicionEspecialSocioeconomica = condicionEspecialSocioeconomica;
        this.tipoDePostulante = tipoDePostulante;
        this.ocupacion = ocupacion;
        this.orientacionSexual = orientacionSexual;
        this.datosDeContacto = datosDeContacto;
    }

    private static void validarObligatorioTexto(String valor, String mensaje){
        if(valor == null || valor.isBlank()){
            throw new IllegalArgumentException(mensaje);
        }
    }

    private static void validarObligatorioNumero(int valor, String mensaje){
        if(esNulo(valor)){
            throw new NumberFormatException(mensaje);
        }
    }

    public static <T> boolean esNulo(T objeto){return objeto == null;}

    public String getCodigo() {
        return codigo;
    }

    public int getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getIngresoMensual() {
        return ingresoMensual;
    }

    public TipoDeDocumento getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public Genero getGenero() {
        return genero;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public CondicionEspecialMedica getCondicionEspecialMedica() {
        return condicionEspecialMedica;
    }

    public CondicionEspecialSocioeconomica getCondicionEspecialSocioeconomica() {
        return condicionEspecialSocioeconomica;
    }

    public TipoDePostulante getTipoDePostulante() {
        return tipoDePostulante;
    }

    public Ocupacion getOcupacion() {
        return ocupacion;
    }

    public OrientacionSexual getOrientacionSexual() {
        return orientacionSexual;
    }

    public DatosDeContacto getDatosDeContacto() {
        return datosDeContacto;
    }
}
