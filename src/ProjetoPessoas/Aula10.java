package ProjetoPessoas;

public class Aula10
{
	public static void main(String[] args)
	{
		// Classe Pessoa não pode ser instanciada porque a classe foi declarada como abstract
		// Pessoa pessoa1 = new Pessoa();
		Aluno aluno1 = new Aluno();
		Professor professor1 = new Professor();
		Funcionario funcionario1 = new Funcionario();
		Visitante visitante1 = new Visitante();
		Bolsista bolsista1 = new Bolsista();

		aluno1.setNome("Pedro");
		aluno1.setMatricula(111111);
		aluno1.setIdade(16);
		aluno1.setSexo("M");
		aluno1.setCurso("Informática");
		aluno1.cancelarMatricula();
		aluno1.pagarMensalidade();
		aluno1.detalhes();
		
		professor1.setNome("Cláudio");
		professor1.setSalario(2500.75f);
		professor1.receberAumento(500.20f);
		professor1.detalhes();

		funcionario1.setNome("Fabiana");
		funcionario1.setSetor("Estoque");
		funcionario1.mudarTrabalho();
		funcionario1.detalhes();
		
		visitante1.setNome("Juvenal");
		visitante1.setIdade(33);
		visitante1.setSexo("M");
		visitante1.detalhes();

		bolsista1.setMatricula(1112);
		bolsista1.setNome("Jubileu");
		bolsista1.setBolsa(12.5f);
		bolsista1.setCurso("Administração");
		bolsista1.setIdade(17);
		bolsista1.pagarMensalidade();
		bolsista1.detalhes();
	}
}
