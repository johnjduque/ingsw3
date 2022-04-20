package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.dominio.modelo.AhorroPrevio;
import com.uco.myproject.dominio.modelo.Formulario;
import com.uco.myproject.dominio.modelo.Persona;
import com.uco.myproject.dominio.puerto.RepositorioFormulario;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadAhorroPrevio;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadFormulario;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadPersona;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioAhorroPrevioJpa;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioFormularioJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioFormularioPostgresql implements RepositorioFormulario {

    private final RepositorioFormularioJpa repositorioFormularioJpa;
    private final RepositorioAhorroPrevioJpa repositorioAhorroPrevioJpa;

    public RepositorioFormularioPostgresql(RepositorioFormularioJpa repositorioFormularioJpa, RepositorioAhorroPrevioJpa repositorioAhorroPrevioJpa) {
        this.repositorioFormularioJpa = repositorioFormularioJpa;
        this.repositorioAhorroPrevioJpa = repositorioAhorroPrevioJpa;
    }

    @Override
    public List<Formulario> listar() {
        return this.repositorioFormularioJpa.findAll().stream().map(this::ensamblarFormulario).toList();
    }

    @Override
    public Formulario consultarPorId(Long id) {
        return this.repositorioFormularioJpa.findById(id).map(this::ensamblarFormulario).orElse(null);
    }

    @Override
    public void guardar(Formulario formulario) {
        EntidadAhorroPrevio ahorroPrevio;
        if(formulario.getAhorroPrevio().getId() != null){
            ahorroPrevio = this.repositorioAhorroPrevioJpa.findById(formulario.getAhorroPrevio().getId()).map(
                    this::ensamblarEntidadAhorroPrevio).orElse(null);
        }else{
            ahorroPrevio = ensamblarEntidadAhorroPrevio(formulario.getAhorroPrevio());
        }

        this.repositorioFormularioJpa.save(ensamblarEntidadFormulario(formulario,ahorroPrevio));
    }

    @Override
    public boolean existe(Formulario formulario) {
        return this.repositorioFormularioJpa.existsById(formulario.getId());
    }

    @Override
    public void eliminar(Long id) {
        this.repositorioFormularioJpa.deleteById(id);
    }

    @Override
    public void actualizar(Long id, Formulario formulario) {
        this.repositorioFormularioJpa.save(ensamblarEntidadFormulario(id,formulario));
    }

    private Formulario ensamblarFormulario(EntidadFormulario formulario){
        return Formulario.of(ensamblarPersonas(formulario.getPersonas()),formulario.getClasificacionSisben(),
                formulario.isPoseeDerechosDePropiedad(),formulario.isAceptoJuramento(),formulario.isAceptoAvisoDePrivacidad(),
                formulario.getCorreoElectronico(),ensamblarAhorroPrevio(formulario.getAhorroPrevio()));
    }

    private AhorroPrevio ensamblarAhorroPrevio(EntidadAhorroPrevio ahorroPrevio){
        return AhorroPrevio.of(ahorroPrevio.getCuentaAhorroProgramado(), ahorroPrevio.getCesantias(),
                ahorroPrevio.getSubsidioCajaCompesacion());
    }

    private List<Persona> ensamblarPersonas(List<EntidadPersona> personas){
        return personas.stream().map(this::ensamblarPersona).toList();
    }

    private Persona ensamblarPersona(EntidadPersona persona){
        return Persona.of(persona.getDocumentoIdentidad(),persona.getPrimerNombre(),persona.getSegundoNombre(),
                persona.getPrimerApellido(),persona.getSegundoApellido(),persona.getFechaNacimiento(),
                persona.getIngresoMensual());
    }

    private EntidadFormulario ensamblarEntidadFormulario(Formulario formulario, EntidadAhorroPrevio ahorroPrevio){
        return new EntidadFormulario(ensamblarEntidadPersonas(formulario.getPersonas()),formulario.getClasificacionSisben(),
                formulario.isPoseeDerechosDePropiedad(),formulario.isAceptoJuramento(),formulario.isAceptoAvisoDePrivacidad(),
                formulario.getCorreoElectronico(),ahorroPrevio);
    }

    private EntidadFormulario ensamblarEntidadFormulario(Long id, Formulario formulario){
        return new EntidadFormulario(id,ensamblarEntidadPersonas(formulario.getPersonas()),formulario.getClasificacionSisben(),
                formulario.isPoseeDerechosDePropiedad(),formulario.isAceptoJuramento(),formulario.isAceptoAvisoDePrivacidad(),
                formulario.getCorreoElectronico(),ensamblarEntidadAhorroPrevio(formulario.getAhorroPrevio()));
    }

    private EntidadAhorroPrevio ensamblarEntidadAhorroPrevio(AhorroPrevio ahorroPrevio){
        return new EntidadAhorroPrevio(ahorroPrevio.getCuentaAhorroProgramado(),ahorroPrevio.getCesantias(),
                ahorroPrevio.getSubsidioCajaCompesacion());
    }

    private EntidadAhorroPrevio ensamblarEntidadAhorroPrevio(EntidadAhorroPrevio ahorroPrevio){
        return new EntidadAhorroPrevio(ahorroPrevio.getCuentaAhorroProgramado(),ahorroPrevio.getCesantias(),
                ahorroPrevio.getSubsidioCajaCompesacion());
    }

    private List<EntidadPersona> ensamblarEntidadPersonas(List<Persona> personas){
        return personas.stream().map(this::ensamblarEntidadPersona).toList();
    }

    private EntidadPersona ensamblarEntidadPersona(Persona persona){
        return new EntidadPersona(persona.getDocumentoIdentidad(),persona.getPrimerNombre(),persona.getSegundoNombre(),
                persona.getPrimerApellido(),persona.getSegundoApellido(),persona.getFechaNacimiento(),
                persona.getIngresoMensual());
    }
}
