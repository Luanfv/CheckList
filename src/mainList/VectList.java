package mainList;

public class VectList {
	private String contato,nome, email;
	
	public VectList (String nome, String contato, String email) {
		this.nome = nome;
		this.contato = contato;
		this.email = email;
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

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
	
}
