/**
 * Modificadores de Visibilidade -> Indicam o nível de acesso aos componentes internos de uma classe.
 * + público - a classe atual e todas as outras classes.
 * - privado - somente a classe atual.
 * # protegido - a classe atual e todas as suas sub-classes.
 */

package Aula03;

public class Caneta 
{
	// Atributos
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;

	// Métodos Abstratos
	public void rabiscar() 
	{
		if (this.tampada == true) 
		{
			System.out.println("ERRO! Não posso rabiscar");
		} 
		else 
		{
			System.out.println("Estou rabiscando");
		}
	}
		
	protected void tampar()
	{
		this.tampada = true;
	}
	
	protected void destampar() 
	{
		this.tampada = false;
	}

	public void status() 
	{
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
}
