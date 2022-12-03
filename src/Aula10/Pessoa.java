/**
 * Herança -> Permite basear uma nova classe na definição de uma outra classe previamente existente.
 * A herança será aplicada tanto para as características quanto para os comportamentos.
 * 
 * Classe Abstrata -> Não pode ser instanciada. Só pode servir como progenitora.
 * Método Abstrato -> Declarado, mas não impplementado na progenitora.
 * Classe Final -> Não pode ser herdada por outra classe. Obrigatoriamente folha.
 * Método Final -> Não pode ser sobrescrito pelas suas sub-classes. Obrigatoriamente herdado.
 * 
 * Classe abstract não pode ser instanciada. Ex: $pessoa = new Pessoa()
 */

package Aula10;

public abstract class Pessoa
{
	// Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	// Métodos Especiais
	public String getNome()
	{
		return this.nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getIdade()
	{
		return this.idade;
	}

	public void setIdade(int idade)
	{
		this.idade = idade;
	}

	public String getSexo()
	{
		return this.sexo;
	}

	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}

	// Métodos Abstratos
	public void fazerAniversario()
	{
		this.setIdade(this.getIdade() + 1);
	}
	
	public void detalhes()
	{
		System.out.println("--------------------------------------");
		System.out.println(
			"--- Pessoa ---\n" + 
			"Nome: " + this.getNome() + "\n" +
			"Idade: " + this.getIdade() + "\n" +
			"Sexo: " + this.getSexo()
		);
	}
}
