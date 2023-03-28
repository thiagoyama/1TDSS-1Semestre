package br.com.fiap.padaria.model;

public class Produto {

	int id;
	String nome;
	double precoCusto;
	double precoVenda;
	int quantidade;
	
	double calcularLucro() {
		double churros = precoVenda - precoCusto;
		return churros;
	}
	
	void atualizarEstoque(int qtd) {
		quantidade += qtd;
	}
	
}