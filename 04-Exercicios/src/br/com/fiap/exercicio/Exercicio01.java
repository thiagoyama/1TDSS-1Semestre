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
		
		System.out.println("Digite a cp2");
		aluno.cp2 = leitor.nextDouble();
		
		System.out.println("Digite a cp3");
		aluno.cp3 = leitor.nextDouble();
		
		System.out.println("Digite o challenge");
		aluno.challenge = leitor.nextDouble();
		
		System.out.println("Digite a global");
		aluno.global = leitor.nextDouble();
		
		//Calcular a media semestral do aluno
		double media = aluno.calcularMediaSemestre();
		
		//Exibir o nome e a media do aluno
		System.out.println(aluno.nome + " " + media);
		
		//Fechar o leitor
		leitor.close();
	}
}