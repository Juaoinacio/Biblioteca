package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeLivro {
	private List<Livro> livros;
	
	//contrutor
	public GerenciadorDeLivro() {
		livros = new ArrayList<>();
	}
	
	public void salvarLivro(Livro livro) {
		livros.add(livro);
	}
	
	public void exibirLivros() {
		for (Livro l: livros){
			
			System.out.println(l);
		}
	}
}
