package Aula14;

public class Gafanhoto extends Pessoa
{
	// Atributos
	private String login;
	private int totalAssistido;

	// Métodos Especiais
	public Gafanhoto(String nome, int idade, String sexo, String login)
	{
		super(nome, idade, sexo);
		this.setLogin(login);
		this.setTotalAssistido(0);
	}

	public String getLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public int getTotalAssistido()
	{
		return totalAssistido;
	}

	public void setTotalAssistido(int totalAssistido)
	{
		this.totalAssistido = totalAssistido;
	}
	
	// Métodos Abstratos
	public void viuMaisUm()
	{
		this.setTotalAssistido(this.getTotalAssistido() + 1);
	}
	
	public void status() 
	{
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " +this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("login: " + this.getLogin());
		System.out.println("Total Assistido: " + this.getTotalAssistido());
		System.out.println("\n");
	}
}
