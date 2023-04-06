package br.com.fiap.exercicio1.view;

import br.com.fiap.exercicio1.model.Cor;
import br.com.fiap.exercicio1.model.Lancha;

public class Exercicio01 {

	public static void main(String[] args) {
		//Instanciar uma Cor
		Cor roxo = new Cor();
		roxo.alterarCor(128, 0, 128, "Roxo");
		
		//Instanciar um Lancha
		Lancha lancha = new Lancha();
		lancha.setAnoFabricacao(2020);
		lancha.setComprimento(10);
		lancha.setCor(roxo);
		lancha.setModelo("Azimut");
		lancha.setQuantidadeLugares(8);
		lancha.setQuantidadeMotores(2);
		
		//Exibir alguns valores da lancha
		//Exibir o modelo e o ano
		System.out.println(lancha.getModelo() + " " + lancha.getAnoFabricacao());
		//Exibir o nome da cor da lancha
		//lancha.getCor().setNome("Azul");
		System.out.println(lancha.getCor().getNome());
		
	}
}