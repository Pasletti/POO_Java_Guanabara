package Aula12;

public class Cachorro extends Mamifero
{
	// Atributos
	
	// Métodos Especiais
	
	// Métodos Abstratos
	@Override
	public void emitirSom()
	{
		System.out.println("Au! Au! Au!");
	}

	public void enterrarOsso()
	{
		System.out.println("Enterrando Osso");
	}
	
	public void abanarRabo()
	{
		System.out.println("Abanando o Rabo");
	}
}
