package com.cumpleanos.webapi.repository;

import com.cumpleanos.webapi.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuarios,Long> {

    @Query(value = "SELECT U FROM Usuarios U WHERE U.usr_id =:Usr_id")
    public Usuarios findByUsr_id(String Usr_id);

    @Query(value = "SELECT U FROM Usuarios  U WHERE UPPER(U.usr_id) LIKE UPPER(:usr_id) And UPPER(U.usr_clave)  LIKE UPPER(:usr_clave)")
    public Usuarios findByUsr_idAndUsr_clave(String usr_id,String usr_clave);
}
