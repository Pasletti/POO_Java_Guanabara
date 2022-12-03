package Aula14;

public class Video implements AcoesVideo
{
	// Atributos
	private String titulo;
	private int avaliacao;
	private int views = 1;
	private int curtidas;
	private boolean reproduzindo;

	// Métodos Especiais
	public Video(String titulo)
	{
		this.setTitulo(titulo);
		this.setAvaliacao(1);
		this.setViews(0);
		this.setCurtidas(0);
		this.setReproduzindo(false);
	}
	
	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public int getAvaliacao()
	{
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao)
	{
        int media = (int) ((this.getAvaliacao() + avaliacao) / this.getViews());
        this.avaliacao = media;
	}

	public int getViews()
	{
		return views;
	}

	public void setViews(int views)
	{
		this.views = views;
	}

	public int getCurtidas()
	{
		return curtidas;
	}

	public void setCurtidas(int curtidas)
	{
		this.curtidas = curtidas;
	}

	public boolean getReproduzindo()
	{
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo)
	{
		this.reproduzindo = reproduzindo;
	}

	// Métodos Abstratos
	@Override
	public void play()
	{
		this.setReproduzindo(true);
	}

	@Override
	public void pause()
	{
		this.setReproduzindo(false);
	}

	@Override
	public void like()
	{
		this.setCurtidas(this.getCurtidas() + 1);
	}
	
	public void status() 
	{
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Avaliação: " +this.getAvaliacao());
		System.out.println("Views: " + this.getViews());
		System.out.println("Curtidas: " + this.getCurtidas());
		System.out.println("Reproduzindo: " + (this.getReproduzindo() ? "Sim" : "Não" ));
		System.out.println("\n");
	}
}
