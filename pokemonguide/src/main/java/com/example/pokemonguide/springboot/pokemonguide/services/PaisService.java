package com.example.pokemonguide.springboot.pokemonguide.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pokemonguide.springboot.pokemonguide.models.Pais;

@Service
public interface PaisService {

    public List<Pais> listar();
    public Pais buscarPorId(Integer id);
}
