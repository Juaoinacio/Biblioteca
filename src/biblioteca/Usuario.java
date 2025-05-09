package biblioteca;

public class Usuario {
	private static int contador = 1;
	private int id;
	private String nome;
	
	Usuario(String nome){
		this.id = contador++;
		this.nome = nome;
		
		System.out.println("\nUsuario cadastrado com sucesso\n");
		
	}

//	public void exibirUsuario(int id) {
//		System.out.println("\nIdentificador: " + getId());
//		System.out.println("Nome: " + getNome()+ "\n");
//	}
	
	@Override
	public String toString() {
		
	    return "\nId: " + getId() + 
	    		" Nome:  " + getNome() + "\n";  
	           
	}
	
	public int getId() {return id;}
	public String getNome() {return nome;}
}
