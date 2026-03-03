package main;

public class Main {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Fusca", 1980, "verde");
		System.out.println("o marca do carro é " + carro1.getMarca());
		System.out.println(carro1.Buzinar());
		Trator trator1 = new Trator ("Renalt", 2000, "cinza", "Motor a dizel", "John Deere");
		System.out.println("a marca do trator é " + trator1.getMarca());
		System.out.println(trator1.Buzinar()); 
		
		
	}

}
