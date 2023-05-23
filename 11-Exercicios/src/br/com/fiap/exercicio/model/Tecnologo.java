package br.com.fiap.exercicio.model;

public class Tecnologo extends Formacao {

	private boolean planoEstendido;
	
	public double calcularMensalidade(double fator) {
		return duracao * 600 * fator;
	}

	public void definirDuracao() {
		duracao = 24;
	}
	
	public String toString() {
		return super.toString() + " Plano: " + planoEstendido;
	}
	
	public Tecnologo(String descricao, int periodo, boolean planoEstendido) {
		super(descricao, periodo);
		this.planoEstendido = planoEstendido;
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
}
