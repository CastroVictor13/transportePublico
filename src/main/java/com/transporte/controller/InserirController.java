package com.transporte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class InserirController {

    @GetMapping("/inserir")
    public String exibirTelaInserir() {
        // Retorna a página inserir.html
        return "inserir";
    }
}
