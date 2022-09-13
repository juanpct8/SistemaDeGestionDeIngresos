package com.example.sistema.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaController {

    @GetMapping("/Empresa")
    public String  Empresa (){
        return "<h6> Hola Empresa <h6>";
    }


}
