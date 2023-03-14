package br.com.fiap.store;

import java.util.Scanner;

public class TesteOperadoresAritmeticos {

	public static void main(String[] args) {
		//Criar um objeto que le o teclado
		Scanner leitor = new Scanner(System.in);
		
		//Declarar uma variavel com a quantidade de alunos da turma
		System.out.println("Digite a quantidade de alunos:");
		int alunos = leitor.nextInt();
		alunos++; //Adiciona 1 aluno na variavel
		
		//Adicionar 6 alunos na turma
		alunos += 6; //alunos = alunos + 6;
		
		//Calcular quantos grupos de 5 alunos do Challenge
		int grupos = alunos / 5;
		System.out.println("Grupos com 5 alunos: " + grupos);
		
		//Calcular quantos alunos formaram o ultimo grupo
		int grupoVencedor = alunos % 5;
		System.out.println("Alunos do ultimo grupo: " + grupoVencedor);
		
		int x = 10;
		x %= 2; //x = x % 2;
		x -= 6; //x = x - 6;
		x *=5; //x = x * 5;
		x /=6; //x = x / 6;
		System.out.println(x);
		
	}
}