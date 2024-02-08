package livroEd10;
//Classe Conta que contém uma variável de instância nome

//e métodos para configurar e obter seu valor.

public class Conta {

	private String nome;// Variável de instância
	private double salario;

	// Nome do construtor é nome da classe
	public Conta(String nome, double salario) {

		this.nome = nome;// atribui name à variável de instância name

		// valida que o balance é maior que 0.0; se não for, a variável de instância balance mantém seu valor
		if (salario > 0.0)// inicial padrão de 0.0, Se o saldo for válido
			this.salario = salario;// atribui salario à variável de instância salario
	}

	// método que deposita (adiciona) apenas uma quantia válida no saldo
	public void deposito(double depositoConta) {
		if (depositoConta > 0.0)// se depositoConta for válido
			salario = salario + depositoConta;// adiciona o saldo
	}

	// método que retorna saldo da conta
	public double getSalario() {
		return salario;
	}

	// método que define o nome
	public void setName(String name) {
		this.nome = name;
	}

	// método que define o nome
	public String getNome() {

		return nome; // retorno valor do nome para o chamador
	}// fim do método getName

}// Fim da classe conta
