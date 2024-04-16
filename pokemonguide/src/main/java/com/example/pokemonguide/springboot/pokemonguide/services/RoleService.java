package com.example.pokemonguide.springboot.pokemonguide.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pokemonguide.springboot.pokemonguide.models.Role;

@Service
public interface RoleService {
public List<Role> listar();
public Role buscarPorId(Integer id);
}
