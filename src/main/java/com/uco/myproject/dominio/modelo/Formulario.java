package com.uco.myproject.dominio.modelo;

import com.uco.myproject.dominio.validarobligatorio.ValidarCumpleONoCumple;
import com.uco.myproject.dominio.validarobligatorio.ValidarEmail;
import com.uco.myproject.dominio.validarobligatorio.ValidarObjeto;
import com.uco.myproject.dominio.validarobligatorio.ValidarTexto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Formulario {

    private Long id;
    private List<Persona> personas;
    private String clasificacionSisben;
    private boolean poseeDerechosDePropiedad;
    private boolean aceptoJuramento;
    private boolean aceptoAvisoDePrivacidad;
    private String correoElectronico;
    private AhorroPrevio ahorroPrevio;

    public static Formulario of(List<Persona> personas, String clasificacionSisben, boolean poseeDerechosDePropiedad, boolean aceptoJuramento, boolean aceptoAvisoDePrivacidad, String correoElectronico, AhorroPrevio ahorroPrevio){
        ValidarTexto.validarObligatorioTexto(clasificacionSisben,"Sino posee clasificacion del sisben, no se puede postular");
        ValidarCumpleONoCumple.validarObligatorioPoseeDerechosDePropiedad(poseeDerechosDePropiedad,"Posee derechos de propiedad y no puede continuar la postulación");
        ValidarCumpleONoCumple.validarObligatorioaceptoJuramento(aceptoJuramento,"Es obligatorio aceptar el juramento");
        ValidarCumpleONoCumple.validarObligatorioaceptoAvisoDePrivacidad(aceptoAvisoDePrivacidad,"Es obligario aceptar el tratamiento de datos personales");
        ValidarEmail.validarObligatorioEmail(correoElectronico,"El correo electronico ingresado no es válido");
        ValidarObjeto.validarObjeto(ahorroPrevio,"Los ahorros previos no pueden ser vacíos o menores de cero");

        return new Formulario(personas,clasificacionSisben,poseeDerechosDePropiedad,aceptoJuramento,aceptoAvisoDePrivacidad,correoElectronico,ahorroPrevio);
    }

    public Formulario() {
    }

    public Formulario(List<Persona> personas, String clasificacionSisben, boolean poseeDerechosDePropiedad, boolean aceptoJuramento, boolean aceptoAvisoDePrivacidad, String correoElectronico, AhorroPrevio ahorroPrevio) {
        this.personas = personas;
        this.clasificacionSisben = clasificacionSisben;
        this.poseeDerechosDePropiedad = poseeDerechosDePropiedad;
        this.aceptoJuramento = aceptoJuramento;
        this.aceptoAvisoDePrivacidad = aceptoAvisoDePrivacidad;
        this.correoElectronico = correoElectronico;
        this.ahorroPrevio = ahorroPrevio;
    }

    public Long getId() {
        return id;
    }

    public List<Persona> getPersonas() {
        return personas;
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

    public AhorroPrevio getAhorroPrevio() {
        return ahorroPrevio;
    }
}
