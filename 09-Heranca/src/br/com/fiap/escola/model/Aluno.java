package br.com.fiap.escola.model;

public class Aluno extends Pessoa {

	private int rm;

	private String turma;
	
	public Aluno() {}
	
	//Construtor codigo, nome, cpf, endereco, rm, turma
	public Aluno(int codigo, String nome, String cpf,
			Endereco endereco, int rm, String turma) {
		super(codigo, nome, cpf, endereco);
		this.rm = rm;
		this.turma = turma;
	}
	
	public Aluno(int codigo, String nome, 
					String cpf, Endereco endereco) {
		super(codigo, nome, cpf, endereco);
	}

	public void estudar() {

	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

}