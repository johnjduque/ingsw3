package com.uco.myproject.infraestructura.adaptador.servicio;

import com.uco.myproject.dominio.servicio.login.ServicioCifrarTexto;
import org.springframework.stereotype.Component;

import static org.apache.commons.codec.digest.DigestUtils.sha256Hex;

@Component
public class ServicioCifrarTextoSha256 implements ServicioCifrarTexto {

    @Override
    public String ejecutar(String texto) {
        return sha256Hex(texto);
    }
}
