package br.com.alura;

public class TestaCursoComAluno2 {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Douglas Quitanilha", 11824763);
		Aluno alunoQueVeioDoFormulario = new Aluno("Douglas Quitanilha", 11824763);
		
		System.out.println("O aluno é igual ao aluno que veio do formulário?");
		System.out.println(aluno == alunoQueVeioDoFormulario);
		
	}

}
