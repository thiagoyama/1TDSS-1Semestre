package br.com.fiap.empresa.model;

public class Funcionario {

	private int id;
	private String nome;
	private double salario;
	private String cpf;
	private String nivel;
	
	//Aumenta o salário em 2%
	public void aumentarSalario() {
		//salario *= 1.02;
		aumentarSalario(2);
	}
	
	//Aumenta o salário de acordo com a porcentagem (10%, 20%)
	public void aumentarSalario(double porcentagem) {
		salario *= porcentagem/100 + 1;
	}
	
	//Aumenta o salário: Junior (2000), Pleno (5000), Senior (8000)
	public boolean aumentarSalario(String nivel) {
		
	}

	public Funcionario() {
	}
	
	public Funcionario(int id, String nome, double salario, String cpf, String nivel) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.nivel = nivel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

}