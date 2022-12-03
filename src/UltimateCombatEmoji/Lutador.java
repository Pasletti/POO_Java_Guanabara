/**
 * Relacionamento entre classes - Agregação
 */

package UltimateCombatEmoji;

public class Lutador
{
	// Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	// Métodos Especiais	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates)
	{
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	}

	public String getNome()
	{
		return this.nome;
	}

	private void setNome(String nome)
	{
		this.nome = nome;
	}

	private String getNacionalidade()
	{
		return this.nacionalidade;
	}

	private void setNacionalidade(String nacionalidade)
	{
		this.nacionalidade = nacionalidade;
	}

	private int getIdade()
	{
		return this.idade;
	}

	private void setIdade(int idade)
	{
		this.idade = idade;
	}

	private float getAltura()
	{
		return this.altura;
	}

	private void setAltura(float altura)
	{
		this.altura = altura;
	}

	private float getPeso()
	{
		return this.peso;
	}

	private void setPeso(float peso)
	{
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria()
	{
		return this.categoria;
	}

	private void setCategoria()
	{
		if (this.getPeso() < 52.2)
		{
			this.categoria = "Inválido";
		}
		else if (this.getPeso() <= 70.3)
		{
			this.categoria = "Leve";
		}
		else if (this.getPeso() <= 83.9)
		{
			this.categoria = "Médio";
		}
		else if (this.getPeso() <= 120.2)
		{
			this.categoria = "Pesado";
		}
		else
		{
			this.categoria = "Inválido";
		}
	}

	private int getVitorias()
	{
		return this.vitorias;
	}

	private void setVitorias(int vitorias)
	{
		this.vitorias = vitorias;
	}

	private int getDerrotas()
	{
		return this.derrotas;
	}

	private void setDerrotas(int derrotas)
	{
		this.derrotas = derrotas;
	}

	private int getEmpates()
	{
		return this.empates;
	}

	private void setEmpates(int empates)
	{
		this.empates = empates;
	}
	
	// Métodos Abstratos
	public void apresentar()
	{
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " m de altura");
		System.out.println("pesando " + this.getPeso() + " Kg ");
		System.out.println(this.getVitorias() + " vitórias ");
		System.out.println(this.getDerrotas() + " derrotas e ");
		System.out.println(this.getEmpates() + ((this.getEmpates() <= 1) ? " empate" : " empates"));
	}
	
	public void status()
	{
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + ((this.getEmpates() <= 1) ? " vez" : " vezes"));
	}
	
	public void ganharLuta()
	{
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta()
	{
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta()
	{
		this.setEmpates(this.getEmpates() + 1);
	}
}
