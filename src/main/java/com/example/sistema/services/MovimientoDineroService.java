package com.example.sistema.services;

import com.example.sistema.repository.MovimientoDineroRepository;

public class MovimientoDineroService {
    public MovimientoDineroRepository repository;

    public MovimientoDineroService(MovimientoDineroRepository repository){
        this.repository = repository;
    }

}
