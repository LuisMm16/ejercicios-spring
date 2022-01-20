package com.example.obspringejerciciossesiones456.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/imprimirsaludo")
    public String imprimirSaludo(){
        return "Hola mundo desde HelloController";
    }

}
