package com.uco.myproject.dominio.testdatabuilder;

import com.uco.myproject.aplicacion.dto.*;
import com.uco.myproject.dominio.modelo.*;
import org.aspectj.weaver.ast.Or;

import java.util.Date;

public class PersonaTestDataBuilder {

    private String codigo;
    private int documentoIdentidad;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private int ingresoMensual;
    private TipoDeDocumento tipoDeDocumento;
    private Genero genero;
    private EstadoCivil estadoCivil;
    private CondicionEspecialMedica condicionEspecialMedica;
    private CondicionEspecialSocioeconomica condicionEspecialSocioeconomica;
    private TipoDePostulante tipoDePostulante;
    private Ocupacion ocupacion;
    private OrientacionSexual orientacionSexual;
    private DatosDeContacto datosDeContacto;

    public PersonaTestDataBuilder() {
        this.codigo = "1";
        this.documentoIdentidad = 1036936749;
        this.primerNombre = "John";
        this.segundoNombre = "";
        this.primerApellido = "Duque";
        this.segundoApellido = "";
        this.fechaNacimiento = new Date();
        this.ingresoMensual = 1000000;
        this.tipoDeDocumento = new TipoDeDocumento("1","cédula");
        this.genero = new Genero("1","femenino");
        this.estadoCivil = new EstadoCivil("1","casado");
        this.condicionEspecialMedica = new CondicionEspecialMedica("1","discapacitado");
        this.condicionEspecialSocioeconomica = new CondicionEspecialSocioeconomica("1","cabeza madre de hogar");
        this.tipoDePostulante = new TipoDePostulante("1","jefe de hogar");
        this.ocupacion = new Ocupacion("1","empleado");
        this.orientacionSexual = new OrientacionSexual("1","heterosexual");
        this.datosDeContacto = new DatosDeContacto("1","6046150151","3207123838","jduque@rionegro.gov.co");
    }

    public PersonaTestDataBuilder conCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public PersonaTestDataBuilder conNombre(String primerNombre){
        this.primerNombre = primerNombre;
        return this;
    }

    public PersonaTestDataBuilder conApellido(String primerApellido){
        this.primerApellido = primerApellido;
        return this;
    }

    public PersonaTestDataBuilder conIngresoMensual(int ingresoMensual){
        this.ingresoMensual = ingresoMensual;
        return this;
    }

    public PersonaTestDataBuilder conTipoDeDocumento(TipoDeDocumento tipoDeDocumento){
        this.tipoDeDocumento = tipoDeDocumento;
        return this;
    }

    public PersonaTestDataBuilder conGenero(Genero genero){
        this.genero = genero;
        return this;
    }

    public PersonaTestDataBuilder conEstadoCivil(EstadoCivil estadoCivil){
        this.estadoCivil = estadoCivil;
        return this;
    }

    public PersonaTestDataBuilder conCondicionEspecialMedica(CondicionEspecialMedica condicionEspecialMedica){
        this.condicionEspecialMedica = condicionEspecialMedica;
        return this;
    }

    public PersonaTestDataBuilder conCondicionEspecialSocioeconimica(CondicionEspecialSocioeconomica condicionEspecialSocioeconomica){
        this.condicionEspecialSocioeconomica = condicionEspecialSocioeconomica;
        return this;
    }

    public PersonaTestDataBuilder conTipoDePostulante(TipoDePostulante tipoDePostulante){
        this.tipoDePostulante = tipoDePostulante;
        return this;
    }

    public PersonaTestDataBuilder conOcupacion(Ocupacion ocupacion){
        this.ocupacion = ocupacion;
        return this;
    }

    public PersonaTestDataBuilder conOrientacionSexual(OrientacionSexual orientacionSexual){
        this.orientacionSexual = orientacionSexual;
        return this;
    }

    public PersonaTestDataBuilder conDatosDeContacto(DatosDeContacto datosDeContacto){
        this.datosDeContacto = datosDeContacto;
        return this;
    }

    public Persona build(){return Persona.of(codigo,documentoIdentidad,primerNombre,segundoNombre,primerApellido,segundoApellido,fechaNacimiento,ingresoMensual,tipoDeDocumento,
            genero,estadoCivil,condicionEspecialMedica,condicionEspecialSocioeconomica,tipoDePostulante,ocupacion,orientacionSexual,datosDeContacto);}

}
