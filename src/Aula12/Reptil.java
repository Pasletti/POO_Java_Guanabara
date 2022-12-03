package Aula12;

public class Reptil extends Animal
{
	// Atributos
	private String corEscama;

	// Métodos Especiais
	private String getCorEscama()
	{
		return corEscama;
	}

	private void setCorEscama(String corEscama)
	{
		this.corEscama = corEscama;
	}
	
	// Métodos Abstratos
	@Override
	public void locomover()
	{
		System.out.println("Rastejando");
	}
	
	@Override
	public void alimentar()
	{
		System.out.println("Comendo Vegetais");
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("Som de Réptil");
	}
}
