package com.example.pokemonguide.springboot.pokemonguide.validacion;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.pokemonguide.springboot.pokemonguide.models.Usuario;

@Component
public class UsuarioValidador implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
       return Usuario.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //Usuario usuario = (Usuario) target;
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombreDelUsuario", 
        "requerido.usuario.nombreDelUsuario");

        /*if (!usuario.getId().matches("[0-9]{2}[.][\\d]{3}[.][\\d]{3}[-][A-Z]{1}")) {
            errors.rejectValue("id", "pattern.usuario.id");
        }*/
    }

}
