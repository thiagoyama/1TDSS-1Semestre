package br.com.fiap.tds.model.livro;

public class LivroInfantil extends Livro {

	private String ilustrador;

	public LivroInfantil(int codigo, String titulo) {
		super(codigo, titulo);
	}
	
	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}
	
}
