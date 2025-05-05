package biblioteca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
	//instancia a classe Acervo, Por que quero acessar os metodos e atributos.
	private static Acervo acervo = new Acervo();
	private static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
	
		int opcao;
		
		do {
			System.out.println("        Menu Biblioteca     ");
			System.out.println("1 - Cadastrar algum Acervo");
			System.out.println("2 - Lista algum Acervo");
			System.out.println("3 - Cadastrar Usuário");
			System.out.println("4 - Consultar Usuário");
			System.out.println("5 - Pegar livro emprestado");
			System.out.println("6 - Devolver livro");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			// Preciso percorrer a lista de livros, assim pra qualquer lista
			// porque a variável 'livro' foi declarada apenas dentro do case 1,
			// e não está disponível fora desse escopo.
			// Por isso, usamos a lista 'listaLivro' para acessar todos os livros cadastrados.
			
			switch (opcao) {
				// Cadastro de livros
				case 1:
					cadastrarProduto();
					break;
				case 2:
					listarProduto();
					break;
				case 0:
					System.out.println("Saindo do sistema...");
					break;
				default:
					System.out.println("Opção inválida!");
			}
		} while (opcao != 0);
	}
	public static void cadastrarProduto() {
		
		int opcao;
		
		System.out.println("\n        Menu Acervo     ");
		System.out.println("1 - Cadastrar Livro");
		System.out.println("2 - Lista Livro");
		System.out.println("3 - Cadastrar Usuário");
		System.out.print("Escolha uma opção: ");
		
		opcao = sc.nextInt();
		sc.nextLine();
		
		switch (opcao) {
			case 1:
				System.out.print("\nNumero do isbm: ");
				String isbm = sc.nextLine();
				
				System.out.print("Codigo interno: ");
				int idInterno = sc.nextInt();
				
				//Limpa o buffer do Scanner
				sc.nextLine();
				
				System.out.print("Nome: ");
				String nome = sc.nextLine();

				System.out.print("Autor: ");
				String autor = sc.nextLine();
				
				System.out.print("Editora: ");
				String editora = sc.nextLine();
				
				System.out.print("Numero de paginas: ");
				int paginasTotal = sc.nextInt();
				
				Livro livro = new Livro(isbm ,autor, editora, paginasTotal, idInterno, nome, false);
		
				acervo.cadastrarLivro(livro);
			case 2:
				listarProduto();
			break;
		}
	}
	public static void listarProduto() {
		acervo.listarLivros();
	}
}
