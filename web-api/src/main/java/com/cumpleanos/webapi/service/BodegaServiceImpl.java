package com.cumpleanos.webapi.service;

import com.cumpleanos.webapi.models.Bodega;
import com.cumpleanos.webapi.repository.BodegaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BodegaServiceImpl extends GenericServiceImpl<Bodega,Long> implements BodegaService{

    @Autowired
    private BodegaRepository bodegaRepository;

    @Override
    public CrudRepository<Bodega, Long> getDao() {
        return bodegaRepository;
    }

    @Override
    public List<Bodega> listarBodegas(Long bod_usuario,Integer bod_empresa) {
        return bodegaRepository.findByBod_usuarioAndBod_empresa(bod_usuario,bod_empresa);
    }



}
