
public class Contato {
	protected String nome;
	protected String email;
	protected String endereco;
	
	public Contato(String nome, String email, String endereco) {
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
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
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		String contato = "";
		contato += "Nome: " + this.getNome() + "\n";
		contato += "Email: " + this.getEmail() + "\n";
		contato += "Endereço: " + this.getEndereco() + "\n";
		return contato;
	}
}
