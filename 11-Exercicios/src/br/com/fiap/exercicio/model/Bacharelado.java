package br.com.fiap.exercicio.model;

public class Bacharelado extends Formacao {

	private String projetoConclusao;
	
	private int cargaHorariaEstagio;
	
	public double calcularMensalidade(double fator) {
		return duracao * fator * 600 + cargaHorariaEstagio * 12;
	}

	public void definirDuracao() {
		//valida se existe a palavra "engenharia" na descricao
		if (descricao.toLowerCase().contains("engenharia")) {
			duracao = 60;
		} else {
			duracao = 48;
		}
	}
	
	public Bacharelado(String descricao, int periodo, String projetoConclusao, int cargaHorariaEstagio) {
		super(descricao, periodo);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	//getters e setters
	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
}
