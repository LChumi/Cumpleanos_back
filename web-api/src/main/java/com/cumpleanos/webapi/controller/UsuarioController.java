package com.cumpleanos.webapi.controller;

import com.cumpleanos.webapi.auth.LoginRequest;
import com.cumpleanos.webapi.models.Usuarios;
import com.cumpleanos.webapi.service.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    private final static Logger LOG = LoggerFactory.getLogger(UsuarioService.class);

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        try {
            String username = loginRequest.getUsername();
            String password = loginRequest.getPassword();

            Usuarios usuario = usuarioService.login(username, password);

            if (usuario != null) {
                LOG.info("Usuario ok:"+ usuario.getUsr_nombre());
                return ResponseEntity.ok(usuario); // Devuelve el usuario autenticado.
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
            }
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error en el servidor");
        }
    }

}
