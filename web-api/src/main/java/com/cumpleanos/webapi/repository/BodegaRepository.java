package com.cumpleanos.webapi.repository;

import com.cumpleanos.webapi.models.Bodega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BodegaRepository extends JpaRepository<Bodega,Long> {

    @Query("SELECT b FROM Bodega b WHERE b.bod_usuario = :bod_usuario AND b.bod_empresa=:bod_empresa")
    public List<Bodega> findByBod_usuarioAndBod_empresa(Long bod_usuario,Integer bod_empresa);

}
