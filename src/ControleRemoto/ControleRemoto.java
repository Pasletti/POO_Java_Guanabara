/**
 * Encapsular -> Ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior
 * Interface -> Lista de serviços fornecidos por um componente. É o contato com o mundo exterior, que define o que pode
 * ser feito com um objeto dessa classe.
 * 
 * Vantagens em encapsular
 * Tornar mudanças invisíveis
 * Facilitar reutilização do código
 * Reduzir efeitos colaterais
 */

package ControleRemoto;

public class ControleRemoto implements Controlador
{
	// Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// Métodos Especiais
	public ControleRemoto()
	{
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
	}

	private int getVolume()
	{
		return this.volume;
	}

	private void setVolume(int volume)
	{
		this.volume = volume;
	}

	private boolean getLigado()
	{
		return this.ligado;
	}

	private void setLigado(boolean ligado)
	{
		this.ligado = ligado;
	}

	private boolean getTocando()
	{
		return this.tocando;
	}

	private void setTocando(boolean tocando)
	{
		this.tocando = tocando;
	}

	// Métodos Abstratos
	@Override
	public void ligar()
	{
		this.setLigado(true);
	}

	@Override
	public void desligar()
	{
		this.setLigado(false);	
	}

	@Override
	public void abrirMenu()
	{
		System.out.println("----- MENU -----");
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		for (int i = 0; i <= (this.getVolume() - 1); i += 10)
		{
			System.out.print("|");
		}
		System.out.print("\n");
	}

	@Override
	public void fecharMenu()
	{
		System.out.println("Fechando Menu...");
	}

	@Override
	public void maisVolume()
	{
		if (this.getLigado())
		{
			this.setVolume(this.getVolume() + 5);
		}
		else
		{
			System.out.println("Impossível aumentar volume");
		}
	}

	@Override
	public void menosVolume()
	{
		if (this.getLigado())
		{
			this.setVolume(this.getVolume() - 5);
		}
		else
		{
			System.out.println("Impossível diminuir volume");
		}
	}

	@Override
	public void ligarMudo()
	{
		if (this.getLigado() && this.getVolume() > 0)
		{
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo()
	{
		if (this.getLigado() && this.getVolume() == 0)
		{
			this.setVolume(50);
		}
	}

	@Override
	public void play()
	{
		if (this.getLigado() && !(this.getTocando()))
		{
			this.setTocando(true);
		}
		else
		{
			System.out.println("Não consegui reproduzir");
		}
	}

	@Override
	public void pause()
	{
		if (this.getLigado() && this.getTocando())
		{
			this.setTocando(false);
		}
		else
		{
			System.out.println("Não consegui pausar");
		}
	}	
}
