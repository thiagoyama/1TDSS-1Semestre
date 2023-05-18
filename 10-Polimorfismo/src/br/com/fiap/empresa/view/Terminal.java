package br.com.fiap.empresa.view;

import br.com.fiap.empresa.model.Funcionario;
import br.com.fiap.empresa.model.Gerente;

public class Terminal {

	public static void main(String[] args) {
		//Instanciar um Gerente
		Gerente ronqui = new Gerente(1, "Rafael", 
				20000,"12.321.312-85", "Senior", 500, null);
		
		//Instanciar um Funcionario
		Funcionario ale = new Funcionario(2, "Alexandre", 
				5000, "56.213.654-55", "Pleno");
		
		//Aumentar o salario do gerente em 5%
		ronqui.aumentarSalario(50);
		
		//Promover o funcionario para Senior
		ale.aumentarSalario("senior");
		
		//Exibir o salario do gerente e do funcionario
		System.out.println("Salário Gerente: " + ronqui.getSalario());
		System.out.println("Bonus: " + ronqui.getBonus());
		System.out.println("Salário Fun: " + ale.getSalario());
		
		//Qual método ele utiliza? Gerente ou Funcionario?
		Funcionario f = new Gerente();
		f.aumentarSalario("pleno");
		System.out.println(f.getSalario());
		
		//Validar se a variavel f possui um objeto do tipo Gerente
		if (f instanceof Gerente) {
			System.out.println("f é um objeto do tipo gerente");
			//Cast (forçar um objeto a ser de um tipo especifico)
			Gerente g = (Gerente) f;
			System.out.println(g.getBonus());
		} else {
			System.out.println("f não é um objeto do tipo gerente");
		}
		
	}
}










