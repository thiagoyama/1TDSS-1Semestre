package br.com.fiap.empresa.model;

public class Vendedor extends Funcionario {

	private double comissao;

	private double meta;
	
	public Vendedor() {
	}

	public Vendedor(int id, String nome, double salario, String cpf, String nivel, double comissao, double meta) {
		super(id, nome, salario, cpf, nivel);
		this.comissao = comissao;
		this.meta = meta;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getMeta() {
		return meta;
	}

	public void setMeta(double meta) {
		this.meta = meta;
	}

}
