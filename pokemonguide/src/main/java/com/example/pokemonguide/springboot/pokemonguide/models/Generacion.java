package com.example.pokemonguide.springboot.pokemonguide.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "generacion")
public class Generacion {
    @Id
    private int numGeneracion;

    private String descripcion;
    
    private int numPokemonPorGeneracion;

    @ManyToOne
    @JoinColumn(name = "nombre_Entrenador")
    private Entrenador rival;

    public Generacion() {
    }

    public Generacion(int numGeneracion, String descripcion, int numPokemonPorGeneracion,
                      Entrenador rival) {
        this.numGeneracion = numGeneracion;
        this.descripcion = descripcion;
        this.numPokemonPorGeneracion = numPokemonPorGeneracion;
        this.rival = rival;
    }

    public int getNumGeneracion() {
        return numGeneracion;
    }

    public void setNumGeneracion(int numGeneracion) {
        this.numGeneracion = numGeneracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumPokemonPorGeneracion() {
        return numPokemonPorGeneracion;
    }

    public void setNumPokemonPorGeneracion(int numPokemonPorGeneracion) {
        this.numPokemonPorGeneracion = numPokemonPorGeneracion;
    }

    public Entrenador getRival() {
        return rival;
    }

    public void setRival(Entrenador rival) {
        this.rival = rival;
    }

    @Override
    public String toString() {
        return "Generacion [numGeneracion=" + numGeneracion + ", descripcion=" + descripcion
                + ", numPokemonPorGeneracion=" + numPokemonPorGeneracion + ", rival=" + rival + "]";
    }
}

