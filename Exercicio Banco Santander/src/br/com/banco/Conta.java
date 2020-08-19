package br.com.banco;

public class Conta {
	
	private String agencia;
	private String conta;
	private double saldo;
	private Cliente cliente;
	
	public Conta(String conta, String agencia, double saldo, Cliente cliente) {
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
			
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double deposito) {		
		this.saldo += deposito;
	}
	
	public void sacar(double saque) {
		this.saldo -= saque;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
}