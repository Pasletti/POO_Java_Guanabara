/**
 * Construct
 * Getters e Setters
 */

package aula04;

public class Caneta 
{
	// Atributos
	private String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;

	// Métodos Especiais
	public Caneta() // Este é o método construtor padrão
	{
		
	}
		
	public Caneta(String modelo, String cor, float ponta) // Este é o método construtor
	{
		this.modelo = modelo;
		this.setCor(cor);
		this.setPonta(ponta);
		this.tampar();
	}
		
	public String getModelo()
	{
		return this.modelo;
	}
	
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	
	public String getCor()
	{
		return this.cor;
	}
		
	public void setCor(String cor)
	{
		this.cor = cor;
	}
	
	public float getPonta()
	{
		return this.ponta;
	}
	
	public void setPonta(float ponta)
	{
		this.ponta = ponta;
	}
		
	public int getCarga()
	{
		return this.carga;
	}
	
	public void setCarga(int carga)
	{
		this.carga = carga;
	}
	
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
		System.out.println("Cor: " + getCor());
		System.out.println("Ponta: " + getPonta());
		System.out.println("Carga: " + getCarga());
		System.out.println("Está tampada? " + this.tampada);
	}
}
