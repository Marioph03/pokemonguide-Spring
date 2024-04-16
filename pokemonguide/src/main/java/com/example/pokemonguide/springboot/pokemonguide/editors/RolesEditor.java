package com.example.pokemonguide.springboot.pokemonguide.editors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.pokemonguide.springboot.pokemonguide.services.RoleService;

@Component
public class RolesEditor extends PropertyEditorSupport{

    @Autowired
    private RoleService service;
    @Override
    public void setAsText(String idString) {
    try {
        Integer id = Integer.parseInt(idString);
        setValue(service.buscarPorId(id));
    } catch (NumberFormatException e) {
        setValue(null);
    }
    }

}