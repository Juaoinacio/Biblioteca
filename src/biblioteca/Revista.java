package biblioteca;

public class Revista extends Acervo{
	int numeroDeEdicao;
	String editora;
	String autor;
	int paginasTotal;
	
	Revista(int idInterno,int numeroDeEdicao, String editora, String autor, String nome,int paginaTotal, boolean emprestado) {
		
		//Super para usar as variaveis de Acervo
		super(idInterno,nome,emprestado);
		
		this.numeroDeEdicao = numeroDeEdicao;
		this.editora = editora;
		this.autor = autor;
		this.paginasTotal = paginaTotal;
		
		System.out.println("\nRevista Cadastrada com sucesso!!! \n");
		
	}
	

	

	public int getNumeroDeEdicao(){return this.numeroDeEdicao;}
	public String getEditora() {return this.editora;}
	public String getAutor() {return this.autor;}
	public int getPaginaTotal() {return this.paginasTotal;}

}
