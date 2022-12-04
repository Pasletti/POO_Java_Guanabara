package ProjetoYouTube;

public class Aula14
{
	public static void main(String[] args)
	{
		Video video[] = new Video[3];
		Gafanhoto gafanhoto[] = new Gafanhoto[2];
		Visualizacao visualizacao[] = new Visualizacao[5];
		
		video[0] = new Video("Aula 1 de POO");
		video[1] = new Video("Aula 12 de PHP");
		video[2] = new Video("Aula 15 de HTML5");

		gafanhoto[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
		gafanhoto[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
		
		// video[0].status();
		// gafanhoto[0].status();
		
		visualizacao[0] = new Visualizacao(gafanhoto[0], video[2]);
		visualizacao[0].avaliar();
		visualizacao[0].status();
		visualizacao[1] = new Visualizacao(gafanhoto[0], video[1]);
		visualizacao[1].avaliar(85.0f);
		visualizacao[1].status();
	}
}
