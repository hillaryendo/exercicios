package Exercício;

public class Funcionario {
	
	private String nome;
	private String endereco;
	private String cpf;
	private String email;
	private String setor;
	private String dataAdmissao;
	private String dataDemissao;
	private double salarioBase;
	private String cargo;
	private boolean ferias;

	public Funcionario(String nome, String endereco, String cpf, String email, String setor, String dataAdmissao, String dataDemissao, double salarioBase, String cargo, boolean ferias) {
		this.nome = nome;		
		this.endereco = endereco;		
		this.cpf = cpf;
		this.email = email;
		this.setor = setor;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		this.salarioBase = salarioBase;
		this.cargo = cargo;
		this.ferias = ferias;
	}
	
	public Funcionario() {		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(String dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public double getSalarioBase() {
		return this.salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getHolerite() {
		return this.salarioBase;
	}
	
	public void podeTrabalhar() {
		if(!isFerias) {
			System.out.println("O funcionário está trabalhando.");
		} else {
			System.out.println("O funcionário está de férias.");
		}		
	}
	public void pedirDemissao() {
		System.out.println("O funcionário pediu demissão.");
	}
	public void solicitarAumento() {
		System.out.println("O funcionário solicitou aumento.");
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public boolean isFerias() {
		return ferias;
	}

	public void setFerias(boolean ferias) {
		this.ferias = ferias;
	}
	
	
}




