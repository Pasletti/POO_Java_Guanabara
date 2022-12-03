package UltimateCombatEmoji;

import java.util.Random;

public class Luta
{
	// Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	// Métodos Especiais
	private Lutador getDesafiado()
	{
		return this.desafiado;
	}

	private void setDesafiado(Lutador desafiado)
	{
		this.desafiado = desafiado;
	}

	private Lutador getDesafiante()
	{
		return this.desafiante;
	}

	private void setDesafiante(Lutador desafiante)
	{
		this.desafiante = desafiante;
	}

	private int getRounds()
	{
		return this.rounds;
	}

	private void setRounds(int rounds)
	{
		this.rounds = rounds;
	}

	private boolean getAprovada()
	{
		return this.aprovada;
	}

	private void setAprovada(boolean aprovada)
	{
		this.aprovada = aprovada;
	}
	
	// Métodos Abstratos
	public void marcarLuta(Lutador lutador1, Lutador lutador2)
	{
		if ( lutador1.getCategoria() == lutador2.getCategoria() && lutador1 != lutador2 )
		{
			this.setAprovada(true);
			this.setDesafiado(lutador1);
			this.setDesafiante(lutador2);
		}
		else
		{
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	
	public void lutar()
	{
		if (this.getAprovada())
		{
			System.out.println("### DESAFIADO ###");
			this.getDesafiado().apresentar();
			System.out.println("### DESAFIANTE ###");
			this.getDesafiante().apresentar();
			System.out.println("\n===========================");

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			
			switch (vencedor)
			{
				case 0: // Empate
				{	
					System.out.println("Empatou!!!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					
					break;
				}
				case 1: // Ganhou Desafiado
				{	
					System.out.println("VENCEU -----> " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					
					break;
				}
				case 2: // Ganhou Desafiante
				{	
					System.out.println("VENCEU -----> " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					
					break;
				}
				default:
					throw new IllegalArgumentException("Algo errado aconteceu");
			}
			System.out.println("===========================");
		}
		else
		{
			System.out.println("Luta não pode acontecer");
		}
	}
}
