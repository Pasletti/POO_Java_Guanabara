package ContaBanco;

public class ContaBanco 
{
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	// Métodos Especiais
	public ContaBanco() 
	{
		this.setSaldo(0);
		this.setStatus(false);
	}

	public int getNumConta()
	{
		return this.numConta;
	}

	public void setNumConta(int numConta)
	{
		this.numConta = numConta;
	}

	public String getTipo()
	{
		return this. tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}

	public String getDono() 
	{
		return this. dono;
	}

	public void setDono(String dono) 
	{
		this.dono = dono;
	}

	public float getSaldo() 
	{
		return this.saldo;
	}

	public void setSaldo(float saldo) 
	{
		this.saldo = saldo;
	}

	public boolean getStatus() 
	{
		return this.status;
	}

	public void setStatus(boolean status) 
	{
		this.status = status;
	}
		
	public void abrirConta(String tipo)
	{
		this.setTipo(tipo);
		this.setStatus(true);

		if (tipo == "CC") 
		{
			this.setSaldo(50);
		}
		else if (tipo == "CP") 
		{
			this.setSaldo(150);
		}

		System.out.println("Conta de " + this.getDono() + " aberta com sucesso!");
	}

	public void fecharConta()
	{
		if (this.getSaldo() > 0) 
		{
			System.out.println("Conta ainda tem dinheiro, não posso fechá-la!");
		}
		else if (this.getSaldo() < 0) 
		{
			System.out.println("Conta está em débito. Impossível encerrar!");
		}
		else
		{
			this.setStatus(false);
			System.out.println("Conta de " + this.getDono() + " fechada com sucesso.");
		}
	}

	public void depositar(float valor)
	{
		if (this.getStatus()) 
		{
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito de R$ " + valor + " na conta de " + this.getDono());
		}
		else
		{
			System.out.println("Conta fechada. Não consigo depositar");
		}
	}

	public void sacar(float valor)
	{
		if (this.getStatus()) 
		{
			if (this.getSaldo() >= valor) 
			{
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque de R$ " + valor + " autorizado na conta de " + this.getDono());
			}
			else 
			{
				System.out.println("Saldo insuficiente para saque.");
			}
		}
		else
		{
			System.out.println("Não posso sacar de um conta fechada");
		}
	}
		
	public void pagarMensal()
	{
		int valor = 0;

		if (this.getTipo() == "CC") 
		{
			valor = 12;
		}
		else if (this.getTipo() == "CP") 
		{
			valor = 20;
		}
		if (this.getStatus()) 
		{
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Mensalidade de R$ " + valor + " debitado na conta de " + this.getDono());
		}
		else
		{
			System.out.println("Problemas com a conta. Não posso cobrar");
		}
	}

	public void status() 
	{
		System.out.println("Número da Conta: " + this.getNumConta());
		System.out.println("Tipo: " +this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		System.out.println("\n");
	}
}
