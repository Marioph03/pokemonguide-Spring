package com.example.pokemonguide.springboot.pokemonguide.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.pokemonguide.springboot.pokemonguide.models.Pokemon;
import com.example.pokemonguide.springboot.pokemonguide.models.Tipo;
import com.example.pokemonguide.springboot.pokemonguide.repositories.PokemonRepository;
import com.example.pokemonguide.springboot.pokemonguide.repositories.TipoRepository;
import com.example.pokemonguide.springboot.pokemonguide.responsive.PokemonResponse;

public class PokemonService {
    @Autowired
    private PokemonRepository pokemonRepository;

    @Autowired
    private TipoRepository tipoRepository;

    @Autowired
    private ApiService pokeApiService;

    @Transactional
    public void importPokemon(String name) {
        PokemonResponse response = pokeApiService.getPokemonByName(name);
        
        // Mapear datos de respuesta a entidades
        Pokemon pokemon = new Pokemon();
        pokemon.setNombre(response.getName());
        pokemon.setNumPokedex(response.getId());
        
        // Asumimos que los tipos ya existen en la base de datos
        List<Tipo> tipos = response.getTypes().stream()
                .map(typeSlot -> tipoRepository.findByNombre(typeSlot.getType().getName()))
                .collect(Collectors.toList());
        pokemon.setListaTipos(tipos);

        // Guardar el Pokémon en la base de datos
        pokemonRepository.save(pokemon);
    }
}
