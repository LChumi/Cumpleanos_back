package com.cumpleanos.webapi.service;

import com.cumpleanos.webapi.models.Usuarios;

public interface UsuarioService extends IGenericService<Usuarios,Long> {

    Usuarios getByUsr_id(String usr_id);

    Usuarios login(String usuario,String password);
}
