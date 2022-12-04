package Aula02;

public class Aula02 
{
	public static void main(String[] args) 
	{
		Caneta caneta1 = new Caneta();
		caneta1.cor = "Azul";
		caneta1.ponta = 0.5f;
		caneta1.tampar();

		caneta1.status();
		caneta1.rabiscar();
		
		System.out.println("\n");
		
		Caneta caneta2 = new Caneta();
		caneta2.modelo = "Charles";
		caneta2.cor = "Preta";
		caneta2.destampar();
		
		caneta2.status();
		caneta2.rabiscar();
	}
}