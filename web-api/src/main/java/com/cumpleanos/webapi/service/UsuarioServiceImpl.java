package com.cumpleanos.webapi.service;

import com.cumpleanos.webapi.models.Usuarios;
import com.cumpleanos.webapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends GenericServiceImpl<Usuarios,Long>implements UsuarioService{

    @Autowired
    private UsuarioRepository repository;

    @Override
    public CrudRepository<Usuarios, Long> getDao() {
        return repository;
    }


    @Override
    public Usuarios getByUsr_id(String usr_id) {
        return repository.findByUsr_id(usr_id);
    }

    @Override
    public Usuarios login(String usuario, String password) {
        return repository.findByUsr_idAndUsr_clave(usuario, password);
    }
}
