package br.com.banco;

public class ContaCorrente extends Conta {
	
	private double limiteAutorizado;
		
	public ContaCorrente(String conta, String agencia, double saldo, Cliente cliente) {
		super(conta, agencia, saldo, cliente);
		this.limiteAutorizado = -300;
	}
	public void depositarCheque(double deposito, String bancoEmissor, String dataPagamento) {
		if (deposito > 0) {
			super.depositar(deposito);
		} else {
			System.out.println("Não foi possível realizar a operação.");
		}
	}
	public void sacar(double saque) {
		if ((super.getSaldo() - saque) >= limiteAutorizado) {
			super.sacar(saque);
		} else {
			System.out.println("Saque não autorizado.");
		}
	}	
}
