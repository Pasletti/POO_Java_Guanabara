package Aula10;

public class Professor extends Pessoa
{
	// Atributos
	private String especialidade;
	private float salario;

	// Métodos Especiais
	public String getEspecialidade()
	{
		return this.especialidade;
	}

	public void setEspecialidade(String especialidade)
	{
		this.especialidade = especialidade;
	}

	public float getSalario()
	{
		return this.salario;
	}

	public void setSalario(float salario)
	{
		this.salario = salario;
	}
	
	// Métodos Abstratos
	public void receberAumento(float aumento)
	{
		this.setSalario(this.getSalario() + aumento);
	}

	@Override
	public void detalhes()
	{
		System.out.println("--------------------------------------");
		System.out.println(
				"--- Professor ---\n" + 
			"Nome: " + this.getNome() + "\n" +
			"Idade: " + this.getIdade() + "\n" +
			"Sexo: " + this.getSexo() + "\n" +
			"Especialidade: " + this.getEspecialidade() + "\n" +
			"Salario: " + this.getSalario()
		);
	}
}
