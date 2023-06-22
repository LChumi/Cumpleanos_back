package com.cumpleanos.webapi.service;

import com.cumpleanos.webapi.models.Producto;
import com.cumpleanos.webapi.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto,Long> implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public CrudRepository<Producto, Long> getDao() {
        return productoRepository;
    }

    @Override
    public Producto getByBarraAndBod(String barra, Long bodega) {
        return productoRepository.findByPro_idAndBod_codigo(barra, bodega);
    }
}
