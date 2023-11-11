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
        String imagePath = "C:/Imagenes/" + imageName;
        FileSystemResource resource = new FileSystemResource(imagePath);

        if (resource.exists()) {
            return ResponseEntity.ok(resource); // Devuelve la imagen si existe.
        } else {
            imagePath= "C:/Imagenes/" +'0'+ imageName;
            FileSystemResource resource2 = new FileSystemResource(imagePath);
            if (resource2.exists()){
                return ResponseEntity.ok(resource2); // Devuelve la imagen si existe.
            }else{
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        }
    }
}
