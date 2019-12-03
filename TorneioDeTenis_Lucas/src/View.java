import javax.swing.JOptionPane;


public class View {

	public static void exibirMensagem(String msg){
		JOptionPane.showMessageDialog(null,msg);
	}
	
	public static void exibirMensagemDeErro(String msg){
		JOptionPane.showMessageDialog(null, msg,"Erro",JOptionPane.ERROR_MESSAGE);
	}
	
	public static String exibirOpcaoString(String msg){
		String texto = JOptionPane.showInputDialog(msg);
		return texto;
	}
	
	public static int exibirOpcaoInt(String msg){
		  int nro = Integer.parseInt(JOptionPane.showInputDialog(msg));
	      return nro;
	}

}
