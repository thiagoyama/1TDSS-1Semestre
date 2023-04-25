package br.com.fiap.exercicio;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		//Ler os nomes, alturas e pesos
		String nome1 = JOptionPane
			.showInputDialog("Digite o nome da pessoa 1");
		double altura1 = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a altura 1"));
		double peso1 = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o peso 1"));
		
		String nome2 = JOptionPane
			 .showInputDialog("Digite o nome da pessoa 2");
		double altura2 = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a altura 2"));
		double peso2 = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o peso 2"));
		
		//Verificar a pessoa mais pesada e exibir o nome
		if (peso1 > peso2) {
			JOptionPane.showMessageDialog(null, nome1 + " mais pesada");
		} else if (peso1 < peso2){
			JOptionPane.showMessageDialog(null, nome2 + " mais pesada");
		} else {
			JOptionPane.showMessageDialog(null, "Pesos iguais");
		}
		
		//Verificar a pessoa mais alta e exibir o nome
		if (altura1 > altura2) {
			JOptionPane.showMessageDialog(null, nome1 + " mais alta");
		} else if (altura2 > altura1) {
			JOptionPane.showMessageDialog(null, nome2 + " mais alta");
		} else {
			JOptionPane.showMessageDialog(null, "Mesma altura");
		}
		
	}	
}