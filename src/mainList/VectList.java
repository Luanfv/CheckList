package mainList;

public class VectList {
	private String nome, email;
	private int contato,id;
	
	public VectList (int id,String nome, int contato, String email) {
		this.nome = nome;
		this.contato = contato;
		this.email = email;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContato() {
		return contato;
	}

	public void setContato(int contato) {
		this.contato = contato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString () {
		return "ID: "+id +"\nNome: "+ nome +"\nTelefone/Contato: "+ contato+"\nE-mail: " + email;
	}
}
