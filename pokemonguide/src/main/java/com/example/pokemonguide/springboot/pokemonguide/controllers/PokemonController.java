package com.example.pokemonguide.springboot.pokemonguide.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.pokemonguide.springboot.pokemonguide.models.Pokemon;
import com.example.pokemonguide.springboot.pokemonguide.repositories.PokemonRepository;

@Controller
public class PokemonController {

    @Autowired
    private PokemonRepository pkmnRepository;

    @GetMapping("/pokemons")
    public String getAllPokemons(Model model) {
        model.addAttribute("pokemons", pkmnRepository.findAll());
        return "pokemon";
    }

    @GetMapping("/pokemons/{nombre}")
    public String getPokemonByName(@PathVariable String nombre, Model model) {
        List<Pokemon> pokemons = pkmnRepository.findByNombre(nombre);
    if (!pokemons.isEmpty()) {
        Pokemon pokemon = pokemons.get(2); // Obtener el primer Pokemon de la lista
        model.addAttribute("pokemon", pokemon);
    } else {
        model.addAttribute("pokemon", null); // No se encontró ningún Pokemon
    }
    return "pokemon_details";
}

    @PostMapping("/pokemons/update")
    @ResponseBody
    public String updatePokemon(@RequestBody Pokemon updatedPokemon) {
        // Buscar el Pokémon en la base de datos por su nombre
        Pokemon pokemon = pkmnRepository.buscarByNombre(updatedPokemon.getNombre());

        // Verificar si el Pokémon existe
        if (pokemon != null) {
            // Actualizar la información del Pokémon con la recibida en la solicitud
            pokemon.setDescripcion("Nueva descripcion");
            pokemon.setGeneracion(pokemon.getGeneracion());
            pokemon.setHabilidad(pokemon.getHabilidad());
            pokemon.setImagen(pokemon.getImagen());
            // Actualizar otros campos según sea necesario

            // Guardar el Pokémon actualizado en la base de datos
            pkmnRepository.save(pokemon);

            return "Información del Pokémon actualizada exitosamente.";
        } else {
            return "No se encontró ningún Pokémon con el nombre proporcionado.";
        }
    }
}
