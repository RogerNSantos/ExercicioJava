package livroEd10;
//Classe Conta que contém uma variável de instância nome
//e métodos para configurar e obter seu valor.

public class Conta {

	private String nome;// Variável de instância
	
	//Método para definir o nome no objeto
	public void setNome(String nome) {
		
		this.nome = nome;//Armazena o nome
	}
	
	//Método para recuperar o nome do objeto
	public String getNome() {
		return nome;// retorno valor do nome para o chamador
	}
		
}//Fim da classe conta
