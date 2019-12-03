package br.com.utils;

import javax.swing.JOptionPane;

public class View {
	
	public static void exibirMensagem(String mensagem){
		JOptionPane.showMessageDialog(null,mensagem);
	}
	
	public static void exibirMensagemDeErro(String mensagem){
		JOptionPane.showMessageDialog(null, mensagem,"Erro",JOptionPane.ERROR_MESSAGE);
	}
 
	public static String exibirOpcaoEmString(String mensagem){
		String texto = JOptionPane.showInputDialog(mensagem);
		return texto;
	}
	
	public static int exibirOpcaoEmInteiro(String mensagem){
		int nro = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
		return nro;
	}
}
