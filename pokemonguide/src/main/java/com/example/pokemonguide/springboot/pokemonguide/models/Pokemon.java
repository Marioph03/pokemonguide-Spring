package com.example.pokemonguide.springboot.pokemonguide.models;

import java.awt.*;
import java.util.List;

public class Pokemon {
    private String nombre;
    private List<Tipo> listaTipos;
    private int numPokedex;
    private int numEvolucion;
    private String descripcion;
    private Generacion generacion;
    private Image imagen;
    private int nivel;
    private List<Movimiento> movimientos;
    private int psBase;
    private int ataqueBase;
    private int defensaBase;
    private int ataqueEspecialBase;
    private int defensaEspecialBase;
    private int velocidadBase;
    private int psMaximo;
    private int ataqueMaximo;
    private int defensaMaximo;
    private int ataqueEspecialMaximo;
    private int defensaEspecialMaximo;
    private int velocidadMaximo;
    private int iv;
    private boolean shiny;
    private Habilidad habilidad;
    private Naturaleza naturaleza;

    public Pokemon(){}

    public Pokemon(String nombre, List<Tipo> listaTipos,int numPokedex, int numEvolucion,
                   String descripcion, Generacion generacion, Image imagen,
                   int nivel, List<Movimiento> movimientos,int psBase, int ataqueBase, int defensaBase,
                   int ataqueEspecialBase, int defensaEspecialBase,
                   int velocidadBase, int psMaximo, int ataqueMaximo,
                   int defensaMaximo, int ataqueEspecialMaximo,
                   int defensaEspecialMaximo, int velocidadMaximo, int iv,
                   boolean shiny, Habilidad habilidad, Naturaleza naturaleza) {
        this.nombre = nombre;
        this.listaTipos = listaTipos;
        this.numPokedex = numPokedex;
        this.numEvolucion = numEvolucion;
        this.descripcion = descripcion;
        this.generacion = generacion;
        this.imagen = imagen;
        this.nivel = nivel;
        this.movimientos = movimientos;
        this.psBase = psBase;
        this.ataqueBase = ataqueBase;
        this.defensaBase = defensaBase;
        this.ataqueEspecialBase = ataqueEspecialBase;
        this.defensaEspecialBase = defensaEspecialBase;
        this.velocidadBase = velocidadBase;
        this.psMaximo = psMaximo;
        this.ataqueMaximo = ataqueMaximo;
        this.defensaMaximo = defensaMaximo;
        this.ataqueEspecialMaximo = ataqueEspecialMaximo;
        this.defensaEspecialMaximo = defensaEspecialMaximo;
        this.velocidadMaximo = velocidadMaximo;
        this.iv = iv;
        this.shiny = shiny;
        this.habilidad = habilidad;
        this.naturaleza = naturaleza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public int getNumEvolucion() {
        return numEvolucion;
    }

    public void setNumEvolucion(int numEvolucion) {
        this.numEvolucion = numEvolucion;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPsBase() {
        return psBase;
    }

    public void setPsBase(int psBase) {
        this.psBase = psBase;
    }

    public int getAtaqueBase() {
        return ataqueBase;
    }

    public void setAtaqueBase(int ataqueBase) {
        this.ataqueBase = ataqueBase;
    }

    public int getDefensaBase() {
        return defensaBase;
    }

    public void setDefensaBase(int defensaBase) {
        this.defensaBase = defensaBase;
    }

    public int getAtaqueEspecialBase() {
        return ataqueEspecialBase;
    }

    public void setAtaqueEspecialBase(int ataqueEspecialBase) {
        this.ataqueEspecialBase = ataqueEspecialBase;
    }

    public int getDefensaEspecialBase() {
        return defensaEspecialBase;
    }

    public void setDefensaEspecialBase(int defensaEspecialBase) {
        this.defensaEspecialBase = defensaEspecialBase;
    }

    public int getVelocidadBase() {
        return velocidadBase;
    }

    public void setVelocidadBase(int velocidadBase) {
        this.velocidadBase = velocidadBase;
    }

    public int getPsMaximo() {
        return psMaximo;
    }

    public void setPsMaximo(int psMaximo) {
        this.psMaximo = psMaximo;
    }

    public int getAtaqueMaximo() {
        return ataqueMaximo;
    }

    public void setAtaqueMaximo(int ataqueMaximo) {
        this.ataqueMaximo = ataqueMaximo;
    }

    public int getDefensaMaximo() {
        return defensaMaximo;
    }

    public void setDefensaMaximo(int defensaMaximo) {
        this.defensaMaximo = defensaMaximo;
    }

    public int getAtaqueEspecialMaximo() {
        return ataqueEspecialMaximo;
    }

    public void setAtaqueEspecialMaximo(int ataqueEspecialMaximo) {
        this.ataqueEspecialMaximo = ataqueEspecialMaximo;
    }

    public int getDefensaEspecialMaximo() {
        return defensaEspecialMaximo;
    }

    public void setDefensaEspecialMaximo(int defensaEspecialMaximo) {
        this.defensaEspecialMaximo = defensaEspecialMaximo;
    }

    public int getVelocidadMaximo() {
        return velocidadMaximo;
    }

    public void setVelocidadMaximo(int velocidadMaximo) {
        this.velocidadMaximo = velocidadMaximo;
    }

    public int getIv() {
        return iv;
    }

    public void setIv(int iv) {
        this.iv = iv;
    }

    public boolean isShiny() {
        return shiny;
    }

    public void setShiny(boolean shiny) {
        this.shiny = shiny;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public Naturaleza getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(Naturaleza naturaleza) {
        this.naturaleza = naturaleza;
    }

    public List<Tipo> getListaTipos() {
        return listaTipos;
    }

    public void setListaTipos(List<Tipo> listaTipos) {
        this.listaTipos = listaTipos;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
}
