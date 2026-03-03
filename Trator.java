package main.java;

public class Trator extends Carro {
	private String motor;
	private String modelo;

	public Trator(String marca, int ano, String cor, String motor, String modelo) {
		super(marca, ano, cor);
		this.motor=motor;
		this.modelo=modelo;
	}
	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}		

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String Buzinar (){
		return ("TCHUTCHUUUUUUUUUUUUUUUUUUUUU");

	}
}
