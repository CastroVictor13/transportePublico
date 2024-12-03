package com.transporte.controller;

import com.transporte.model.Linha;
import com.transporte.service.LinhaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/linhas")
public class LinhaController {
    private final LinhaService service;

    public LinhaController(LinhaService service) {
        this.service = service;
    }

    @GetMapping
    public String listarLinhas(Model model) {
        model.addAttribute("linhas", service.listar());
        return "consultar";
    }

    @PostMapping
    public String salvarLinha(@ModelAttribute Linha linha) {
        service.salvar(linha);
        return "redirect:/linhas";
    }

    @GetMapping("/{numero}")
    public String buscarPorNumero(@PathVariable String numero, Model model) {
        List<Linha> linhas = service.buscarPorNumero(numero);
        model.addAttribute("linhas", linhas);
        return "consultar";
    }

    @PostMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        service.deletar(id);
        return "redirect:/linhas";
    }
}
