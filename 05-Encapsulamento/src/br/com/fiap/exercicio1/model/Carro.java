package br.com.fiap.exercicio1.model;

public class Carro {

	private String modelo, placa;
	
	private int quantidadePorta, quantidadeLugares, anoFabricacao;
	
	private double comprimento;
	
	private Cor cor;

	private float motor = 1;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getQuantidadePorta() {
		return quantidadePorta;
	}

	public void setQuantidadePorta(int quantidadePorta) {
		this.quantidadePorta = quantidadePorta;
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

	public float getMotor() {
		return motor;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	}
	
}
