package br.com.projetoweb.produto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author jhona
 */
@Entity
@Table(name = "produto")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "titulo", length = 150, nullable = false)
    private String titulo;
    
    @Column(name = "vendedor", length = 100, nullable = false)
    private String vendedor;
    
    @Column(name = "descricao", columnDefinition="text", nullable = true)
    private String descricao;
    
    @Column(name = "dataregistro", nullable = false)
    private LocalDateTime dataRegistro;
    
    @Column(name = "categoria", length = 45, nullable = true)
    private String categoria;
    
    @Column(name = "enderecoretirada", length = 150, nullable = false)
    private String enderecoRetirada;
    
    @Column(name = "precounidade", precision = 7, scale = 2, nullable = false)
    private BigDecimal precoUnidade;
    
    @Column(name = "quantidade", nullable = false)
    private int quantidade;
    
    @Column(name = "lote", length = 20, nullable = false)
    private String lote;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEnderecoRetirada() {
        return enderecoRetirada;
    }

    public void setEnderecoRetirada(String enderecoRetirada) {
        this.enderecoRetirada = enderecoRetirada;
    }

    public BigDecimal getPrecoUnidade() {
        return precoUnidade;
    }

    public void setPrecoUnidade(BigDecimal precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
}
