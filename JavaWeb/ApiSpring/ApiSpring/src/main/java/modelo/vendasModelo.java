package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="vendas")
@Entity
public class vendasModelo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_venda")
	private Integer id_venda;
	
	@Column(name="fk_produto")
	private Integer fk_produto;
	
	@Column(name="fk_cliente")
	private Integer fk_cliente;
	
	@Column(name="quantidade")
	private Integer quantidade;

	public Integer getId_venda() {
		return id_venda;
	}

	public void setId_venda(Integer id_venda) {
		this.id_venda = id_venda;
	}

	public Integer getFk_produto() {
		return fk_produto;
	}

	public void setFk_produto(Integer fk_produto) {
		this.fk_produto = fk_produto;
	}

	public Integer getFk_cliente() {
		return fk_cliente;
	}

	public void setFk_cliente(Integer fk_cliente) {
		this.fk_cliente = fk_cliente;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
