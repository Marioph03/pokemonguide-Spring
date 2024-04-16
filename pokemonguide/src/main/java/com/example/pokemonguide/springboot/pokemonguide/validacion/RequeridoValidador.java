package com.example.pokemonguide.springboot.pokemonguide.validacion;

import org.springframework.util.StringUtils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RequeridoValidador implements ConstraintValidator<Requerido, String>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || !StringUtils.hasText(value)) {
            return false;
        }
        return true;
    }

}
