package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="usuarios")
@Entity
public class usuariosModelo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private Integer id_usuario;

	@Column(name="nome_usuario")
	private String nome_usuario;
	
	@Column(name="senha")
	private String senha;
	
	@Column(name="nivel_acesso")
	private String nivel_acesso;

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNivel_acesso() {
		return nivel_acesso;
	}

	public void setNivel_acesso(String nivel_acesso) {
		this.nivel_acesso = nivel_acesso;
	}
	
}
