package mainList;

import java.util.List;

public class VectList {
	private String nome, email;
	private int contato;
	List<Integer> id;
	
	public VectList (List<Integer> id,String nome, int contato, String email) {
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

	public List<Integer> getId() {
		return id;
	}

	public void setId(List<Integer> id) {
		this.id = id;
	}

	public String toString() {
		return "\nNome: " + getNome() + "\nTelefone/Contato: " + getContato() + "\nE-mail: " + getEmail() + "\n";
	}
}
