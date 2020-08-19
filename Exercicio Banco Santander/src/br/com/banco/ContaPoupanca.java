package br.com.banco;

public class ContaPoupanca extends Conta {
	
	private double taxaJuros;
	
	public ContaPoupanca(String conta, String agencia, double saldo, Cliente cliente) {
		super(conta, agencia, saldo, cliente);
		this.taxaJuros = 0.08;
	}
	
	@Override
	public void sacar(double saque) {
		if (super.getSaldo() <= 0) {
			System.out.println("Saldo insuficiente");
		} else super.sacar(saque);{
			System.out.println("Saque realizado");
		}
	}
}
