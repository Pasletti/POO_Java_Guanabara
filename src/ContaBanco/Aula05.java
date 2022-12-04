package ContaBanco;

public class Aula05
{
	public static void main(String[] args) 
	{
        ContaBanco cliente1 = new ContaBanco(); // Jubileu
        cliente1.abrirConta("CC");
        cliente1.setNumConta(1111);
        cliente1.setDono("Jubileu");
        cliente1.status();
        
        cliente1.depositar(300f);
        cliente1.status();
        
        cliente1.pagarMensal();
        cliente1.status();

        cliente1.sacar(338f);
        cliente1.status();

        cliente1.fecharConta();
        cliente1.status();

        System.out.println("<p>##############################################################</p>");

        ContaBanco cliente2 = new ContaBanco(); // Creuza
        cliente2.abrirConta("CP");
        cliente2.setNumConta(2222);
        cliente2.setDono("Creuza");
        cliente2.status();

        cliente2.depositar(500f);
        cliente2.status();

        cliente2.sacar(100f);
        cliente2.status();

        cliente2.pagarMensal();
        cliente2.status();

        cliente2.sacar(530f);
        cliente2.status();

        cliente2.fecharConta();
        cliente2.status();
	}
}