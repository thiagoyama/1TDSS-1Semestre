package br.com.fiap.exercicio.model;

public class Formacao {

	protected String descricao;
	private int periodo;
	private double mensalidade;
	protected int duracao;

	public void definirDuracao() {
//		//valida se a instancia é do tipo Medio
//		if (this instanceof Medio) {
//			duracao = 24;
//		}
	}

	public double calcularMedia(double global1, double global2) {
		return global1 * 0.4 + global2 * 0.6;
	}

	public double calcularMedia(double global1, double cp1, double challenge1, double global2, 
			double cp2,	double challenge2) {
		// Calcular a media do 1 semestre
		double s1 = global1 * 0.6 + cp1 * 0.2 + challenge1 * 0.2;
		// Calcular a media do 2 semestre
		double s2 = global2 * 0.6 + cp2 * 0.2 + challenge2 * 0.2;
		return calcularMedia(s1, s2);
	}

	public double calcularMedia(double cp1, double cp2, double cp3) {
		double media;
		if (cp1 <= cp2 && cp1 <= cp3) {
			media = (cp2 + cp3)/2; //cp1 é a menor
		} else if (cp2 <= cp1 && cp2 <= cp3) {
			media = (cp1 + cp3)/2; //cp2 é a menor
		} else {
			media = (cp1 + cp2)/2; //cp3 é a menor
		}
		return media;
	}
	
	public String toString() {
		return descricao + " Periodo: " + periodo 
				+ " Mensalidade: " + mensalidade + 
				" Duracao: " + duracao;
	}

	// Construtores
	public Formacao() {
		super();
	}
	
	public Formacao(String descricao, int periodo) {
		this.descricao = descricao;
		this.periodo = periodo;
	}

	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}

	// Getters e Setters
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

}
