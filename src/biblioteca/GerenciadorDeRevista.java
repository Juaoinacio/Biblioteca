package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeRevista {
	private List<Revista> revistas;
	
	GerenciadorDeRevista() {
		revistas = new ArrayList<>();
	}
	
	public void salvarRevista(Revista revista) {
		revistas.add(revista);
	}
	
	public void exibirTodasRevistas() {
		if (revistas.isEmpty()){
			System.out.println("/nNenhuma revista cadastrada.\n");
		}else {
			for (Revista r: revistas) {
				System.out.println(r);
			}
		}
	}
}
