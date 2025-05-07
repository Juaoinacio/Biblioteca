package biblioteca;

public class Livro extends Acervo {

	private	String isbm;
	private String autor;
	private String editora;
	private int paginasTotal;
	
	Livro(String isbm, String autor, String editora, int paginasTotal, int idInterno, String nome, boolean emprestado){
		
		//Super para usar as variaveis de Acervo
		super(idInterno, nome, emprestado);
		
		this.isbm = isbm;
		this.autor = autor;
		this.editora = editora;
		this.paginasTotal = paginasTotal;

		System.out.println("\nLivro Cadastrado com sucesso!!! \n");
		
	}
	// Forma de formatar os livros na tela
	@Override
	public String toString() {
		String statusEmprestado;
		if (getEmprestado()){
			statusEmprestado = " Livro está emprestado";
		} else {
			statusEmprestado = " Livro não esta emprestado";
		}
	    return "\nLivro: " + getNome() +
	           " | Autor: " + autor +
	           " | ISBN: " + isbm +
	           " | Editora: " + editora +
	           " | Páginas: " + paginasTotal +
	           " | ID Interno: " + getidInterno() +
	           " |" + statusEmprestado + "\n";
	}
	
	// Methods gets
	public String getIsbm() {return this.isbm;}
	public String getEditora() {return this.editora;}
	public int getPaginasTotal() {return this.paginasTotal;}
	public String getAutor() {return this.autor;}
}
