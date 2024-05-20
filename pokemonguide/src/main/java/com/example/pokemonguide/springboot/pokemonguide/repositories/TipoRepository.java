package com.example.pokemonguide.springboot.pokemonguide.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pokemonguide.springboot.pokemonguide.models.Tipo;

public interface TipoRepository extends JpaRepository<Tipo, String>{
    Tipo findByNombre(String nombre);
}
