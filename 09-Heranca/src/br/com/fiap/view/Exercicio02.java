package br.com.fiap.view;

import br.com.fiap.model.eletronico.Smartphone;
import br.com.fiap.tds.model.livro.Editora;
import br.com.fiap.tds.model.livro.Livro;
import br.com.fiap.tds.model.livro.LivroInfantil;
import br.com.fiap.tds.model.produto.Produto;

public class Exercicio02 {

	public static void main(String[] args) {
		Smartphone iphone = new Smartphone(10, "Iphone");
		iphone.setCodigo(8);
		
		Editora editora = new Editora();
		Livro livro = new Livro(10, "Java como programar", editora);
		
		Produto produto = new Livro(1, "Harry Potter");
		Produto produto2 = new LivroInfantil(12, "João é o pé de feijão");
		Produto produto3 = new Smartphone(12, "Xiaomi");
		
		Livro livro1 = new LivroInfantil(1, "João e Maria");
		
	}
}