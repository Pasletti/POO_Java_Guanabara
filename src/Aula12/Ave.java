package Aula12;

public class Ave extends Animal
{
	// Atributos
	private String corPena;

	// Métodos Especiais
	private String getCorPena()
	{
		return corPena;
	}

	private void setCorPena(String corPena)
	{
		this.corPena = corPena;
	}

	// Métodos Abstratos
	@Override
	public void locomover()
	{
		System.out.println("Voando");
	}
	
	@Override
	public void alimentar()
	{
		System.out.println("Comendo frutas");
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("Som de Ave");
	}
	
	public void fazerNinho()
	{
		System.out.println("Construiu um ninho");
	}
}
