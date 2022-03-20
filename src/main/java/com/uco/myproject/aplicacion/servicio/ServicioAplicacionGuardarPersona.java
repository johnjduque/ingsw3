package com.uco.myproject.aplicacion.servicio;

import com.uco.myproject.aplicacion.dto.DtoPersona;
import com.uco.myproject.dominio.modelo.*;
import com.uco.myproject.dominio.servicio.persona.ServicioGuardarPersona;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarPersona {

    private final ServicioGuardarPersona servicioGuardarPersona;

    public ServicioAplicacionGuardarPersona(ServicioGuardarPersona servicioGuardarPersona) {
        this.servicioGuardarPersona = servicioGuardarPersona;
    }

    public void guardar(DtoPersona dto) {

        TipoDeDocumento tipoDeDocumento = new TipoDeDocumento(dto.getTipoDeDocumento().getCodigo(), dto.getTipoDeDocumento().getNombre());
        Genero genero = new Genero(dto.getGenero().getCodigo(), dto.getGenero().getNombre());
        EstadoCivil estadoCivil = new EstadoCivil(dto.getEstadoCivil().getCodigo(), dto.getEstadoCivil().getNombre());
        CondicionEspecialMedica condicionEspecialMedica = new CondicionEspecialMedica(dto.getCondicionEspecialMedica().getCodigo(),dto.getCondicionEspecialMedica().getNombre());
        CondicionEspecialSocioeconomica condicionEspecialSocioeconomica = new CondicionEspecialSocioeconomica(dto.getCondicionEspecialSocioeconomica().getCodigo(),dto.getCondicionEspecialSocioeconomica().getNombre());
        TipoDePostulante tipoDePostulante = new TipoDePostulante(dto.getTipoDePostulante().getCodigo(),dto.getTipoDePostulante().getNombre());
        Ocupacion ocupacion = new Ocupacion(dto.getOcupacion().getCodigo(),dto.getOcupacion().getNombre());
        OrientacionSexual orientacionSexual = new OrientacionSexual(dto.getOrientacionSexual().getCodigo(),dto.getOrientacionSexual().getNombre());
        DatosDeContacto datosDeContacto = new DatosDeContacto(dto.getDatosDeContacto().getCodigo(),dto.getDatosDeContacto().getNumeroFijo(),
                dto.getDatosDeContacto().getNumeroCelular(),dto.getDatosDeContacto().getCorreoElectronico());

        Persona persona = Persona.of(dto.getCodigo(),dto.getDocumentoIdentidad(),dto.getPrimerNombre(),dto.getSegundoNombre(),dto.getPrimerApellido(),dto.getSegundoApellido(),
                dto.getFechaNacimiento(),dto.getIngresoMensual(),tipoDeDocumento,genero,estadoCivil,condicionEspecialMedica,condicionEspecialSocioeconomica,
                tipoDePostulante,ocupacion,orientacionSexual,datosDeContacto);

        this.servicioGuardarPersona.guardar(persona);
    }
}
