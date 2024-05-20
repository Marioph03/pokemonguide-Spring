package com.example.pokemonguide.springboot.pokemonguide.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "item")
public class Item {
    @Id
    private String nombre;

    @NotNull
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "numGeneracion_Generacion")
    @NotNull
    private Generacion generacion;

    @NotNull
    private String imagen;

    public Item() {}

    public Item(String nombre, String descripcion, Generacion generacion, String imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.generacion = generacion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Generacion getGeneracion() {
        return generacion;
    }

    public void setGeneracion(Generacion generacion) {
        this.generacion = generacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Item [nombre=" + nombre + ", descripcion=" + descripcion + ", generacion=" + generacion + ", imagen="
                + imagen + "]";
    }
}
