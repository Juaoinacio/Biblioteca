package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeUsuario {
	private List<Usuario> usuarios;
	
	GerenciadorDeUsuario() {
		usuarios = new ArrayList<>();
	}
	
	public void salvarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public void exibirUsuarios(){
		if (usuarios.isEmpty()) {
			System.out.println("\nNão há usuarios cadastrados\n");
		} else {
			for (Usuario u: usuarios) {
				System.out.println(u);	
			}
		}
	}
	
}
