package biblioteca;

import java.util.Scanner;

public class Acervo {
	//instanciando a classe GerenciandorDeLivro
	GerenciadorDeLivro gerenciadorDeLivro = new GerenciadorDeLivro();
	GerenciadorDeRevista gerenciadorDeRevista = new GerenciadorDeRevista();
	GerenciadorDeUsuario gerenciadorDeUsuario = new GerenciadorDeUsuario();
	private Scanner sc = new Scanner(System.in);
	
	private String nome;
	private int idInterno;
	private boolean emprestado;
	
	//para criar um objeto Acervo sem parametros
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
	public void listarTodosLivros() {
		gerenciadorDeLivro.exibirTodosLivros();
	}
	public void cadastrarRevista(Revista revista) {
		gerenciadorDeRevista.salvarRevista(revista);
	}
	public void listarTodosRevistas() {
		gerenciadorDeRevista.exibirTodasRevistas();
	}
	public void cadastrarUsuario(Usuario usuario) {
		gerenciadorDeUsuario.salvarUsuario( usuario);
	}
	public void listarUsuarios(){
		gerenciadorDeUsuario.exibirUsuarios();
	}
	
}
