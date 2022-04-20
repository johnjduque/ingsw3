package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.dominio.modelo.Persona;
import com.uco.myproject.dominio.puerto.RepositorioPersona;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadPersona;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioPersonaJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioPersonaPostgresql implements RepositorioPersona {

    private final RepositorioPersonaJpa repositorioPersonaJpa;

    public RepositorioPersonaPostgresql(RepositorioPersonaJpa repositorioPersonaJpa) {
        this.repositorioPersonaJpa = repositorioPersonaJpa;
    }

    @Override
    public List<Persona> listar() {

        List<EntidadPersona> personas = this.repositorioPersonaJpa.findAll();
        return personas.stream().map(persona -> new Persona(persona.getDocumentoIdentidad(),
                persona.getPrimerNombre(),persona.getSegundoNombre(),persona.getPrimerApellido(),
                persona.getSegundoApellido(),persona.getFechaNacimiento(),persona.getIngresoMensual())).toList();
    }

    @Override
    public Persona consultarPorId(int documentoIdentidad) {

        return this.repositorioPersonaJpa
                .findById((long) documentoIdentidad)
                .map(entidad -> Persona.of(entidad.getDocumentoIdentidad(),entidad.getPrimerNombre(),
                        entidad.getSegundoNombre(),entidad.getPrimerApellido(),entidad.getSegundoApellido(),
                        entidad.getFechaNacimiento(),entidad.getIngresoMensual()))
                .orElse(null);
    }

    @Override
    public Long guardar(Persona persona) {
        EntidadPersona entidadPersona = new EntidadPersona(persona.getDocumentoIdentidad(),persona.getPrimerNombre(),
                persona.getSegundoNombre(),persona.getPrimerApellido(),persona.getSegundoApellido(),
                persona.getFechaNacimiento(),persona.getIngresoMensual());

        return this.repositorioPersonaJpa.save(entidadPersona).getId();
    }

    @Override
    public boolean existe(Persona persona) {
        return this.repositorioPersonaJpa.findByPrimerNombreAndPrimerApellido(persona.getPrimerNombre(), persona.getPrimerApellido()) != null;
    }

    @Override
    public boolean eliminar(int documentoIdentidad) {
        this.repositorioPersonaJpa.deleteById((long) documentoIdentidad);
        return true;
    }

    @Override
    public boolean actualizar(int documentoIdentidad, Persona persona) {
        repositorioPersonaJpa.findById((long) documentoIdentidad);
        EntidadPersona entidadPersona = new EntidadPersona();
        entidadPersona.setPrimerNombre(persona.getPrimerNombre());
        entidadPersona.setSegundoNombre(persona.getSegundoNombre());
        entidadPersona.setPrimerApellido(persona.getPrimerApellido());
        entidadPersona.setSegundoApellido(persona.getSegundoApellido());
        entidadPersona.setIngresoMensual(persona.getIngresoMensual());
        repositorioPersonaJpa.save(entidadPersona);
        return true;
    }
}
