package biblioteca;

import java.util.Scanner;

public class Acervo {
	GerenciadorDeLivro gerenciadorDeLivro = new GerenciadorDeLivro();
	private Scanner sc = new Scanner(System.in);
	
	private String nome;
	private int idInterno;
	private boolean emprestado;
	
	
	Acervo(){}
	
	Acervo(int idInterno, String nome, boolean emprestado){
		this.idInterno = idInterno;
		this.nome = nome;
		this.emprestado = emprestado;
	}

	public boolean getEmprestado() {return this.emprestado;}
	public int getidInterno() {return this.idInterno;}
	public String getNome() {return this.nome;}


	public void cadastrarLivro(Livro livro) {
		gerenciadorDeLivro.salvarLivro(livro);
	}
	
	public void listarLivros() {
		gerenciadorDeLivro.exibirLivros();
		
	}
}