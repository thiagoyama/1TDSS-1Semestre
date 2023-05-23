package br.com.fiap.exercicio.model;

public class Medio extends Formacao {

	private String tipo;
	
	public double calcularMensalidade(double fator) {
		return duracao * fator * 500;
	}
	
	//sobrescrita do método
	public void definirDuracao() {
		duracao = 36;
	}
	
	public Medio(String descricao, int periodo, String tipo) {
		super(descricao, periodo);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
