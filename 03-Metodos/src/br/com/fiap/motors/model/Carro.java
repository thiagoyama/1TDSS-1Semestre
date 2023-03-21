package br.com.fiap.motors.model;

public class Carro {
	// Atributos
	String modelo;

	int ano;

	double valor;

	// Metodos
	// idade calcularIdade(ano atual)
	int calcularIdade(int anoAtual) {
		// Calcular a idade
		int idade = anoAtual - ano;
		// Retornar a idade
		return idade;
	}
	
	// atualizar o valor do carro
	void atualizarValor(double porcentagem) {
		valor *= (1 + porcentagem);
	}
	
	// Criar um metodo que calcula e retorna o valor do seguro do carro
	// Seguro do carro eh baseado no valor, 5% do valor do carro
	double calcularSeguro() {
		double seguro = valor * 0.05;
		return seguro;
	}

	// Criar um metodo que recebe a quantidade de parcelas, calcula e retorna
	//o valor da parcela do seguro
	double calcularValorParcelaSeguro(int parcelas) {
		double parcela = (valor * 0.05) / parcelas;
		return parcela;
	}
	
}





