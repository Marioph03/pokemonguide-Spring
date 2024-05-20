package com.example.pokemonguide.springboot.pokemonguide.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.pokemonguide.springboot.pokemonguide.responsive.PokemonResponse;

@Service
public class ApiService {
    private final String API_BASE_URL = "https://pokeapi.co/api/v2/pokemon/";
    
    @Autowired
    private RestTemplate restTemplate;

    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    public PokemonResponse getPokemonByName(String name) {
        String url = API_BASE_URL + name;
        return restTemplate.getForObject(url, PokemonResponse.class);
    }
}
