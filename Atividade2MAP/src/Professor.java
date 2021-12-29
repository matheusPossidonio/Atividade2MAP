
public class Professor {
	
	private int id;
	private String nome;
	
	public Professor() {}
	
	public Professor(int id, String nome) throws ControleAcademicoException{
		this.setId(id);
		this.setNome(nome);
		
		if(nome == null || nome== "") {
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
