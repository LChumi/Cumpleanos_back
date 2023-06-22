package com.cumpleanos.webapi.controller;

import com.cumpleanos.webapi.models.Usuarios;
import com.cumpleanos.webapi.service.UsuarioService;
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

    @GetMapping("/login/{username}/{password}")
    public ResponseEntity<Usuarios> login(@PathVariable String username, @PathVariable String password){
        try{
            Usuarios usuario = usuarioService.login(username, password);
            if (usuario == null){
                return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
            }
            return new ResponseEntity<>(usuario, HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
