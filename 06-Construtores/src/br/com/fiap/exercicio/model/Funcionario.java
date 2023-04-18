package br.com.fiap.exercicio.model;

public class Funcionario {

	private String nome;
	
	private long matricula;
	
	private Profissao profissao;
	
	private double salario;

	public Funcionario() {
	}
	
	public Funcionario(long matricula) {
		this.matricula = matricula;
	}
	
	public Funcionario(long matricula, String nome) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public Funcionario(long matricula, String nome, Profissao profissao) {
		this.nome = nome;
		this.matricula = matricula;
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
