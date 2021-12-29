import java.util.ArrayList;

public class Disciplina {
	
	private int id;
	private String materia;
	private String horario;
	private Professor professor;
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	
	//--------------------------------------------	CONSTRUTORES	-----------------------------------------------------
	
	public Disciplina() {}
	
	public Disciplina(int id,String materia,String horario) {
		this.id = id;
		this.setMateria(materia);
		this.setHorario(horario);
	}
	
	public Disciplina(int id,String materia,String horario, Professor professor) {
		this.id = id;
		this.setMateria(materia);
		this.setHorario(horario);
		this.setProfessor(professor);
	}
	
	//--------------------------------------------	GETS E SETERS	-----------------------------------------------------

	public int getId() {
		return id;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}
	
	public String getProfessorNome() {
		return this.professor.getNome();
	}
	
	public int getProfessorId() {
		return this.professor.getId();
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	//--------------------------------------------	METODOS AUXILIARES	-----------------------------------------------------
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public int tamanhoTurma() {
		return this.alunos.size();
	}
	
	public boolean verificaAlunoCadastrado(Aluno aluno) {
		boolean aux = false;
		ArrayList<Aluno> turma = this.alunos;
		
		for(int i=0;i<turma.size();i++) {
			if(turma.get(i).getId() == aluno.getId()) {
				aux = true;
			}
		}
		return aux;
	}
	
	public String listarAlunos() {
		StringBuffer aux = new StringBuffer();
        for (int i = 0; i < alunos.size(); i++) {
               aux.append(alunos.get(i).getNome()+ " ");

            if(i != alunos.size()-1) aux.append(',');
        }
        return aux.toString();
	}

}
