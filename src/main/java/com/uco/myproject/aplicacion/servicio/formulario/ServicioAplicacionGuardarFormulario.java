package com.uco.myproject.aplicacion.servicio.formulario;

import com.uco.myproject.aplicacion.dto.DtoFormulario;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.dominio.modelo.Formulario;
import com.uco.myproject.dominio.servicio.formulario.ServicioGuardarFormulario;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarFormulario {

    private final ServicioGuardarFormulario servicioGuardarFormulario;

    public ServicioAplicacionGuardarFormulario(ServicioGuardarFormulario servicioGuardarFormulario) {
        this.servicioGuardarFormulario = servicioGuardarFormulario;
    }

    public DtoRespuesta<Long> guardar(DtoFormulario formulario){

        return new DtoRespuesta<>((Long) servicioGuardarFormulario.ejecutar(ensamblarFormulario(formulario)));
    }

    private Formulario ensamblarFormulario(DtoFormulario formulario){
        return Formulario.of(formulario.getDocumentoIdentidadJefeHogar(),formulario.getClasificacionSisben(),
                formulario.isPoseeDerechosDePropiedad(),formulario.isAceptoJuramento(),formulario.isAceptoAvisoDePrivacidad(),
                formulario.getCorreoElectronico());
    }
}
