package br.com.projetoweb.produto.repositories;

import br.com.projetoweb.produto.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
