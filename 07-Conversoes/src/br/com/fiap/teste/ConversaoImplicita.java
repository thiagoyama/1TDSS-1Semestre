package br.com.fiap.teste;

import javax.swing.JOptionPane;

public class ConversaoImplicita {

	public static void main(String[] args) {

		//Ler a populacao da cidade de Bauru
		int populacao = Integer.parseInt(JOptionPane.showInputDialog("Qual a população de Bauru?"));
		
		//Quais tipos de variaveis é possível colocar a população?
		float populacaoFloat = populacao;
		double populacaoDouble = populacao;
		long populacaoLong = populacao;
		
		//Não funciona!
		//short populacaoShort = populacao;
		//populacaoFloat = populacaoDouble;
		
		//Exibir a populacao
		JOptionPane.showMessageDialog(null, populacaoLong);
		
	}
}