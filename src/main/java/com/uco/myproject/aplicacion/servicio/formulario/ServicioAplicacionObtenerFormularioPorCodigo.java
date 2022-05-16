package com.uco.myproject.aplicacion.servicio.formulario;

import com.uco.myproject.dominio.modelo.Formulario;
import com.uco.myproject.dominio.servicio.formulario.ServicioObtenerFormularioPorCodigo;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionObtenerFormularioPorCodigo {

    private final ServicioObtenerFormularioPorCodigo servicioObtenerFormularioPorCodigo;

    public ServicioAplicacionObtenerFormularioPorCodigo(ServicioObtenerFormularioPorCodigo servicioObtenerFormularioPorCodigo) {
        this.servicioObtenerFormularioPorCodigo = servicioObtenerFormularioPorCodigo;
    }

    public Formulario obtenerPorCodigo(Long id){
        Formulario formulario = this.servicioObtenerFormularioPorCodigo.obtenerPorCodigo(id);

        return new Formulario(formulario.getDocumentoIdentidadJefeHogar(),formulario.getPersonas(),formulario.getClasificacionSisben(),
                formulario.isPoseeDerechosDePropiedad(),formulario.isAceptoJuramento(),formulario.isAceptoAvisoDePrivacidad(),
                formulario.getCorreoElectronico(),formulario.getAhorroPrevio());
    }
}
