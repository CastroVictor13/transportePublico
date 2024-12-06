package com.transporte.controller;

import com.transporte.model.Linha;
import com.transporte.repository.LinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/linhas")
public class LinhaController {

    @Autowired
    private LinhaRepository linhaRepository;

    @GetMapping("/consultar")
    public String consultar(@RequestParam(required = false) Long id,
                            @RequestParam(required = false) String numero,
                            Model model) {
        List<Linha> linhas = new ArrayList<>();

        if (id != null) {
            linhaRepository.findById(id).ifPresent(linhas::add);
        }
        else if (numero != null && !numero.isEmpty()) {
            linhas = linhaRepository.findByNumero(numero);
        }
        else {
            linhas = linhaRepository.findAll();
        }

        model.addAttribute("linhas", linhas);
        return "listagem";
    }
}
