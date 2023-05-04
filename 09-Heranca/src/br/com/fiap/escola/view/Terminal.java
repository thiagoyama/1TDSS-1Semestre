package br.com.fiap.escola.view;

import br.com.fiap.escola.model.Aluno;
import br.com.fiap.escola.model.Pessoa;

public class Terminal {

	public static void main(String[] args) {
		//Instanciar uma Pessoa
		Pessoa pessoa = new Pessoa();
		pessoa.setCodigo(89);
		
		//Instanciar um Aluno
		Aluno aluno = new Aluno();
		aluno.setCodigo(1); 
		aluno.setRm(123); 

	}
}