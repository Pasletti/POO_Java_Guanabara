package Aula13;

public class Aula13
{
	public static void main(String[] args)
	{
        // Animal animal1 = new Animal();
        Mamifero mamifero1 = new Mamifero();
        Lobo lobo1 = new Lobo();
        Cachorro cachorro1 = new Cachorro();

        mamifero1.emitirSom();
        lobo1.emitirSom();
        cachorro1.emitirSom();

        cachorro1.reagir("Olá");
        cachorro1.reagir("Vai Apanhar!");
        cachorro1.reagir(11, 45);
        cachorro1.reagir(21, 00);
        cachorro1.reagir(true);
        cachorro1.reagir(false);
        cachorro1.reagir(2, 12.5f);
        cachorro1.reagir(17, 4.5f);
	}
}
