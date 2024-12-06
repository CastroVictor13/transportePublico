package com.transporte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class InserirController {

    @GetMapping("/inserir")
    public String exibirTelaInserir() {
        return "inserir";
    }

    @PostMapping("/salvar")
    public String salvar() {
        return "redirect:/linha/consultar";
    }
}
