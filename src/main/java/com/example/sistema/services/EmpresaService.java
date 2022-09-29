package com.example.sistema.services;

import com.example.sistema.Entities.Empresa;
import com.example.sistema.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    private EmpresaRepository repository;

    public EmpresaService(EmpresaRepository repository){
        this.repository = repository;
    }
    public List<Empresa> getEmpresa(){
        return this.repository.findAll();
    }
}
