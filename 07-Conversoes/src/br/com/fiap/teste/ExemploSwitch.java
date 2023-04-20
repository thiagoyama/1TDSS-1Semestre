package br.com.fiap.teste;

import javax.swing.JOptionPane;

public class ExemploSwitch {
	
	public static void main(String[] args) {
		
		//Ler dois numeros
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero"));
		
		//Ler uma opçao: 1 - Somar, 2 - Subtrair, 3 - Multiplicar, 4 - Dividir
		int op = Integer.parseInt(
				JOptionPane.showInputDialog("Digite: \n1-Somar \n2-Subtrair \n3-Multiplicar \n4-Dividir"));

		//Realizar a opcao escolhida
		switch (op) {
			case 1: 
				double soma = n1 + n2;
				JOptionPane.showMessageDialog(null, "Soma é " + soma);
				break;
			case 2:
				double subtracao = n1 - n2;
				JOptionPane.showMessageDialog(null, "A subtracao é " + subtracao);
				break;
			case 3:
				double multiplicacao = n1 * n2;
				JOptionPane.showMessageDialog(null, "A multiplicacao é " + multiplicacao);
				break;
			case 4:
				double divisao = n1 / n2;
				JOptionPane.showMessageDialog(null, "A divisao é " + divisao);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
		}//switch
	}//main
}//class
