package com.example.demo.controller;

import com.example.demo.model.Funcionario;
import com.example.demo.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @GetMapping("/cadastro")
    public String exibirFormulario(Model model) {
        model.addAttribute("funcionario", new Funcionario());
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String salvar(@ModelAttribute Funcionario funcionario) {
        repository.save(funcionario);
        return "redirect:/lista";
    }

    @GetMapping("/lista")
    public String listar(Model model) {
        model.addAttribute("funcionarios", repository.findAll());
        return "lista";
    }
}