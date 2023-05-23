package br.com.fiap.exercicio.view;

import javax.swing.JOptionPane;

import br.com.fiap.exercicio.model.Bacharelado;
import br.com.fiap.exercicio.model.Medio;
import br.com.fiap.exercicio.model.Tecnologo;

public class TesteFormacao {

	public static void main(String[] args) {
		//Perguntar qual tipo de formação será cadastrada
		int tipo = Integer.parseInt(JOptionPane.showInputDialog(
			"Escolha:\n 1-Medio, \n 2-Tecnologo \n 3-Bacharelado"));
		
		//Pedir as informações da formação
		String descricao = JOptionPane.showInputDialog("Descrição");
		int periodo = Integer.parseInt(JOptionPane.showInputDialog("Período"));
		
		//Pedir as informações do Medio
		if (tipo == 1) {
			String tipoMedio = JOptionPane.showInputDialog("Tipo");
			Medio medio = new Medio(descricao, periodo, tipoMedio);
			//Exibir os dados da formação
			System.out.println(medio);		
		} else if (tipo == 2) {
			boolean plano = Boolean.parseBoolean(
				JOptionPane.showInputDialog("Plano? true/false"));
			Tecnologo tec = new Tecnologo(descricao, periodo, plano);
			System.out.println(tec);
		} else {
			String projeto = JOptionPane.showInputDialog("Projeto");
			int estagio = Integer.parseInt(
				JOptionPane.showInputDialog("Estágio"));
			Bacharelado bac = new Bacharelado(descricao, periodo, projeto, estagio);
			System.out.println(bac);
		}
	}//main
}//class