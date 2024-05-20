package com.example.pokemonguide.springboot.pokemonguide.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "movimiento")
public class Movimiento {
    @Id
    private String nombre;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "numGeneracion_Generacion")
    private Generacion generacion;

    @ManyToOne
    @JoinColumn(name = "nombre_Tipo")
    private Tipo tipo;

    private int potencia;

    @Column(name = "precision_value")
    private int precision;

    private String categoria;

    public Movimiento() {}

    public Movimiento(String nombre, String descripcion, Generacion generacion,
                      Tipo tipo, int potencia, int precision, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.generacion = generacion;
        this.tipo = tipo;
        this.potencia = potencia;
        this.precision = precision;
        this.categoria = categoria;
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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Movimiento [nombre=" + nombre + ", descripcion=" + descripcion + ", generacion=" + generacion
                + ", tipo=" + tipo + ", potencia=" + potencia + ", precision=" + precision + ", categoria=" + categoria
                + "]";
    }
}

