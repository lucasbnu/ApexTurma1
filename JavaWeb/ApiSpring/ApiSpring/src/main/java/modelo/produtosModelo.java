package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="produtos")
@Entity
public class produtosModelo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_produto")
	private Integer id_produto;

	@Column(name="descricao_produto")
	private String descricao_produto;
	
	@Column(name="quantidade_estoque")
	private Integer quantidade_estoque;
	
	@Column(name="valor")
	private Double valor;

	public Integer getId_produto() {
		return id_produto;
	}

	public void setId_produto(Integer id_produto) {
		this.id_produto = id_produto;
	}

	public String getDescricao_produto() {
		return descricao_produto;
	}

	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	public Integer getQuantidade_estoque() {
		return quantidade_estoque;
	}

	public void setQuantidade_estoque(Integer quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
