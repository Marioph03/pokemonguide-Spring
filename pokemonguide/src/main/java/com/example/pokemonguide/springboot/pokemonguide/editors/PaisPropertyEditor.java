package com.example.pokemonguide.springboot.pokemonguide.editors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.pokemonguide.springboot.pokemonguide.services.PaisService;

@Component
public class PaisPropertyEditor extends PropertyEditorSupport {

    @Autowired
    private PaisService service;

    @Override
    public void setAsText(String idString) {

        try {
            Integer id = Integer.parseInt(idString);
            this.setValue(service.buscarPorId(id));
        } catch (NumberFormatException e) {
            setValue(null);
        }
    }
}
