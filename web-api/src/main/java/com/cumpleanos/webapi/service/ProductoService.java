package com.cumpleanos.webapi.service;

import com.cumpleanos.webapi.models.Producto;

public interface ProductoService extends IGenericService<Producto,Long>{
    Producto getByBarraAndBod(String barra,Long bodega);
}
