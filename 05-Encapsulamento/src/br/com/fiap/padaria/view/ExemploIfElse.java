package br.com.fiap.padaria.view;

public class ExemploIfElse {

	public static void main(String[] args) {
	
		//declarar uma variavel do tipo int
		int x = 10;
		
		//verificar se o valor da variavel eh par ou impar
		// ==, !=, >, <, >=, <=, && (and), || (or), ! (not)
		// if (condicao) { }
		if ( x % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		//verificar se o valor eh maior do que 20 ou menor do que 5
		if (x > 20 || x < 5) {
			System.out.println("Valor maior do que 20 ou menor do que 5");
		//verificar se o numero eh maior do que 10
		} else if (x > 10) {
			System.out.println("Valor maior do que 10 e menor do que 21");
		//exibir o intervalo do valor
		} else {
			System.out.println("Valor esta entre 5 e 10");
		}
		
	}
	
}