
public class Main {
	
	public static void main(String[] args)throws ControleAcademicoException{
		
		//Instanciando um objeto da classe controle academico
		ControleAcademico ca = new ControleAcademico("UEPB","Avenida Brasil");
		ca.cabecalho();
		
		//criando um aluno com a logica creator onde passamos os dados e um metodo ira criar e ja adicionar
		ca.addAluno("matheus");
		//verificando quais alunos estao no sistema
		System.out.println("-Alunos cadastrados no sistema: " + ca.getAlunos());
		
		//criando um professor com a logica creator onde passamos os dados e um metodo ira criar e ja adicionar
		ca.addProfessor("Sabrina");
		ca.addProfessor("roberto");
		//verificando quais professores estao no sistema
		System.out.println("-Professores cadastrados no sistema: " + ca.getProfessores());
		
		//criando uma disciplina com a logica creator onde passamos os dados e um metodo ira criar e ja adicionar
		ca.addDisciplina("geografia","16:00-18:00",1);
		System.out.println("-Disciplinas cadastrados no sistema: " + ca.getDisciplinas() + "\n");
		
		//adiciona um aluno em uma turma, basta passar o id dos dois)
		ca.addAlunoTurma(0, 0);
		
		
		//A-quais disciplinas o professor esta ministrando:(basta passar o id do professor e ele retorna os hosrario dele)
		System.out.println("A-Quais disciplinas o professor esta ministrando: " + ca.getDisciplinasPorfessor(1));
		
		//B-quais os horarios do porfessor:(basta passar o id do professor e ele retorna os horarios)
		System.out.println("B-Quais os horarios do porfessor: " + ca.getHorarioProfessor(1));
				
		//C-listar os alunos de uma turma
		System.out.println("C-Listar os alunos de uma turma: " + ca.listarAlunosTurma(0));
		
		//D-quais disciplinas o professor esta ministrando:(basta passar o id do professor e ele retorna os hosrario dele)
		System.out.println("D-Quais disciplinas o professor esta ministrando: " + ca.getDisciplinasAluno(0));
		
		//E-quais os horarios do aluno:(basta passar o id do aluno e ele retorna os horarios)
		System.out.println("E-Quais os horarios do aluno: " + ca.getHorarioAluno(0));
		
		//F-qual o tamanho da turma:(basta passar o id da turma e ele retorna o tamanho dela)
		System.out.println("F-Quantos alunos estao cadastrados na turma: " + ca.getTamanhoTurma(0));
		
		
	}

}
