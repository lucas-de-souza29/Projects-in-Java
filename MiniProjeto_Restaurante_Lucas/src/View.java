import javax.swing.JOptionPane;

public class View {

	public static void exibeMensagem(String mensagem){
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	public static void exibeMsgErro(String mensagem){
		JOptionPane.showMessageDialog(null, mensagem,"Erro",JOptionPane.ERROR_MESSAGE);
	}
	
	public static String exibeOpcaoEmString(String mensagem){
		String texto = JOptionPane.showInputDialog(mensagem);
		return texto;
	}
	public static int exibeOpcaoEmInteiro(String mensagem){
		int nro = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
	    return nro;
	}
}
