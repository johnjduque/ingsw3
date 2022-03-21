package com.uco.myproject.infraestructura.adaptador.entidad;

import javax.persistence.*;

@Entity
@Table(name = "Persona")
public class EntidadPersona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String codigo;
    private int documentoIdentidad;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String fechaNacimiento;
    private int ingresoMensual;
    @OneToOne
    @JoinColumn(name = "TipoDeDocumento")
    private EntidadTipoDeDocumento tipoDeDocumento;
    @OneToOne
    @JoinColumn(name = "Genero")
    private EntidadGenero entidadGenero;
    @OneToOne
    @JoinColumn(name = "EstadoCivil")
    private EntidadEstadoCivil estadoCivil;
    @OneToOne
    @JoinColumn(name = "CondicionEspecialMedica")
    private EntidadCondicionEspecialMedica condicionEspecialMedica;
    @OneToOne
    @JoinColumn(name = "CondicionEspecialSocioeconomica")
    private EntidadCondicionEspecialSocioeconomica condicionEspecialSocioeconomica;
    @OneToOne
    @JoinColumn(name = "TipoDePostulante")
    private EntidadTipoDePostulante entidadTipoDePostulante;
    @OneToOne
    @JoinColumn(name = "Ocupacion")
    private EntidadOcupacion ocupacion;
    @OneToOne
    @JoinColumn(name = "OrientacionSexual")
    private EntidadOrientacionSexual orientacionSexual;
    @OneToOne
    @JoinColumn(name = "DatosDeContacto")
    private EntidadDatosDeContacto datosDeContacto;

    public EntidadPersona() {
    }

    public EntidadPersona(String codigo, int documentoIdentidad, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String fechaNacimiento, int ingresoMensual, EntidadTipoDeDocumento tipoDeDocumento, EntidadGenero entidadGenero, EntidadEstadoCivil estadoCivil, EntidadCondicionEspecialMedica condicionEspecialMedica, EntidadCondicionEspecialSocioeconomica condicionEspecialSocioeconomica, EntidadTipoDePostulante entidadTipoDePostulante, EntidadOcupacion ocupacion, EntidadOrientacionSexual orientacionSexual, EntidadDatosDeContacto datosDeContacto) {
        this.codigo = codigo;
        this.documentoIdentidad = documentoIdentidad;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.ingresoMensual = ingresoMensual;
        this.tipoDeDocumento = tipoDeDocumento;
        this.entidadGenero = entidadGenero;
        this.estadoCivil = estadoCivil;
        this.condicionEspecialMedica = condicionEspecialMedica;
        this.condicionEspecialSocioeconomica = condicionEspecialSocioeconomica;
        this.entidadTipoDePostulante = entidadTipoDePostulante;
        this.ocupacion = ocupacion;
        this.orientacionSexual = orientacionSexual;
        this.datosDeContacto = datosDeContacto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(int documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(int ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public EntidadTipoDeDocumento getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(EntidadTipoDeDocumento tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public EntidadGenero getEntidadGenero() {
        return entidadGenero;
    }

    public void setEntidadGenero(EntidadGenero entidadGenero) {
        this.entidadGenero = entidadGenero;
    }

    public EntidadEstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EntidadEstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public EntidadCondicionEspecialMedica getCondicionEspecialMedica() {
        return condicionEspecialMedica;
    }

    public void setCondicionEspecialMedica(EntidadCondicionEspecialMedica condicionEspecialMedica) {
        this.condicionEspecialMedica = condicionEspecialMedica;
    }

    public EntidadCondicionEspecialSocioeconomica getCondicionEspecialSocioeconomica() {
        return condicionEspecialSocioeconomica;
    }

    public void setCondicionEspecialSocioeconomica(EntidadCondicionEspecialSocioeconomica condicionEspecialSocioeconomica) {
        this.condicionEspecialSocioeconomica = condicionEspecialSocioeconomica;
    }

    public EntidadTipoDePostulante getEntidadTipoDePostulante() {
        return entidadTipoDePostulante;
    }

    public void setEntidadTipoDePostulante(EntidadTipoDePostulante entidadTipoDePostulante) {
        this.entidadTipoDePostulante = entidadTipoDePostulante;
    }

    public EntidadOcupacion getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(EntidadOcupacion ocupacion) {
        this.ocupacion = ocupacion;
    }

    public EntidadOrientacionSexual getOrientacionSexual() {
        return orientacionSexual;
    }

    public void setOrientacionSexual(EntidadOrientacionSexual orientacionSexual) {
        this.orientacionSexual = orientacionSexual;
    }

    public EntidadDatosDeContacto getDatosDeContacto() {
        return datosDeContacto;
    }

    public void setDatosDeContacto(EntidadDatosDeContacto datosDeContacto) {
        this.datosDeContacto = datosDeContacto;
    }
}
