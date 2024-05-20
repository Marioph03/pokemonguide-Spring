package com.example.pokemonguide.springboot.pokemonguide.models;

import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "liderdegimnasio")
@DiscriminatorValue("ENTRENADOR")
public class LiderDeGimnasio extends Entrenador{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "nombre_Tipo")
    private Tipo tipo;

    private int nivel;

    private String imagen;

    public LiderDeGimnasio() {
    }

    public LiderDeGimnasio(int id, String nombre, List<Pokemon> listaPokemons, Generacion generacion, String imagen,
            int id2, String descripcion, Tipo tipo, int nivel, String imagen2) {
        super(id, nombre, listaPokemons, generacion, imagen);
        id = id2;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.nivel = nivel;
        imagen = imagen2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "LiderDeGimnasio [id=" + id + ", descripcion=" + descripcion + ", tipo=" + tipo + ", nivel=" + nivel
                + ", imagen=" + imagen + "]";
    }
    
}

