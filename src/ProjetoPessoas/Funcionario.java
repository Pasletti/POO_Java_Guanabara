package ProjetoPessoas;

public class Funcionario extends Pessoa
{
	// Atributos
	private String setor;
	private boolean trabalhando;
	
	// Métodos Especiais
	public String getSetor()
	{
		return this.setor;
	}

	public void setSetor(String setor)
	{
		this.setor = setor;
	}

	public boolean getTrabalhando()
	{
		return this.trabalhando;
	}

	private void setTrabalhando(boolean trabalhando)
	{
		this.trabalhando = trabalhando;
	}
	
	// Métodos Abstratos
	public void mudarTrabalho()
	{
		this.setTrabalhando(!this.getTrabalhando());
	}

	@Override
	public void detalhes()
	{
		System.out.println("--------------------------------------");
		System.out.println(
			"--- Funcionario ---\n" + 
			"Nome: " + this.getNome() + "\n" +
			"Idade: " + this.getIdade() + "\n" +
			"Sexo: " + this.getSexo() + "\n" +
			"Setor: " + this.getSetor() + "\n" +
			"Trabalhando: " + this.getTrabalhando()
		);
	}
}
