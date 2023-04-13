package br.com.fiap.construtores.view;

import br.com.fiap.construtores.model.Bicicleta;
import br.com.fiap.construtores.model.Fabricante;

public class Terminal {

	public static void main(String[] args) {
		//Instanciar um Fabricante
		Fabricante fab = new Fabricante("Caloi", "12.098.890/0001-56");

		//Setar os dados do Fabricante
		//fab.setCnpj("12.098.890/0001-56");
		//fab.setNome("Monark");
		
		//Instanciar uma Bicicleta
		Bicicleta bike = new Bicicleta(29, "Velox", 15.7f, fab);
		//Setar os dados da Biciclieta
		//bike.setModelo("Velox");
		//bike.setAro(29);
		//bike.setPeso(15.7f);
		//bike.setFabricante(fab);
		
		//Exibir os dados da bicicleta
		String dados = bike.retornarDetalhes();
		System.out.println(dados);
		//Exibir os dados do fabricante
		System.out.println(bike.getFabricante().getNome());
	}
}