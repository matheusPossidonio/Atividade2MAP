
public class Aluno {

	private int id;
	private String nome;
	
	public Aluno() {
	}
	
	public Aluno(int id, String nome) throws ControleAcademicoException{
		
		this.setId(id);
		this.setNome(nome);
		
		if(nome == null || nome== "" || id<0) {
			throw new ControleAcademicoException();
		}
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
