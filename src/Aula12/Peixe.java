package Aula12;

public class Peixe extends Animal
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
		System.out.println("Nadando");
	}
	
	@Override
	public void alimentar()
	{
		System.out.println("Comendo substâncias");
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("Peixe não faz som");
	}
	
	public void soltarBolha()
	{
		System.out.println("Soltando bolha");
	}
}
