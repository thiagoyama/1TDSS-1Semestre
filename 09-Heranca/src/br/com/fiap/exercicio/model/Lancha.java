package br.com.fiap.exercicio.model;

public class Lancha extends Veiculo {

	private int quantidadeMotores;
	
	public Lancha() {}
	
	public Lancha(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, Cor cor,
			int quantidadeMotores) {
		super(modelo, quantidadeLugares, anoFabricacao, comprimento, cor);
		this.quantidadeMotores = quantidadeMotores;
	}

	public int getQuantidadeMotores() {
		return quantidadeMotores;
	}

	public void setQuantidadeMotores(int quantidadeMotores) {
		this.quantidadeMotores = quantidadeMotores;
	}
	
}
