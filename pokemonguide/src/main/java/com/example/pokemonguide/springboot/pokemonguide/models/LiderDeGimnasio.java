package com.example.pokemonguide.springboot.pokemonguide.models;

import java.awt.*;
import java.util.ArrayList;

public class LiderDeGimnasio extends Entrenador{
    private String descripcion;
    private Tipo tipo;
    private int nivel;
    private Image imagen;

    public LiderDeGimnasio() {
    }

    public LiderDeGimnasio(String nombre, ArrayList<Pokemon> listaPokemons,
                           Generacion generacion, String descripcion,
                           Tipo tipo, int nivel, Image imagen) {
        super(nombre, listaPokemons, generacion);
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.nivel = nivel;
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
}

