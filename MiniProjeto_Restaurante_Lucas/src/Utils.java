public class Utils {
	
	public static Reserva createReserva(){
		Reserva currentReserva = null;
		currentReserva = new Reserva();
		View.exibeOpcaoEmString("Digite o numero da mesa da reserva : "); 
		View.exibeMensagem("Reserva criada com sucesso!");
	    return currentReserva;
	}
}
