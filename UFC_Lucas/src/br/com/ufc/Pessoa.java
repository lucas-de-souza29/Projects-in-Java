package br.com.ufc;

abstract public class Pessoa {
	
	private String nome;
    private String cpf;
    private double peso;
    
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	

	@Override
	abstract public String toString();	
	
}
