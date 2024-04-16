package com.example.pokemonguide.springboot.pokemonguide.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.pokemonguide.springboot.pokemonguide.models.Role;

@Component
public class RoleServiceImpl implements RoleService{
    private List<Role> roles;

    public RoleServiceImpl(){
        this.roles = new ArrayList<>();
        this.roles.add(new Role(1, "Administrador", "ROLE_ADMIN"));
        this.roles.add(new Role(2, "Usuario", "ROLE_USER"));
        this.roles.add(new Role(3, "Moderador", "ROLE_MODERADOR"));
    }

    @Override
    public List<Role> listar() {
        return roles;
    }

    @Override
    public Role buscarPorId(Integer id) {
        Role resultado = null;
        for (Role role : roles) {
            if (id == role.getId()) {
                resultado = role;
                break;
            }
        }
        return resultado;
    }
}
