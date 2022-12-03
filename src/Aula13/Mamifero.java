/**
 * Polimorfismo de Sobrecarga -> 
 * Assinaturas Diferentes
 * Mesma Classe
 * 
 * Assinaturas -> Quantidade e tipos de parâmetros.
 */

package Aula13;

public class Mamifero extends Animal
{
	// Atributos
	protected String corPelo;
	
	// Métodos Especiais
	public String getCorPelo()
	{
		return this.corPelo;
	}

	public void setCorPelo(String corPelo)
	{
		this.corPelo = corPelo;
	}

	// Métodos Abstratos
	@Override
	public void emitirSom()
	{
		System.out.println("Som de Mamífero");	
	}

}
