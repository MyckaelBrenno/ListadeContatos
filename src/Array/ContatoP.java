package Array;

public class ContatoP {
	String nome, email, telefone;
	
	public ContatoP(String nome, String email, String telefone) {
		
		//Já estamos setando aqui
		
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	
	public void Imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("Email: " + email);
		System.out.println("");
	}
	
	
}
