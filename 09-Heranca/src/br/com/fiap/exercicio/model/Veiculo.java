package br.com.fiap.exercicio.model;

public class Veiculo {

	private String modelo;
	
	private int quantidadeLugares;
	
	private int anoFabricacao;
	
	private double comprimento;
	
	private Cor cor;
	
	public Veiculo() {}
	
	public Veiculo(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, Cor cor) {
		this.modelo = modelo;
		this.quantidadeLugares = quantidadeLugares;
		this.anoFabricacao = anoFabricacao;
		this.comprimento = comprimento;
		this.cor = cor;
	}

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