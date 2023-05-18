package br.com.fiap.empresa.model;

public class Gerente extends Funcionario {

	private double bonus;
	
	private String beneficios;
	
	//Sobrescrever o método aumentar salário por nível
	//Junior 10000, Pleno 14000, Senior 30000
	@Override
	public boolean aumentarSalario(String nivel) {
		boolean aumentou = false;
		if (nivel.equalsIgnoreCase("junior") && salario < 10000) {
			salario = 10000;
			aumentou = true;
		} else if (nivel.equalsIgnoreCase("pleno") && salario < 14000) {
			salario = 14000;
			aumentou = true;
		} else if (nivel.equalsIgnoreCase("senior") && salario < 30000) {
			salario = 30000;
			aumentou = true;
		}
		return aumentou;
	}
	
	//Sobrescrever o método aumentarSalario que recebe o double
	//Aumentar o salario de acordo com porcentagem e aumentar o bonus com a %
	@Override
	public void aumentarSalario(double porcentagem) {
		bonus *= porcentagem/100 + 1;
		super.aumentarSalario(porcentagem); //Chamando o método do Funcionario (Pai)
	}
	
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
