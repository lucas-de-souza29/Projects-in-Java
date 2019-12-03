
public class Executora {

	public static void main(String[] args) {
		// MENU INICIAL
				String instrucao;
				int opcao = 0;
				do {
					instrucao = View.exibeOpcaoEmString("1-Criar Reserva \n 0-Sair");
					opcao = Integer.parseInt(instrucao);
					switch (opcao) {
					case 1:
						try {
							//
						} catch (Exception e) {
							View.exibeMsgErro(e.getMessage());
						}
						break;
					default:
						break;
					}
				} while (opcao != 0);
			}
	}
