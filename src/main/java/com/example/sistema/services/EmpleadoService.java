package com.example.sistema.services;

import com.example.sistema.repository.EmpresaRepository;

public class EmpleadoService {
    public EmpresaRepository repository;

    public  EmpleadoService(EmpresaRepository repository){
        this.repository =repository;

    }
}
