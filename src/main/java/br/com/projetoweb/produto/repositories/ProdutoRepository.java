/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetoweb.produto.repositories;

import br.com.projetoweb.produto.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jhona
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
