package br.com.fiap.teste;

import javax.swing.JOptionPane;

public class ConversaoStringPrimitivo {

	public static void main(String[] args) {
		//Definir uma variavel do tipo String
		String idade = "10";
		
		//Transformar a String em um tipo primitivo
		//byte, short, int, long, float, double
		byte idadeByte = Byte.parseByte(idade);
		short idadeShort = Short.parseShort(idade);
		int idadeInt = Integer.parseInt(idade);
		long idadeLong = Long.parseLong(idade);
		float idadeFloat = Float.parseFloat(idade);
		double idadeDouble = Double.parseDouble(idade);
		
		//Ler um numero
		idade = JOptionPane.showInputDialog("Digite a idade");
		
		//Exiba quanto falta para atingir 18 anos
		//Converter a idade para int
		idadeInt = Integer.parseInt(idade);
		
		if (idadeInt < 0) {
			JOptionPane.showMessageDialog(null, "Idade inválida");
		} else if (idadeInt < 18) {
			//Faz o calculo
			int falta18 = 18 - idadeInt; 
			//Exibe o resultado
			JOptionPane
				.showMessageDialog(null, "Faltam: " + falta18);
		} else {
			JOptionPane.showMessageDialog(null, "Já é maior de 18");
		}

	}//main	
}//class
