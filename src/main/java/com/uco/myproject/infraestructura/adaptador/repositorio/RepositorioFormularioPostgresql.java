package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.dominio.modelo.Formulario;
import com.uco.myproject.dominio.puerto.RepositorioFormulario;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadFormulario;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioFormularioJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioFormularioPostgresql implements RepositorioFormulario {

    private final RepositorioFormularioJpa repositorioFormularioJpa;


    public RepositorioFormularioPostgresql(RepositorioFormularioJpa repositorioFormularioJpa) {
        this.repositorioFormularioJpa = repositorioFormularioJpa;
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
    public Long guardar(Formulario formulario) {
        EntidadFormulario formularioGuardado = this.repositorioFormularioJpa.save(ensamblarEntidadFormulario(formulario));
        return formularioGuardado.getDocumentoIdentidadJefeHogar();
    }

    @Override
    public boolean existe(Formulario formulario) {
        return this.repositorioFormularioJpa.existsById(formulario.getDocumentoIdentidadJefeHogar());
    }

    private Formulario ensamblarFormulario(EntidadFormulario formulario){
        return Formulario.of(formulario.getDocumentoIdentidadJefeHogar(),formulario.getClasificacionSisben(),
                formulario.isPoseeDerechosDePropiedad(),formulario.isAceptoJuramento(),formulario.isAceptoAvisoDePrivacidad(),
                formulario.getCorreoElectronico());
    }

    private EntidadFormulario ensamblarEntidadFormulario(Formulario formulario){
        return new EntidadFormulario(formulario.getDocumentoIdentidadJefeHogar(),formulario.getClasificacionSisben(),
                formulario.isPoseeDerechosDePropiedad(),formulario.isAceptoJuramento(),formulario.isAceptoAvisoDePrivacidad(),
                formulario.getCorreoElectronico());
    }
}
