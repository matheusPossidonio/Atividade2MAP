
public class Main {
	
	public static void main(String[] args)throws ControleAcademicoException{
		
		//Instanciando um objeto da classe controle academico
		ControleAcademico ca = new ControleAcademico("UEPB","Avenida Brasil");
		
		//criando um aluno com a logica creator onde passamos os dados e um metodo ira criar e ja adicionar
		ca.addAluno("matheus");
		//verificando quais alunos estao no sistema
		System.out.println(ca.getAlunos());
		
		//criando um professor com a logica creator onde passamos os dados e um metodo ira criar e ja adicionar
		ca.addProfessor("Sabrina");
		ca.addProfessor("roberto");
		//verificando quais professores estao no sistema
		System.out.println(ca.getProfessores());
		
		//criando uma disciplina com a logica creator onde passamos os dados e um metodo ira criar e ja adicionar
		ca.addDisciplina("geografia","16:00-18:00",1);
		System.out.println(ca.getDisciplinas());
		
		//adiciona um aluno em uma turma, basta passar o id dos dois)
		ca.addAlunoTurma(0, 0);
		
		
		System.out.println("---------------------------------------------------------------");
		
		//A-quais disciplinas o professor esta ministrando:(basta passar o id do professor e ele retorna os hosrario dele)
		System.out.println(ca.getDisciplinasPorfessor(1));
		
		//B-quais os horarios do porfessor:(basta passar o id do professor e ele retorna os horarios)
		System.out.println(ca.getHorarioProfessor(1));
				
		//C-listar os alunos de uma turma
		System.out.println(ca.listarAlunosTurma(0));
		
		//D-quais disciplinas o professor esta ministrando:(basta passar o id do professor e ele retorna os hosrario dele)
		System.out.println(ca.getDisciplinasAluno(0));
		
		//E-quais os horarios do aluno:(basta passar o id do aluno e ele retorna os horarios)
		System.out.println(ca.getHorarioAluno(0));
		
		//F-qual o tamanho da turma:(basta passar o id da turma e ele retorna o tamanho dela)
		System.out.println(ca.getTamanhoTurma(0));
		
		
		


		
	}

}
