import java.util.ArrayList;

public class Torneio {
	private String nome;
	private String local;
	private ArrayList<Time> times = new ArrayList<Time>();
	//private String relatorioClassificacao; metodo()

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public ArrayList<Time> getTimes() {
		return times;
	}

	public void setTimes(ArrayList<Time> times) {
		this.times = times;
	}


}
