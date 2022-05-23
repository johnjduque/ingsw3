package com.uco.myproject.aplicacion.servicio.login;

import com.uco.myproject.aplicacion.dto.DtoLogin;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.dominio.modelo.RolUsuario;
import com.uco.myproject.dominio.modelo.Usuario;
import com.uco.myproject.dominio.puerto.RepositorioUsuario;
import com.uco.myproject.dominio.servicio.login.ServicioCifrarTexto;
import com.uco.myproject.dominio.servicio.login.ServicioGenerarToken;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionLogin {

    private final ServicioGenerarToken servicioGenerarToken;
    private final ServicioCifrarTexto servicioCifrarTexto;
    private final RepositorioUsuario repositorioUsuario;

    public ServicioAplicacionLogin(ServicioGenerarToken servicioGenerarToken,ServicioCifrarTexto servicioCifrarTexto,
                                   RepositorioUsuario repositorioUsuario) {
        this.servicioGenerarToken = servicioGenerarToken;
        this.servicioCifrarTexto = servicioCifrarTexto;
        this.repositorioUsuario = repositorioUsuario;
    }

    public DtoRespuesta<String> ejecutar(DtoLogin dto) {

        String claveCifrada = this.servicioCifrarTexto.ejecutar(dto.getClave());
        Usuario usuario = this.repositorioUsuario.consultar(dto.getUsuario(), claveCifrada);

        if(usuario == null) {
            throw new IllegalStateException("Usuario o clave incorrecta");
        }

        List<String> roles = usuario.getRoles().stream().map(RolUsuario::getRol).toList();

        return new DtoRespuesta<>(this.servicioGenerarToken.ejecutar(dto.getUsuario(), roles));
    }
}
