package ProjetoYouTube;

public abstract class Pessoa
{
	// Atributos
	protected String nome;
	protected int idade;
	protected String sexo;
	protected float experiencia;

	// Métodos Especiais
	public Pessoa(String nome, int idade, String sexo)
	{
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setExperiencia(0);
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getIdade()
	{
		return idade;
	}

	public void setIdade(int idade)
	{
		this.idade = idade;
	}

	public String getSexo()
	{
		return sexo;
	}

	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}

	public float getExperiencia()
	{
		return experiencia;
	}

	public void setExperiencia(float experiencia)
	{
		this.experiencia = experiencia;
	}
	
	// Método Abstratos
	public void ganharExperiencia(float experiencia)
	{
		this.setExperiencia(this.getExperiencia() + experiencia);
	}
}
