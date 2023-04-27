package br.com.fiap.strings.view;

public class ExemploComparacao {

	public static void main(String[] args) {
		
		//Declarar duas Strings
		String nome = "Fiap Faculdade de Tecnologia";
		String nome2 = new String("FIAP");
		
		//Verificar se os nomes são iguais
		if (nome.equals(nome2)) {
			System.out.println("Nomes iguais");
		} else {
			System.out.println("Nomes diferentes");
		}
		
		//Verificar se os nomes sao iguais, não diferenciando maiusculas e minusculas
		if (nome.equalsIgnoreCase(nome2)) {
			System.out.println("Nomes iguais");
		} else {
			System.out.println("Nomes diferentes");
		}
		
		//Imprimir a quantidade de letras da variavel nome
		System.out.println("Qtd de letras: " + nome.length());
		
		//Validar se o nome possui menos do que 20 caracteres
		if (nome.length() <= 20) {
			System.out.println("Possui 20 ou menos caracteres");
		} else {
			System.out.println("Possui mais do que 20 caracteres");
		}
		
	}//main
}//class