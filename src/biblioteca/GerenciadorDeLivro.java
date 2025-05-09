package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeLivro {
	private List<Livro> livros;
	
	//construtor
	GerenciadorDeLivro() {
		livros = new ArrayList<>();
	}

	public void salvarLivro(Livro livro) {
		livros.add(livro);
	}
	
	public void exibirTodosLivros() {
		if (livros.isEmpty()) {
			System.out.println("\nNenhum livro cadastrado\n");
		} else {
			for (Livro l: livros){
				System.out.println(l);
			}
		}
		
	}
}
