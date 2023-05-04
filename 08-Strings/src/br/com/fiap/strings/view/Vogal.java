package br.com.fiap.strings.view;

import javax.swing.JOptionPane;

public class Vogal {

	public static void main(String[] args) {
		//Ler uma palavra 
		String palavra = JOptionPane.showInputDialog("Digite uma palavra");
		
		//Substituir as vogais por *
		String vogal = palavra
				.replace("a", "*")
				.replace("e", "*")
				.replace("i", "*")
				.replace("o", "*")
				.replace("u", "*");
		
		//Exibir o resultado
		JOptionPane.showMessageDialog(null, vogal);
		
	}
}