package br.com.ufc;

import br.com.utils.View;

/**
 * @author Lucas de Souza Objetivo : Gerenciar os dados do UFC(Ultimate Fighting
 *         Championship).
 */
public class Executora {

	public static void main(String[] args) {
		// Menu Inicial
		String instrucao;
		int opcao = 0;
		do {
			instrucao = View.exibirOpcaoEmString("UFC\n 1- Add Luta\n 0 -Sair");
			opcao = Integer.parseInt(instrucao);
			switch (opcao) {
			case 1:
				try {

				} catch (Exception e) {
					View.exibirMensagemDeErro(e.getMessage());
				}
				break;
			default:
				break;
			}
		} while (opcao != 0);

	}
    
	// Opcoes da Luta 
}
