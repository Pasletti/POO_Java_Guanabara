/**
 * Herança de Diferença -> Vai herdar atributos e métodos com algumas diferenças
 */

package Aula10;

public class Bolsista extends Aluno
{
	// Atributos
	private float bolsa;
	
	// Métodos Especiais
	public float getBolsa()
	{
		return this.bolsa;
	}
	
	public void setBolsa(float bolsa)
	{
		this.bolsa = bolsa;
	}
	
	// Métodos Abstratos
	public void renovarBolsa()
	{
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	@Override
	public void pagarMensalidade()
	{
		System.out.println(this.getNome() + " é bolsista. Pagamento facilitado!");
	}
	
	@Override
	public void detalhes()
	{
		System.out.println("--------------------------------------");
		System.out.println(
				"--- Bolsista ---\n" + 
			"Nome: " + this.getNome() + "\n" +
			"Idade: " + this.getIdade() + "\n" +
			"Sexo: " + this.getSexo() + "\n" +
			"Matricula: " + this.getMatricula() + "\n" +
			"Curso: " + this.getCurso() + "\n" + 
			"Bolsa: " + this.getBolsa()
		);
	}
}
