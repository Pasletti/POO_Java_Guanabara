/**
 * Herança Pobre ou Herança de Implementação -> Onde a classe filha herda tudo da classe progenitora ou mãe ou superclasse
 */

package ProjetoPessoas;

public class Visitante extends Pessoa
{
	@Override
	public void detalhes()
	{
		System.out.println("--------------------------------------");
		System.out.println(
				"--- Visitante ---\n" + 
			"Nome: " + this.getNome() + "\n" +
			"Idade: " + this.getIdade() + "\n" +
			"Sexo: " + this.getSexo() + "\n"
		);
	}
}
