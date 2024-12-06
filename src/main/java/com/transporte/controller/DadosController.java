package com.transporte.controller;

import com.transporte.model.Linha;
import com.transporte.repository.LinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/dados")
public class DadosController {

    @Autowired
    private LinhaRepository dadoRepository;

    @GetMapping("/consultar")
    public String consultar(@RequestParam String pesquisa, Model model) {
        List<Linha> dados = dadoRepository.findByNome(pesquisa);

        model.addAttribute("dados", dados);
        return "listagem";
    }
}
