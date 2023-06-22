package com.cumpleanos.webapi.service;

import com.cumpleanos.webapi.models.Bodega;

import java.util.List;

public interface BodegaService extends IGenericService<Bodega,Long> {
    List<Bodega> listarBodegas(Long bod_usuario,Integer bod_empresa);
}
