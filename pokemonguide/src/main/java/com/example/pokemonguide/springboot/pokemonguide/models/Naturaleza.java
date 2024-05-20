package com.example.pokemonguide.springboot.pokemonguide.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "naturaleza")
public class Naturaleza {
    @Id
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

    @Override
    public String toString() {
        return "Naturaleza [nombre=" + nombre + ", efecto=" + efecto + "]";
    }
}

