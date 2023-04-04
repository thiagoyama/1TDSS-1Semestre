package br.com.fiap.padaria.view;

import br.com.fiap.padaria.model.Produto;

public class Terminal {

	//Criar o método: main + CTRL + espaco
	public static void main(String[] args) {
		//Instanciar um produto
		Produto p = new Produto();
		
		//Ajustar para utilizar os métodos set
		p.setNome("Livro Java");
		p.setId(5);
		p.setPrecoCusto(50);
		p.setPrecoVenda(150);
		p.setPromocao(true);
		p.atualizarEstoque(10);
		
		//Exibir os atributos do produto
		//Id, nome, preco custo, preco venda, promocao, qtd
		System.out.println(p.getId() + 
				" " + p.getNome() +  
				" " + p.getPrecoCusto() + 
				" " + p.getPrecoVenda() + 
				" " + p.isPromocao() +
				" " + p.getQuantidade());
		
		//Exibir o valor do lucro do produto
		double churros = p.calcularLucro();
		System.out.println("Lucro: " + churros);
		
	}
}