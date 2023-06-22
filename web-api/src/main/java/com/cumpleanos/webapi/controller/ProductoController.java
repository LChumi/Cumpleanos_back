package com.cumpleanos.webapi.controller;

import com.cumpleanos.webapi.models.Producto;
import com.cumpleanos.webapi.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
@CrossOrigin("*")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/Buscar/{pro_id}/{bod_id}/barra/bodega")
    public ResponseEntity<Producto> buscarProducto(@PathVariable String pro_id,@PathVariable Long bod_id){
        try{
            Producto producto=productoService.getByBarraAndBod(pro_id, bod_id);
            if (producto==null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(producto,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
