package com.example.pokemonguide.springboot.pokemonguide.models;

import java.awt.*;

public class Item {
    private String nombre;
    private String descripcion;
    private Generacion generacion;
    private Image imagen;

    public Item() {}

    public Item(String nombre, String descripcion, Generacion generacion, Image imagen) {
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

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
}
