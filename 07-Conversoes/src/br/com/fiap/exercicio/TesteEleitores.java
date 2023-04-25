package br.com.fiap.exercicio;

import javax.swing.JOptionPane;

public class TesteEleitores {
	
	public static void main(String[] args) {
		
		//Armazena a qtd total de eleitores obrigatórios
		int qtd = 0;
		
		//Laço de repetição 
		//(variavel de controle, condiçao de parada, incremento)
		for (int i = 0; i < 3; i++ ) {			
			//Ler a idade
			int idade = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a idade"));
			
			//Classificar a classe eleitoral
			if (idade >= 18 && idade <= 65) {
				qtd++;
				JOptionPane.showMessageDialog(null, "Eleitor obrigatório");
			} else if (idade == 16 || idade == 17 || idade > 65) {
				JOptionPane.showMessageDialog(null, "Eleitor facultativo");
			} else {
				JOptionPane.showMessageDialog(null, "Não eleitor");
			}
		}//for
		
		JOptionPane.showMessageDialog(null, "Total de eleitores: " + qtd);
		
	}//main	
}//class