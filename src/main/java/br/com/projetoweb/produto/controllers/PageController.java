package br.com.projetoweb.produto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping(value = "/form-cadastrar.html")
    public String pageFormCadastrar(){
        return "form-cadastrar";
    }
    
    @GetMapping(value = "/form-deletar.html")
    public String pageFormDeletar(){
        return "form-deletar";
    }
    
    @GetMapping(value = "/form-atualizar.html")
    public String pageFormAtualizar(){
        return "form-atualizar";
    }
    
    @GetMapping(value = "/form-buscar-id.html")
    public String pageFormBuscarId(){
        return "form-buscar-id";
    }
}
