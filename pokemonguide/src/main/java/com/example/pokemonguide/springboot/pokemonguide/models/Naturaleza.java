package com.example.pokemonguide.springboot.pokemonguide.models;


public class Naturaleza {
    private String nombre;
    private String efecto;

    public Naturaleza() {
    }

    public Naturaleza(String nombre, String efecto) {
        this.nombre = nombre;
        this.efecto = efecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    
}

