package br.com.fiap.exercicio.model;

public class Aviao extends Veiculo {

	private String prefixo;
	
	private int quantidadeTurbinas;

	public Aviao() {
	}
	
	public Aviao(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, Cor cor, String prefixo,
			int quantidadeTurbinas) {
		super(modelo, quantidadeLugares, anoFabricacao, comprimento, cor);
		this.prefixo = prefixo;
		this.quantidadeTurbinas = quantidadeTurbinas;
	}

	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	public int getQuantidadeTurbinas() {
		return quantidadeTurbinas;
	}

	public void setQuantidadeTurbinas(int quantidadeTurbinas) {
		this.quantidadeTurbinas = quantidadeTurbinas;
	}
	
}
