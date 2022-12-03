package Aula12;

public class Mamifero extends Animal
{
	// Atributos
	private String corPelo;

	// Métodos Especiais
	private String getCorPelo()
	{
		return corPelo;
	}

	private void setCorPelo(String corPelo)
	{
		this.corPelo = corPelo;
	}
	
	// Métodos Abstratos
	@Override
	public void locomover()
	{
		System.out.println("Correndo");
	}
	
	@Override
	public void alimentar()
	{
		System.out.println("Mamando");
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("Som de Mamífero");
	}	
}
