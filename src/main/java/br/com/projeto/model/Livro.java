package br.com.projeto.model;

import javax.enterprise.inject.Default;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;;

@Entity
public class Livro {
	
	
	@Id
	@GeneratedValue
	private int id_livro;
	
	@Column
	private String titulo;
	
	@Column
	private int qtd_paginas;
	
	@Column
	private String categoria;
	
	public int getId_livro() {
		return id_livro;
	}
	
	public Livro(){}
	
	public Livro(String titulo, int qtd_paginas, String categoria) {
		this.titulo = titulo;
		this.qtd_paginas = qtd_paginas;
		this.categoria = categoria;
	}
	
	public void setId_livro(int id_livro) {
		this.id_livro = id_livro;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQtd_paginas() {
		return qtd_paginas;
	}
	public void setQtd_paginas(int qtd_paginas) {
		this.qtd_paginas = qtd_paginas;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
