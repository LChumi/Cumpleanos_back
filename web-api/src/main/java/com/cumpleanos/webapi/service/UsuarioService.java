package com.cumpleanos.webapi.service;

import com.cumpleanos.webapi.models.Usuarios;

public interface UsuarioService extends IGenericService<Usuarios,Long> {

    Usuarios login(String usuario,String password);
}
