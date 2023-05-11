package br.com.fiap.empresa.model;

public class Gerente extends Funcionario {

	private double bonus;
	
	private String beneficios;
	
	public Gerente() {
	}
	
	public Gerente(int id, String nome, double salario, String cpf, String nivel, double bonus, String beneficios) {
		super(id, nome, salario, cpf, nivel);
		this.bonus = bonus;
		this.beneficios = beneficios;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	
}
