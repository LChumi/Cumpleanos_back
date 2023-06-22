package com.cumpleanos.webapi.repository;

import com.cumpleanos.webapi.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoRepository extends JpaRepository<Producto,Long> {
    @Query("SELECT P FROM Producto P WHERE P.pro_id LIKE:pro_id AND P.bod_codigo=:bod_codigo")
    public Producto findByPro_idAndBod_codigo(String pro_id,Long bod_codigo);

}


