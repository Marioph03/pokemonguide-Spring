package com.example.pokemonguide.springboot.pokemonguide.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pokemonguide.springboot.pokemonguide.services.PokemonService;

@RestController
@RequestMapping("/api/pokemon")
public class PokeApiController {
    //Creo un controlador para iniciar la importación
    @Autowired
    private PokemonService pokemonService;

    @PostMapping("/import/{name}")
    public void importPokemon(@PathVariable String name) {
        pokemonService.importPokemon(name);
    }
}
