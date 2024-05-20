package com.example.pokemonguide.springboot.pokemonguide.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pokemon")
public class Pokemon {
    private String nombre;

    @OneToMany
    @Column(name = "nombre_Tipo")
    private List<Tipo> listaTipos;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_pokedex ")
    private int numPokedex;

    @Column(name = "num_Evolucion")
    private int numEvolucion;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "generacion_numGeneracion")
    private Generacion generacion;

    private String imagen;

    private int nivel;

    @ElementCollection
    @Column(name = "nombre_movimiento")
    private List<Movimiento> movimientos;

    @Column(name = "ps_base")
    private int psBase;

    @Column(name = "ataque_base")
    private int ataqueBase;

    @Column(name = "defensa_base")
    private int defensaBase;

    @Column(name = "ataqueEspecial_base")
    private int ataqueEspecialBase;

    @Column(name = "defensaEspecial_base")
    private int defensaEspecialBase;

    @Column(name = "velocidad_base")
    private int velocidadBase;

    @Column(name = "ps_maximo")
    private int psMaximo;

    @Column(name = "ataque_maximo")
    private int ataqueMaximo;

    @Column(name = "defensa_maximo")
    private int defensaMaximo;

    @Column(name = "ataqueEspecial_maximo")
    private int ataqueEspecialMaximo;

    @Column(name = "defensaEspecial_maximo")
    private int defensaEspecialMaximo;

    @Column(name = "velocidad_maximo")
    private int velocidadMaximo;

    private int iv;

    private boolean shiny;

    @ManyToOne
    @JoinColumn(name = "nombre_habilidad")
    private Habilidad habilidad;

    @ManyToOne
    @JoinColumn(name = "nombre_naturaleza")
    private Naturaleza naturaleza;

    public Pokemon() {
    }

    public Pokemon(String nombre, List<Tipo> listaTipos, int numPokedex, int numEvolucion,
            String descripcion, Generacion generacion, String imagen,
            int nivel, List<Movimiento> movimientos, int psBase, int ataqueBase, int defensaBase,
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

    public Pokemon(String nombre, int numEvolucion, String descripcion, String imagen, int nivel,
            int psBase, int ataqueBase, int defensaBase, int ataqueEspecialBase, int defensaEspecialBase,
            int velocidadBase,
            int psMaximo, int ataqueMaximo, int defensaMaximo, int ataqueEspecialMaximo, int defensaEspecialMaximo,
            int velocidadMaximo,
            int iv, boolean shiny) {

        this.nombre = nombre;
        this.numEvolucion = numEvolucion;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.nivel = nivel;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
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

    @Override
    public String toString() {
        return "Pokemon [nombre=" + nombre + ", listaTipos=" + listaTipos + ", numPokedex=" + numPokedex
                + ", numEvolucion=" + numEvolucion + ", descripcion=" + descripcion + ", generacion=" + generacion
                + ", imagen=" + imagen + ", nivel=" + nivel + ", movimientos=" + movimientos + ", psBase=" + psBase
                + ", ataqueBase=" + ataqueBase + ", defensaBase=" + defensaBase + ", ataqueEspecialBase="
                + ataqueEspecialBase + ", defensaEspecialBase=" + defensaEspecialBase + ", velocidadBase="
                + velocidadBase + ", psMaximo=" + psMaximo + ", ataqueMaximo=" + ataqueMaximo + ", defensaMaximo="
                + defensaMaximo + ", ataqueEspecialMaximo=" + ataqueEspecialMaximo + ", defensaEspecialMaximo="
                + defensaEspecialMaximo + ", velocidadMaximo=" + velocidadMaximo + ", iv=" + iv + ", shiny=" + shiny
                + ", habilidad=" + habilidad + ", naturaleza=" + naturaleza + "]";
    }
}
