package com.example.pokemonguide.springboot.pokemonguide.models;

import java.util.Date;
import java.util.List;

import com.example.pokemonguide.springboot.pokemonguide.validacion.Requerido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "usuario")
public class Usuario {

    // @NotEmpty(message = "El campo no puede estar vacio")
    @Column(name = "nombre_del_usuario")
    private String nombreDelUsuario;

    // @NotEmpty
    @Requerido
    private String apellido;

    @Id
    @NotBlank
    @Size(min = 3, max = 20)
    private String nombre;

    @NotEmpty
    @Size(min = 8, max = 18)
    private String password;

    @NotEmpty
    @Email(message = "Correo con formato incorrecto")
    private String email;

    @NotNull
    @Past
    // @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_nac")
    private Date fechaNac;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "nombre_usuario")
    private Pais pais;

    @NotEmpty
    @OneToMany
    @JoinColumn(name = "nombre_usuario")
    private List<Role> roles;

    private boolean habilitar;

    @NotEmpty
    private String genero;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String email) {
        this(nombre, apellido);
        this.email = email;
    }

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreDelUsuario() {
        return nombreDelUsuario;
    }

    public void setNombreDelUsuario(String nombreDelUsuario) {
        this.nombreDelUsuario = nombreDelUsuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public boolean isHabilitar() {
        return habilitar;
    }

    public void setHabilitar(boolean habilitar) {
        this.habilitar = habilitar;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Usuario [nombreDelUsuario=" + nombreDelUsuario + ", apellido=" + apellido + ", nombre=" + nombre
                + ", password=" + password + ", email=" + email + ", fechaNac=" + fechaNac + ", pais=" + pais
                + ", roles="
                + roles + ", habilitar=" + habilitar + ", genero=" + genero + "]";
    }
}
