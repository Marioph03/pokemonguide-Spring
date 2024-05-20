package com.example.pokemonguide.springboot.pokemonguide.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.pokemonguide.springboot.pokemonguide.models.Pokemon;

public interface PokemonRepository extends CrudRepository<Pokemon, Integer>{
    List<Pokemon> findByNombre(String nombre); 

    //Pokemon findByNombre2(String nombre); 

    @Query("select p from Pokemon p")
    Pokemon buscarByNombre(String nombre); 

    @Query("select p.nombre, p.nombre from Pokemon p")
    List<Object[]> obtenerPersonData();

    @Query("select p.numPokedex, p.nombre from Pokemon p where p.nombre=?1")
    List<Object[]> obtenerPersonData(String name);
}
