package com.cumpleanos.webapi.controller;

import com.cumpleanos.webapi.models.Bodega;
import com.cumpleanos.webapi.service.BodegaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bodegas")
@CrossOrigin("*")
public class BodegaController {

    @Autowired
    private BodegaService bodegaService;

    @GetMapping("/listBodegas/{bod_usuario}/{bod_empresa}")
    public ResponseEntity<List<Bodega>> listar(@PathVariable Long bod_usuario,@PathVariable Integer bod_empresa ) {
        try {
            List<Bodega> bodegas = bodegaService.listarBodegas(bod_usuario,bod_empresa);
            if (bodegas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(bodegas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}
