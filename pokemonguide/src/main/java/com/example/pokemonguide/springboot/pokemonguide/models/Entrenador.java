package com.example.pokemonguide.springboot.pokemonguide.models;

import java.util.ArrayList;

public abstract class Entrenador{
    private String nombre;
    private ArrayList<Pokemon> listaPokemons;
    private Generacion generacion;

    public Entrenador(){}
    public Entrenador(String nombre, ArrayList<Pokemon> listaPokemons,
                      Generacion generacion){
        this.nombre = nombre;
        this.listaPokemons = listaPokemons;
        this.generacion = generacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pokemon> getListaPokemons() {
        return listaPokemons;
    }

    public void setListaPokemons(ArrayList<Pokemon> listaPokemons) {
        this.listaPokemons = listaPokemons;
    }

    public Generacion getGeneracion() {
        return generacion;
    }

    public void setGeneracion(Generacion generacion) {
        this.generacion = generacion;
    }
}

