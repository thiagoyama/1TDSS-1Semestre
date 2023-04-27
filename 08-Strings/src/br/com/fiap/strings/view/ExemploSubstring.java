package br.com.fiap.strings.view;

import javax.swing.JOptionPane;

public class ExemploSubstring {
	
	public static void main(String[] args) {
		//Ler um nome completo (nome e sobrenome), com JOPtionPane
		String nome = JOptionPane.showInputDialog("Digite o nome e sobrenome");
		
		//Exibir o nome "Pedro Archilha"
		String primeiroNome = nome.substring(0, nome.indexOf(" "));
		System.out.println(primeiroNome);		
		
		//Exibir o sobrenome
		
		//Ler uma data (dd/mm/aaaa)
		
		//Exibir o dia
		
		//Exibir o mês 
		
		//Exibir o ano
		
		//Ler um e-mail
		
		//Exibir o dominio do email
		
	}//main
}//class