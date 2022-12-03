package aula09;

public class Pessoa
{
	// Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	// Métodos Especiais
	public Pessoa(String nome, int idade, String sexo)
	{
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
	}

	public String getNome()
	{
		return this.nome;
	}

	private void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getIdade()
	{
		return this.idade;
	}

	private void setIdade(int idade)
	{
		this.idade = idade;
	}

	public String getSexo()
	{
		return this.sexo;
	}

	private void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	
	// Métodos Abstratos
	public void fazerAniversario()
	{
		this.setIdade(this.getIdade() + 1);
	}
}
