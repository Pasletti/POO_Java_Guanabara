package aula04;

public class Aula04
{
	public static void main(String[] args) 
	{
		// Utilizando construct
		Caneta caneta1 = new Caneta("Bic", "Azul", 0.5f);
		caneta1.destampar();
		caneta1.status();
		System.out.println("\n");
		
		Caneta caneta2 = new Caneta("KKK", "Verde", 1.0f);
		caneta2.status();
		System.out.println("\n");

		// Utilizando Getters e Setters
		Caneta caneta3 = new Caneta();
		caneta3.setModelo("Bic Cristal");
		caneta3.setCor("Cinza");
		caneta3.setPonta(0.75f);
		caneta3.setCarga(15);
		caneta3.tampar();
		
		caneta3.status();
		System.out.println("\n");
		System.out.println("Tenho uma caneta " + caneta3.getModelo() + " de ponta " + caneta3.getPonta());
	}
}