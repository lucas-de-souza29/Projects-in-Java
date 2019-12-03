import java.util.ArrayList;

public class Restaurante {

	public int mesas[];
	private ArrayList<Conta> contas = new ArrayList<Conta>();

	public ArrayList<Conta> getContas() {
		return contas;
	}
	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}

}
