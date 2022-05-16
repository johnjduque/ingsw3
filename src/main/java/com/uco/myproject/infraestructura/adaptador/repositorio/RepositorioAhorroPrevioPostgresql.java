package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.dominio.modelo.AhorroPrevio;
import com.uco.myproject.dominio.puerto.RepositorioAhorroPrevio;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadAhorroPrevio;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioAhorroPrevioJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioAhorroPrevioPostgresql implements RepositorioAhorroPrevio {

    private final RepositorioAhorroPrevioJpa repositorioAhorroPrevioJpa;

    public RepositorioAhorroPrevioPostgresql(RepositorioAhorroPrevioJpa repositorioAhorroPrevioJpa) {
        this.repositorioAhorroPrevioJpa = repositorioAhorroPrevioJpa;
    }

    @Override
    public List<AhorroPrevio> listar() {
        List<EntidadAhorroPrevio> entidadesAhorroPrevio = repositorioAhorroPrevioJpa.findAll();
        return entidadesAhorroPrevio.stream().map(ahorroPrevio -> new AhorroPrevio(ahorroPrevio.getDocumentoIdentidadJefeHogar(),ahorroPrevio.getCuentaAhorroProgramado(),
                ahorroPrevio.getCesantias(),ahorroPrevio.getSubsidioCajaCompesacion())).toList();
    }

    @Override
    public AhorroPrevio consultarPorId(Long id) {
        return this.repositorioAhorroPrevioJpa
                .findById(id)
                .map(entidad -> AhorroPrevio.of(entidad.getDocumentoIdentidadJefeHogar(),entidad.getCuentaAhorroProgramado(),entidad.getCesantias(),
                        entidad.getSubsidioCajaCompesacion()))
                .orElse(null);
    }

    @Override
    public Long guardar(AhorroPrevio ahorroPrevio) {
        EntidadAhorroPrevio entidadAhorroPrevio = new EntidadAhorroPrevio(ahorroPrevio.getDocumentoIdentidadJefeHogar(),ahorroPrevio.getCuentaAhorroProgramado(),
                ahorroPrevio.getCesantias(),ahorroPrevio.getSubsidioCajaCompesacion());
        return this.repositorioAhorroPrevioJpa.save(entidadAhorroPrevio).getDocumentoIdentidadJefeHogar();
    }

    @Override
    public boolean actualizar(Long id, AhorroPrevio ahorroPrevio) {
        repositorioAhorroPrevioJpa.findById(id);
        EntidadAhorroPrevio entidadAhorroPrevio = new EntidadAhorroPrevio();
        entidadAhorroPrevio.setDocumentoIdentidadJefeHogar(id);
        entidadAhorroPrevio.setCuentaAhorroProgramado(ahorroPrevio.getCuentaAhorroProgramado());
        entidadAhorroPrevio.setCesantias(ahorroPrevio.getCesantias());
        entidadAhorroPrevio.setSubsidioCajaCompesacion(ahorroPrevio.getSubsidioCajaCompesacion());
        repositorioAhorroPrevioJpa.save(entidadAhorroPrevio);
        return true;
    }

    @Override
    public boolean existe(AhorroPrevio ahorroPrevio) {
        return this.repositorioAhorroPrevioJpa.existsById((long) ahorroPrevio.getDocumentoIdentidadJefeHogar());
    }
}
