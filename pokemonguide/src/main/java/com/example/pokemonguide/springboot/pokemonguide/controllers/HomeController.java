package com.example.pokemonguide.springboot.pokemonguide.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String index(){
        return "index";
    }

    @GetMapping("/pokemon")
    public String pokemon(){
        return "pokemon";
    }

    @GetMapping("/item")
    public String item(){
        return "item";
    }

    @GetMapping("/gym-leader")
    public String gymLeader(){
        return "gym-leader";
    }

    @GetMapping("/entrenador")
    public String entrenador(){
        return "entrenador";
    }
}
