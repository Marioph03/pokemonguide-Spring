package com.example.pokemonguide.springboot.pokemonguide.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.pokemonguide.springboot.pokemonguide.models.Pais;

@Component
public class PaisServiceImpl implements PaisService{

private List<Pais> lista;

    public PaisServiceImpl(){
        this.lista = Arrays.asList(
        new Pais(1, "ESP","Espania"),
        new Pais(2, "MX","Mexico"),
        new Pais(3, "CH","Chile"),
        new Pais(4, "IT","Italia"), 
        new Pais(5, "FR","Francia"), 
        new Pais(6, "PER","Peru"), 
        new Pais(7, "ARG","Argentina"));
    }
    @Override
    public List<Pais> listar() {
       return lista;
    }

    @Override
    public Pais buscarPorId(Integer id) {
        Pais resultado = null;
        for (Pais pais : this.lista) {
           if(id == pais.getId()){
            resultado = pais;
            break;
           }
        }
        return resultado;
    }

}
