package livroEd10;

//Usando o construtor de Account para inicializar a instância name
// variável no momento em que cada objeto Account é criado.

public class ContaTeste {

	public static void main(String[] args) {

		// cria dois objetos Conta
		Conta conta1 = new Conta("Jane Green");
		Conta conta2 = new Conta("John Blue");

		// exibe o valor inicial de nome para cada Conta
		System.out.printf("Primeira conta de nome: %s%n", conta1.getNome());

		System.out.printf("Segunda conta de nome: %s%n", conta2.getNome());

	}
} // fim da classe ContaTeste
