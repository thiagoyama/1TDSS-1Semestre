package br.com.fiap.construtores.model;

public class Bicicleta {

	// Atributos
	private int aro;
	private String modelo;
	private float peso;
	private Fabricante fabricante;
	
	//Implementar um construtor que recebe todos os atributos

	public String retornarDetalhes() {
		return modelo + " Aro: " + aro + " Peso: " + peso;
	}
	
	//Getters e Setters
	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

}
