package br.com.utils;
import br.com.ufc.Luta;

public class Utils {
	
	public static Luta createLuta(){
		Luta currentLuta = null;
		currentLuta = new Luta();
		View.exibirOpcaoEmString("Informe os nomes dos lutadores : \n");
		View.exibirMensagem("Luta criada com sucesso!");
		return currentLuta;
	}


}
