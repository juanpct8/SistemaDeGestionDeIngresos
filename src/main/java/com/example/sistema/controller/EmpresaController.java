package com.example.sistema.controller;

import com.example.sistema.Entities.Empresa;
import com.example.sistema.services.EmpresaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpresaController {

    @GetMapping("/Empresa")
    public String  Empresa (){
        return "<h6> Hola Empresa <h6>";
    }

    private EmpresaService service;
    public EmpresaController(EmpresaService service){
        this.service = service;
    }
    @GetMapping("/Empresa1")
    public List<Empresa> Empresar() {

        return this.service.getEmpresa();
    }



}
