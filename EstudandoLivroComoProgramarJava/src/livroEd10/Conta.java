package livroEd10;
//Classe Conta que contém uma variável de instância nome

//e métodos para configurar e obter seu valor.

public class Conta {

	private String nome;// Variável de instância
	// Método para definir o nome no objeto
	// o construtor inicializa name com nome do parâmetro
	public Conta(String nome) { // o nome do construtor é nome da classe

		this.nome = nome;// Armazena o nome
	}

	// método para configurar o nome
	public void setName(String name) {
		this.nome = name;
	}

	// Método para recuperar o nome do objeto
	// método para recuperar o nome do curso
	public String getNome() {

		return nome; // retorno valor do nome para o chamador
	}

}// Fim da classe conta
