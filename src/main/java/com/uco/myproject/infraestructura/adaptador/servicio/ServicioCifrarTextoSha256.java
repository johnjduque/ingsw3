package com.uco.myproject.infraestructura.adaptador.servicio;

import com.uco.myproject.dominio.servicio.login.ServicioCifrarTexto;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import static org.apache.commons.codec.digest.DigestUtils.sha256Hex;
import static org.springframework.util.DigestUtils.*;

@Component
public class ServicioCifrarTextoSha256 implements ServicioCifrarTexto {

    @Override
    public String ejecutar(String texto) {
        return sha256Hex(texto);
    }
}
