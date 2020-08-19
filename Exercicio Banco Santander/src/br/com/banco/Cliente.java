package br.com.banco;

public class Cliente {
	private int numeroCliente;
	private String sobrenome;
	private int rg;
	private int cpf;
		
	public int getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public Cliente(int numeroCliente, String sobrenome, int rg, int cpf) {
		this.numeroCliente = numeroCliente;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
	}	
}

