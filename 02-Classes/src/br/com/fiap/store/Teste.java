package br.com.fiap.store;

public class Teste {

	//Criar o m�todo que come�a a execucao do programa Java
	//main -> CTRL + espa�o
	public static void main(String[] args) {
		
		//Criar um objeto do tipo Editora (instanciar a classe)
		Editora churros = new Editora();
		//Colocar informa��es dentro do objeto
		churros.nome = "Editora Abril";
		churros.endereco = "Marginal Tiete";
		churros.cnpj = "132.131.323/0001-12";
		
		//Criar um outro objeto do tipo Editora
		Editora atlas = new Editora();
		//Colocar informacoes dentro do objeto
		atlas.nome = "Editora Abril";
		atlas.endereco = "Marginal Tiete";
		atlas.cnpj = "132.131.323/0001-12";
		
		//Criar um objeto do tipo Ebook
		Ebook livroVirtual = new Ebook();
		//Colocar informacoes dentro do objeto
		livroVirtual.nome = "Java Como Programar";
		livroVirtual.idioma = "Portugues";
		livroVirtual.genero = "Informatica";
		livroVirtual.isbn = "1321123";
		livroVirtual.rating = 5;
		livroVirtual.valor = 197.5;
		livroVirtual.resumo = "Ensina programar tudo de Java";
		livroVirtual.quantidadePagina = 1000;
		livroVirtual.editora = atlas;
		
		//Exibir o nome da editora que esta na variavel churros
		//sysout -> CTRL + espaco
		System.out.println(churros.nome);
		
		//Exibir o nome, valor e o nome da editora do Ebook
		System.out.println(livroVirtual.nome + " " + 
				livroVirtual.valor + " " + livroVirtual.editora.nome);
		
	}
}






