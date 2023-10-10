package com.cumpleanos.webapi.controller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/bodegas")
@CrossOrigin("*")
public class ImageController {

    @GetMapping(value = "/images/{imageName}",produces = "image/jpeg")
    public FileSystemResource getImagen(@PathVariable String imageName){
        String imagePath = "C:/Users/Luis/Pictures/Imagenes Post Cumpleaños/"+imageName;
        FileSystemResource resource=new FileSystemResource(imagePath);
        return resource;
    }
}
