package com.example.pokemonguide.springboot.pokemonguide.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "entrenador")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "tipo")
public abstract class Entrenador {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "numPokedex_Pokemon")
    private List<Pokemon> listaPokemons;

    @ManyToOne
    @JoinColumn(name = "generacion_numGeneracion")
    private Generacion generacion;

    private String imagen;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, List<Pokemon> listaPokemons, Generacion generacion, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.listaPokemons = listaPokemons;
        this.generacion = generacion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pokemon> getListaPokemons() {
        return listaPokemons;
    }

    public void setListaPokemons(List<Pokemon> listaPokemons) {
        this.listaPokemons = listaPokemons;
    }

    public Generacion getGeneracion() {
        return generacion;
    }

    public void setGeneracion(Generacion generacion) {
        this.generacion = generacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Entrenador [id=" + id + ", nombre=" + nombre + ", listaPokemons=" + listaPokemons + ", generacion="
                + generacion + ", imagen=" + imagen + "]";
    }
    
    
}
