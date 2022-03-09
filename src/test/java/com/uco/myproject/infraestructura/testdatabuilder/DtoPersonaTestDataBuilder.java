package com.uco.myproject.infraestructura.testdatabuilder;

import com.uco.myproject.aplicacion.dto.*;
import com.uco.myproject.dominio.modelo.*;
import com.uco.myproject.dominio.testdatabuilder.PersonaTestDataBuilder;

import java.util.Date;

public class DtoPersonaTestDataBuilder {

    private String codigo;
    private int documentoIdentidad;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private int ingresoMensual;
    private DtoTipoDeDocumento tipoDeDocumento;
    private DtoGenero genero;
    private DtoEstadoCivil estadoCivil;
    private DtoCondicionEspecialMedica condicionEspecialMedica;
    private DtoCondicionEspecialSocioeconomica condicionEspecialSocioeconomica;
    private DtoTipoDePostulante tipoDePostulante;
    private DtoOcupacion ocupacion;
    private DtoOrientacionSexual orientacionSexual;
    private DtoDatosDeContacto datosDeContacto;

    public DtoPersonaTestDataBuilder(String codigo, int documentoIdentidad, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento, int ingresoMensual, DtoTipoDeDocumento tipoDeDocumento, DtoGenero genero, DtoEstadoCivil estadoCivil, DtoCondicionEspecialMedica condicionEspecialMedica, DtoCondicionEspecialSocioeconomica condicionEspecialSocioeconomica, DtoTipoDePostulante tipoDePostulante, DtoOcupacion ocupacion, DtoOrientacionSexual orientacionSexual, DtoDatosDeContacto datosDeContacto) {
        this.codigo = "1";
        this.documentoIdentidad = 1036936749;
        this.primerNombre = "John";
        this.segundoNombre = "";
        this.primerApellido = "Duque";
        this.segundoApellido = "";
        this.fechaNacimiento = new Date();
        this.ingresoMensual = 1000000;
        this.tipoDeDocumento = new DtoTipoDeDocumento("1","cédula");
        this.genero = new DtoGenero("1","femenino");
        this.estadoCivil = new DtoEstadoCivil("1","casado");
        this.condicionEspecialMedica = new DtoCondicionEspecialMedica("1","discapacitado");
        this.condicionEspecialSocioeconomica = new DtoCondicionEspecialSocioeconomica("1","cabeza madre de hogar");
        this.tipoDePostulante = new DtoTipoDePostulante("1","jefe de hogar");
        this.ocupacion = new DtoOcupacion("1","empleado");
        this.orientacionSexual = new DtoOrientacionSexual("1","heterosexual");
        this.datosDeContacto = new DtoDatosDeContacto("1","6046150151","3207123838","jduque@rionegro.gov.co");
    }

    public DtoPersonaTestDataBuilder() {

    }

    public DtoPersonaTestDataBuilder conCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public DtoPersonaTestDataBuilder conNombre(String primerNombre){
        this.primerNombre = primerNombre;
        return this;
    }

    public DtoPersonaTestDataBuilder conApellido(String primerApellido){
        this.primerApellido = primerApellido;
        return this;
    }

    public DtoPersonaTestDataBuilder conIngresoMensual(int ingresoMensual){
        this.ingresoMensual = ingresoMensual;
        return this;
    }

    public DtoPersonaTestDataBuilder conTipoDeDocumento(DtoTipoDeDocumento tipoDeDocumento){
        this.tipoDeDocumento = tipoDeDocumento;
        return this;
    }

    public DtoPersonaTestDataBuilder conGenero(DtoGenero genero){
        this.genero = genero;
        return this;
    }

    public DtoPersonaTestDataBuilder conEstadoCivil(DtoEstadoCivil estadoCivil){
        this.estadoCivil = estadoCivil;
        return this;
    }

    public DtoPersonaTestDataBuilder conCondicionEspecialMedica(DtoCondicionEspecialMedica condicionEspecialMedica){
        this.condicionEspecialMedica = condicionEspecialMedica;
        return this;
    }

    public DtoPersonaTestDataBuilder conCondicionEspecialSocioeconimica(DtoCondicionEspecialSocioeconomica condicionEspecialSocioeconomica){
        this.condicionEspecialSocioeconomica = condicionEspecialSocioeconomica;
        return this;
    }

    public DtoPersonaTestDataBuilder conTipoDePostulante(DtoTipoDePostulante tipoDePostulante){
        this.tipoDePostulante = tipoDePostulante;
        return this;
    }

    public DtoPersonaTestDataBuilder conOcupacion(DtoOcupacion ocupacion){
        this.ocupacion = ocupacion;
        return this;
    }

    public DtoPersonaTestDataBuilder conOrientacionSexual(DtoOrientacionSexual orientacionSexual){
        this.orientacionSexual = orientacionSexual;
        return this;
    }

    public DtoPersonaTestDataBuilder conDatosDeContacto(DtoDatosDeContacto datosDeContacto){
        this.datosDeContacto = datosDeContacto;
        return this;
    }

    public DtoPersona build(){return new DtoPersona(codigo,documentoIdentidad,primerNombre,segundoNombre,primerApellido,segundoApellido,fechaNacimiento,ingresoMensual,tipoDeDocumento,
            genero,estadoCivil,condicionEspecialMedica,condicionEspecialSocioeconomica,tipoDePostulante,ocupacion,orientacionSexual,datosDeContacto);}
}
