package br.com.fiap.escola.model;

public class Professor extends Pessoa {

	private double salario;
	
	private int cargaHoraria;
	
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
