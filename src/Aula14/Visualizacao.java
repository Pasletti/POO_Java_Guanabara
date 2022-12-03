package Aula14;

public class Visualizacao
{
	// Atributos
	private Gafanhoto espectador;
	private Video filme;
	
	// Métodos Especiais
	public Visualizacao(Gafanhoto espectador, Video filme)
	{
		this.setEspectador(espectador);
		this.setFilme(filme);
		this.filme.setViews(this.filme.getViews() + 1);
		this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
	}

	public Gafanhoto getEspectador()
	{
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador)
	{
		this.espectador = espectador;
	}

	public Video getFilme()
	{
		return filme;
	}

	public void setFilme(Video filme)
	{
		this.filme = filme;
	}

	// Métodos Especiais
	public void avaliar()
	{
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota)
	{
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float porcentagem)
	{
		int nota = 0;
		
		if (porcentagem <= 20)
		{
			nota = 3;
		}
		else if (porcentagem <= 50)
		{
			nota = 5;
		}
		else if (porcentagem <= 90) {
			nota = 8;
		}
		else
		{
			nota = 10;
		}
		
		this.filme.setAvaliacao(nota);
	}

	public void status() 
	{
		System.out.println("----- Espectador -----");
		this.getEspectador().status();
		System.out.println("----- Filme -----");
		this.getFilme().status();
		System.out.println("\n");
	}
}
