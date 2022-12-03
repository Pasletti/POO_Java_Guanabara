/**
 * Herança para Diferença -> Vai herdar atributos e métodos com algumas diferenças
 */

package Aula10;

// final -> não deixa a classe ser herdada por outra classe como a classe bolsista
// public final class Aluno extends Pessoa
public class Aluno extends Pessoa
{
	// Atributos
	private int matricula;
	private String curso;
	
	// Métodos Especiais
	public int getMatricula()
	{
		return this.matricula;
	}
	
	public void setMatricula(int matricula)
	{
		this.matricula = matricula;
	}
	
	public String getCurso()
	{
		return curso;
	}
	
	public void setCurso(String curso)
	{
		this.curso = curso;
	}
	
	// Método Abstratos
	public void cancelarMatricula()
	{
		System.out.println("Matrícula será cancelada.");
	}

    // final -> não deixa o método ser sobrescrito na classe bolsista
	// public final void pagarMensalidade()
	public void pagarMensalidade()
	{
		System.out.println("Pagando mensalidade do aluno " + this.getNome());
	}

	@Override
	public void detalhes()
	{
		System.out.println("--------------------------------------");
		System.out.println(
				"--- Aluno ---\n" + 
			"Nome: " + this.getNome() + "\n" +
			"Idade: " + this.getIdade() + "\n" +
			"Sexo: " + this.getSexo() + "\n" +
			"Matricula: " + this.getMatricula() + "\n" +
			"Curso: " + this.getCurso()
		);
	}
}
