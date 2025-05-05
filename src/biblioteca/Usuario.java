package biblioteca;

public class Usuario {

	private int id;
	private String nome;
	
	Usuario(int id, String nome){
		this.id = id;
		this.nome = nome;
	}

	public void exibirUsuario(int id) {
		
		
		System.out.println("\nIdentificador: " + getId());
		System.out.println("Nome: " + getNome()+ "\n");
	}
	
	public int getId() {return id;}
	public String getNome() {return nome;}
}
