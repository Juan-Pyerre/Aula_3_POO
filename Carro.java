package main;

public class Carro {
	private String marca;
	private int ano;
	private String cor;
	
	public Carro(String marca, int ano, String cor) {
		super();
		this.marca = marca;
		this.ano = ano;
		this.cor = cor;
	}
	
	public String Buzinar () {
		return "bibibibiibibiibbibibiibibiibibibiib" ;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
