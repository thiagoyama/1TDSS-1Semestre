package br.com.fiap.store;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		//Criar o objeto que le os dados inseridos pelo usuario
		Scanner leitor = new Scanner(System.in);
		
		//Ler o nome do aluno
		System.out.println("Digite o nome do aluno");
		String nome = leitor.next(); //Le uma String
		
		//Ler as notas
		System.out.println("Digite a nota do checkpoint 1");
		float cp1 = leitor.nextFloat();
		
		System.out.println("Digite a nota do checkpoint 2");
		float cp2 = leitor.nextFloat();
		
		System.out.println("Digite a nota do checkpoint 3");
		float cp3 = leitor.nextFloat();
		
		System.out.println("Digite a nota do challenge");
		float challenge = leitor.nextFloat();
		
		System.out.println("Digite a nota da global");
		float global = leitor.nextFloat();
		
		//Calcular a media do checkpoint
		float mediaCp = (cp1 + cp2 + cp3)/3;
		
		//Calcular a media final do semestre
		double media = mediaCp*0.2 + challenge*0.2 + global*0.6;
		
		//Exibir o nome e a media final do semestre
		System.out.println();
		System.out.println(nome + " " + media);
		//sysout CTRL + espaco
	}
}