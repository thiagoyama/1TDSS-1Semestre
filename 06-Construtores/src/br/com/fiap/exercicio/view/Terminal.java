package br.com.fiap.exercicio.view;

import br.com.fiap.exercicio.model.Funcionario;
import br.com.fiap.exercicio.model.Profissao;

public class Terminal {

	public static void main(String[] args) {
		//Instanciar uma Profissao
		Profissao profissao = new Profissao("Analista Java");
		
		//Instanciar um Funcionario
		Funcionario ale = new Funcionario(1, "Alexandre", profissao);
	
		System.out.println(ale.getNome() + " " + 
				ale.getMatricula() + " " + ale.getProfissao().getNome());
	}
}