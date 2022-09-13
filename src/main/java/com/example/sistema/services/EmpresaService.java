package com.example.sistema.services;

import com.example.sistema.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
    private EmpresaRepository repository;

    public EmpresaService(EmpresaRepository repository){
        this.repository = repository;

    }
}
