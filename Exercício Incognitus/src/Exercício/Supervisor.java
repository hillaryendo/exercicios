package Exercício;

public class Supervisor extends Administracao {
	public Supervisor() {
		super.bonificacao = 0.08;
	}
	
	@Override
	public void demitir(Funcionario funcionario) {
		if(super.getCargo() == "Supervisor" || super.getCargo() =="Supervisor") {
			System.out.println("Você não pode demitir outro gerente ou supervisor.");
		} else {
			System.out.println(funcionario.getNome() + " foi demitido.");
		}		
	}
}
