package aula09;

public class Livro implements Publicacao
{
	// Atributos
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	// Métodos Especiais
	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor)
	{
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setTotalPaginas(totalPaginas);
		this.setAberto(false);
		this.setPaginaAtual(0);
		this.setLeitor(leitor);
	}

	private String getTitulo()
	{
		return this.titulo;
	}

	private void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	private String getAutor()
	{
		return this.autor;
	}

	private void setAutor(String autor)
	{
		this.autor = autor;
	}

	private int getTotalPaginas()
	{
		return this.totalPaginas;
	}

	private void setTotalPaginas(int totalPaginas)
	{
		this.totalPaginas = totalPaginas;
	}

	private int getPaginaAtual()
	{
		return this.paginaAtual;
	}

	private void setPaginaAtual(int paginaAtual)
	{
		this.paginaAtual = paginaAtual;
	}

	private boolean getAberto()
	{
		return this.aberto;
	}

	private void setAberto(boolean aberto)
	{
		this.aberto = aberto;
	}

	private Pessoa getLeitor()
	{
		return this.leitor;
	}

	private void setLeitor(Pessoa leitor)
	{
		this.leitor = leitor;
	}	
	
	// Métodos Abstratos
	public String detalhes()
	{
		return 
				"Livro { \n titulo = " + this.getTitulo() + 
				",\n autor = " + this.getAutor() + 
				",\n total de páginas = " + this.getTotalPaginas() + 
				",\n página atual = " + this.getPaginaAtual() +
				",\n aberto = " + this.getAberto() + 
				",\n leitor = " + this.getLeitor().getNome() + 
				",\n idade = " + this.getLeitor().getIdade() + 
				",\n sexo = " + this.getLeitor().getSexo() + " \n}";
	}

	@Override
	public void abrir()
	{
		this.setAberto(true);
	}

	@Override
	public void fechar()
	{
		this.setAberto(false);	
	}

	@Override
	public void folhear(int pagina)
	{
		if (pagina > this.getTotalPaginas())
		{
			this.setPaginaAtual(0);
		}
		else
		{
			this.setPaginaAtual(pagina);			
		}
	}

	@Override
	public void avancarPagina()
	{
		this.setPaginaAtual(this.getPaginaAtual() + 1);
	}

	@Override
	public void voltarPagina()
	{
		this.setPaginaAtual(this.getPaginaAtual() - 1);
	}
}
