package br.com.projetoweb.produto.controllers;

import br.com.projetoweb.produto.entities.Produto;
import br.com.projetoweb.produto.repositories.ProdutoRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoRepository prodRepository;

    @PostMapping(value = "/cadastrar-produto")
    public String cadastrarProduto(Produto prod) throws Exception {

        try {
            prod.setDataRegistro(LocalDateTime.now());
            prodRepository.save(prod);
            return "redirect:/index.html";
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @DeleteMapping(value = "/deletar-produto")
    public String deletarProduto(@RequestParam Long id) throws Exception {

        try {
            prodRepository.findById(id).get();
            prodRepository.deleteById(id);
            return "redirect:/index.html";
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @GetMapping(value = "/form-config-atualizar")
    public String formAtualizarProduto(@RequestParam Long id, Model model) throws Exception {

        try {
            Produto prod = prodRepository.findById(id).get();
            model.addAttribute("produto", prod);
            return "form-confirmar-atualizar";
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @PutMapping(value = "/confirmar-atualizar")
    public String atualizarProduto(Produto prod) throws Exception {

        try {
            prod.setDataRegistro(LocalDateTime.now());
            prodRepository.save(prod);
            return "redirect:/index.html";
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @GetMapping(value = "/buscar-id")
    public String buscarPorId(@RequestParam Long id, Model model) throws Exception {

        try {
            Produto prod = prodRepository.findById(id).get();
            model.addAttribute("produto", prod);
            return "resultado-buscar-id";
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @GetMapping(value = {"/", "/index.html"})
    public String consultarTodos(Model model) throws Exception {

        try {
            List<Produto> prodLista = prodRepository.findAll();
            model.addAttribute("produto", prodLista);
            return "index";
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
