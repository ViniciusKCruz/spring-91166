package com.example.projeto_senai91166.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class Welcome {
    @GetMapping
    public String welcome() {
        return "Bem-vindo ao projeto.";
    }
}
