package edu.ifmt.adocao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ifmt.adocao.model.Titulo;
import edu.ifmt.adocao.repository.Titulos;

@Controller
@RequestMapping("/titulos")
public class TituloController {

    @Autowired
    private Titulos titulos;

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("titulo", new Titulo());
        return "CadastroTitulo";
    }

    @PostMapping
    public String salvar(Titulo titulo) {
        titulos.save(titulo);
        return "CadastroTitulo";
    }

}

