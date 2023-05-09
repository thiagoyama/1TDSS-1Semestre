package br.com.fiap.exercicio.model;

public class Carro extends Veiculo {

	private int quantidadePortas;
	
	private String placa;
	
	private float motor = 1;
	
	public Carro() {}
	
	public Carro(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, Cor cor,
			int quantidadePortas, String placa, float motor) {
		super(modelo, quantidadeLugares, anoFabricacao, comprimento, cor);
		this.quantidadePortas = quantidadePortas;
		this.placa = placa;
		this.motor = motor;
	}



	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getMotor() {
		return motor;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	}
	
}
