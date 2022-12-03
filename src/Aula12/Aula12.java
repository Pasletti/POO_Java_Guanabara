package Aula12;

public class Aula12
{
	public static void main(String[] args)
	{
		// Animal animal1 = new Animal();

		Mamifero mamifero1 = new Mamifero();
		Reptil reptil1 = new Reptil();
		Peixe peixe1 = new Peixe();
		Ave ave1 = new Ave();

		Canguru canguru1 = new Canguru();
		Cachorro cachorro1 = new Cachorro();
		Cobra cobra1 = new Cobra();
		Tartaruga tartaruga1 = new Tartaruga();
		GoldFish goldFish1 = new GoldFish();
		Arara arara1 = new Arara();
		
		mamifero1.setPeso(85.3f);
		mamifero1.setIdade(2);
		mamifero1.setMembros(4);
		mamifero1.locomover();
		mamifero1.alimentar();
		mamifero1.emitirSom();
		System.out.println("--------------------------------------------------------------");
		
		canguru1.setPeso(55.30f);
		canguru1.setIdade(3);
		canguru1.setMembros(4);
		canguru1.locomover();
		canguru1.alimentar();
		canguru1.emitirSom();
		canguru1.usarBolsa();
		System.out.println("--------------------------------------------------------------");
		
        cachorro1.setPeso(3.94f);
        cachorro1.setIdade(5);
        cachorro1.setMembros(4);
        cachorro1.locomover();
        cachorro1.alimentar();
        cachorro1.emitirSom();
        cachorro1.abanarRabo();
		System.out.println("--------------------------------------------------------------");
		
		peixe1.setPeso(0.35f);
		peixe1.setIdade(1);
		peixe1.setMembros(0);
		peixe1.locomover();
		peixe1.alimentar();
		peixe1.emitirSom();
		System.out.println("--------------------------------------------------------------");
		
		ave1.setPeso(0.89f);
		ave1.setIdade(2);
		ave1.setMembros(2);
		ave1.locomover();
		ave1.alimentar();
		ave1.emitirSom();
	}

}
