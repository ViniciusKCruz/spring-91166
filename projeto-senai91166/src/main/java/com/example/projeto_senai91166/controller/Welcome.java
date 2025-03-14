package com.example.projeto_senai91166.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class Welcome {
    @GetMapping("/welcome")
    public String welcome() {
        return "Bem-vindo ao projeto.";
    }

    @GetMapping("/lanchonetes")
    public String lanchonetes(){
        return "Rei dos Burgers - Rei dos Burgers";
    }
}
