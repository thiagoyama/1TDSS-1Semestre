package br.com.fiap.escola.model;

public class Professor extends Pessoa {

	private double salario;
	
	private int cargaHoraria;
	
	public Professor(int codigo, String nome,
				String cpf, Endereco endereco, 
				double salario, int cargaHoraria) {
		super(codigo, nome, cpf, endereco);
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
	}
	
	public Professor(int codigo, String nome,
					String cpf, Endereco endereco) {
		super(codigo, nome, cpf, endereco);
	}
	
	public void aplicarProva() {
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
}
