package com.cumpleanos.webapi.controller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
public class ImageController {

    @GetMapping(value = "/images/{imageName}", produces = "image/jpeg")
    public ResponseEntity<FileSystemResource> getImagen(@PathVariable String imageName) {
        String basePath = "C:/Imagenes/";

        // Imagen principal
        FileSystemResource resource = new FileSystemResource(basePath + imageName);
        if (resource.exists()) {
            return ResponseEntity.ok(resource);
        }

        // Variante con prefijo "0"
        FileSystemResource resource2 = new FileSystemResource(basePath + "0" + imageName);
        if (resource2.exists()) {
            return ResponseEntity.ok(resource2);
        }

        // Imagen por defecto
        FileSystemResource defaultResource = new FileSystemResource(basePath + "default.jpg");
        if (defaultResource.exists()) {
            return ResponseEntity.ok(defaultResource);
        }

        // Si incluso el default no existe, devuelve 404
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

}
