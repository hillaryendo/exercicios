package Exercício;

public class Administracao extends PessoaFisica {
	protected double bonificacao;

	public double getBonificacao() {
		return super.getSalarioBase() * this.bonificacao;
	}

	@Override
	public double getHolerite() {
		return super.getSalarioBase() + this.getBonificacao();
	}
	
	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	public void demitir(Funcionario funcionario) {
		System.out.println(funcionario.getNome() + " foi demitido.");
	}
}

