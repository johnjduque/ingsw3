package com.uco.myproject.aplicacion.servicio.formulario;

import com.uco.myproject.aplicacion.dto.DtoAhorroPrevio;
import com.uco.myproject.aplicacion.dto.DtoFormulario;
import com.uco.myproject.aplicacion.dto.DtoPersona;
import com.uco.myproject.dominio.modelo.AhorroPrevio;
import com.uco.myproject.dominio.modelo.Formulario;
import com.uco.myproject.dominio.modelo.Persona;
import com.uco.myproject.dominio.servicio.formulario.ServicioGuardarFormulario;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class ServicioAplicacionGuardarFormulario {

    private final ServicioGuardarFormulario servicioGuardarFormulario;

    public ServicioAplicacionGuardarFormulario(ServicioGuardarFormulario servicioGuardarFormulario) {
        this.servicioGuardarFormulario = servicioGuardarFormulario;
    }

    public void guardar(DtoFormulario formulario){
        this.servicioGuardarFormulario.ejecutar(ensamblarFormulario(formulario));
    }

    private Formulario ensamblarFormulario(DtoFormulario formulario){
        return Formulario.of(formulario.getDocumentoIdentidadJefeHogar(),ensamblarPersonas(formulario.getPersonas()),formulario.getClasificacionSisben(),
                formulario.isPoseeDerechosDePropiedad(),formulario.isAceptoJuramento(),formulario.isAceptoAvisoDePrivacidad(),
                formulario.getCorreoElectronico(),ensamblarAhorroPrevio(formulario.getAhorroPrevio()));
    }

    private AhorroPrevio ensamblarAhorroPrevio(DtoAhorroPrevio ahorroPrevio){
        return AhorroPrevio.of(ahorroPrevio.getDocumentoIdentidadJefeHogar(),ahorroPrevio.getCuentaAhorroProgramado(),ahorroPrevio.getCesantias(),
                ahorroPrevio.getSubsidioCajaCompesacion());
    }

    private List<Persona> ensamblarPersonas(List<DtoPersona> personas){
        return personas.stream().map(this::ensamblarPersona).toList();
    }

    private Persona ensamblarPersona(DtoPersona persona){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(persona.getFechaNacimiento(), format);
        return Persona.of(persona.getDocumentoIdentidad(),persona.getPrimerNombre(),persona.getSegundoNombre(),
                persona.getPrimerApellido(),persona.getSegundoApellido(),fechaNacimiento,persona.getIngresoMensual());
    }
}
