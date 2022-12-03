/**
 * Criando Classes e Objetos
 * Atributos, Métodos e Estado
 * 
 * Objeto-> Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio das suas 
 * características(atributos), comportamentos(métodos) e estado(status) atual.
 */

package aula02;

public class Caneta 
{
	// Atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	// Métodos Abstratos
	void status()
	{
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
		
	void rabiscar() 
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
	
	void tampar() 
	{
		this.tampada = true;
	}
	
	void destampar() 
	{
		this.tampada = false;
	}
}
