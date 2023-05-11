package br.com.fiap.tds.model.livro;

import br.com.fiap.tds.model.produto.Produto;

public class Livro extends Produto {

	private String autor;
	private String titulo;
	private String isbn;
	private Editora editora;
	
	public Livro(int codigo, String titulo) {
		super(codigo);
		this.titulo = titulo;
	}
	
	public Livro(int codigo, String titulo, Editora editora) {
		super(codigo);
		this.titulo = titulo;
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

}
