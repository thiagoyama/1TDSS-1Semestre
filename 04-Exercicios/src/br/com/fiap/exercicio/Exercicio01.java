package br.com.fiap.exercicio;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		//Instanciar o objeto para ler o teclado
		Scanner leitor = new Scanner(System.in);
		
		//Instanciar um Aluno
		Aluno aluno = new Aluno();
		
		//Ler o nome do aluno
		System.out.println("Digite o nome do aluno");
		aluno.nome = leitor.next();
		
		//Ler as notas do aluno
		System.out.println("Digite a cp1");
		aluno.cp1 = leitor.nextDouble();
		
		
		
		//Calcular a media semestral do aluno
		
		//Exibir o nome e a media do aluno
		
	}
}