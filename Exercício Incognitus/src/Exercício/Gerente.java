package Exercício;

public class Gerente extends Administracao {
	public Gerente() {
		super.bonificacao = 0.12;
	}
	
	@Override
	public void demitir(Funcionario funcionario) {
		if(super.getCargo() == "Gerente") {
			System.out.println("Você não pode demitir outro gerente.");
		} else {
			System.out.println(funcionario.getNome() + " foi demitido.");
		}		
	}
	
	public void reajustarSalario(Funcionario funcionario, double reajuste) {
		if(super.getCargo() == "Gerente") {
			System.out.println("Você não tem permissão para esta ação.");
		} else {
			if(reajuste < 0) {
				System.out.println("Não é possível reduzir o salário.");
			} else {
				super.setSalarioBase(getSalarioBase() + reajuste);
			}
		}
	}
}
