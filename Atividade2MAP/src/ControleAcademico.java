import java.util.ArrayList;

public class ControleAcademico {
	
	private String nome;
	private String endereco;
	
	private int idAluno;
	private int idProfessor;
	private int idDisciplina;
	
	private ArrayList<Aluno> estudantes;
	private ArrayList<Disciplina> materias;
	private ArrayList<Professor> docentes;
	
	public ControleAcademico(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		
		this.idAluno = 0;
		this.idDisciplina = 0;
		this.idProfessor = 0;
		
		estudantes = new ArrayList<Aluno>();
		materias = new ArrayList<Disciplina>();
		docentes = new ArrayList<Professor>();
	}

	
	public void addAluno(String nome) {
		idAluno ++;
		estudantes.add(new Aluno(idAluno,nome));
	}
	
	public void addProfessor(String nome) {
		idProfessor ++;
		docentes.add(new Professor(idProfessor,nome));
	}
	
	public void addDisciplina(String materia,String horario, int codProfessor) {
		idDisciplina++;
		materias.add(new Disciplina(idDisciplina, materia, horario, this.docentes.get(codProfessor)));
	}
	
	public String getDisciplinasPorfessor(int idProfessor) {
		
		Professor professor = docentes.get(idProfessor);
		
		StringBuffer aux = new StringBuffer();
		
        for(int i =0;i<materias.size();i++) {
        	if(materias.get(i).getProfessorId() == professor.getId()) {
        		aux.append(materias.get(i).getMateria());
        	}
        }
        return aux.toString();
	}
	
	public String getHorarioProfessor(int idProfessor){
		
		Professor professor = docentes.get(idProfessor);
		
		StringBuffer aux = new StringBuffer();
		
		for(int i =0;i<materias.size();i++) {
        	if(materias.get(i).getProfessorId() == professor.getId()) {
        		aux.append(materias.get(i).getHorario());
        	}
        }
		return aux.toString();
	}
	
	public String getDisciplinasAluno(int idAluno) {
		
		Aluno aluno = estudantes.get(idAluno);
		
		StringBuffer aux = new StringBuffer();
		
        for(int i =0;i<materias.size();i++) {
        	if(materias.get(i).verificaAlunoCadastrado(aluno)) {
        		aux.append(materias.get(i).getMateria());        	
        		}
        }
        return aux.toString();
	}
	
	public String getHorarioAluno(int idAluno) {
		
		Aluno aluno = estudantes.get(idAluno);
		
		StringBuffer aux = new StringBuffer();
		
        for(int i =0;i<materias.size();i++) {
        	if(materias.get(i).verificaAlunoCadastrado(aluno)) {
        		aux.append(materias.get(i).getHorario());        	
        		}
        }
        return aux.toString();
	}
	
	public String getAlunos() {
		StringBuffer aux = new StringBuffer();
		
        for(int i =0;i<estudantes.size();i++) {
        	aux.append(estudantes.get(i).getNome() + " ");        	
        }
        return aux.toString();
	}
	
	public String getProfessores() {
		StringBuffer aux = new StringBuffer();
		
        for(int i =0;i<docentes.size();i++) {
        	aux.append(docentes.get(i).getNome() + " ");        	
        }
        return aux.toString();
	}
	
	public String getDisciplinas() {
		StringBuffer aux = new StringBuffer();
		
        for(int i =0;i<materias.size();i++) {
        	aux.append(materias.get(i).getMateria() + " "); 
        }
        return aux.toString();
	}
	
	public int getTamanhoTurma(int idTurma) {
		return materias.get(idTurma).tamanhoTurma();
	}
	
	public String listarAlunosTurma(int idTurma) {
		return materias.get(idTurma).listarAlunos();
	}
	
	public void addAlunoTurma(int idTurma, int idAluno) {
		Aluno aluno = estudantes.get(idAluno);
		materias.get(idTurma).addAluno(aluno);
	}
}
