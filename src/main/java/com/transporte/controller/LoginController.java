package com.transporte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/")
    public String loginPage() {
        return "login"; // Tela de login (login.html)
    }

    @PostMapping("/login")
    public String validateLogin(@RequestParam String username, @RequestParam String password, Model model) {
        if ("admin".equals(username) && "admin".equals(password)) {
            return "redirect:/consultar";
        }
        model.addAttribute("error", "Usuário ou senha inválidos!");
        return "login";
    }

    @GetMapping("/consultar")
    public String consultarPage() {
        return "consultar";
    }
}

