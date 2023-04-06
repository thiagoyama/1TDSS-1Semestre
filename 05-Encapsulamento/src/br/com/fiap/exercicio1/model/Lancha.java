package br.com.fiap.exercicio1.model;

public class Lancha {

	private String modelo;
	
	private int quantidadeLugares, anoFabricacao, quantidadeMotores;
	
	private double comprimento;
	
	private Cor cor;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidadeLugares() {
		return quantidadeLugares;
	}

	public void setQuantidadeLugares(int quantidadeLugares) {
		this.quantidadeLugares = quantidadeLugares;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getQuantidadeMotores() {
		return quantidadeMotores;
	}

	public void setQuantidadeMotores(int quantidadeMotores) {
		this.quantidadeMotores = quantidadeMotores;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
}
