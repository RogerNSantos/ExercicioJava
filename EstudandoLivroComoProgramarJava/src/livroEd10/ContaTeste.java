package livroEd10;

import java.util.Scanner;

//Usando o construtor de Account para inicializar a instância name.Variável no momento em que
//cada objeto Account é criado. // Entrada e saída de números de ponto flutuante com objetos Conta.
public class ContaTeste {

	public static void main(String[] args) {
		// cria dois objetos Conta
		Conta conta1 = new Conta("Rogério Neves", 50.00);
		Conta conta2 = new Conta("Vitória", -7.53);

		// Exibe saldo inicial de cada objeto
		System.out.printf("%s salário: R$ %.2f %n", conta1.getNome(), conta1.getSalario());
		System.out.printf("%s salário: R$ %.2f %n%n", conta2.getNome(), conta2.getSalario());

		// Cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o valor do deposito: ");// Prompt
		double depositoConta1 = input.nextDouble();// Obtem a entrada do usuário

		System.out.printf("Adicionando %.2f ao saldo da conta1 %n%n", depositoConta1);
		conta1.deposito(depositoConta1);

		// Exibe os saldos
		System.out.printf("%s salario: R$ %.2f %n", conta1.getNome(), conta1.getSalario());
		System.out.printf("%s salario: R$ %.2f %n%n", conta2.getNome(), conta2.getSalario());

		System.out.println("Digite o valor do depósito: ");
		double depositoConta2 = input.nextDouble();

		System.out.printf("Adicionando %.2f ao saldo da conta2 %n%n", depositoConta2);
		conta2.deposito(depositoConta2);

		// Exibe os saldos
		System.out.printf("%s salário: R$ %.2f %n", conta1.getNome(), conta1.getSalario());
		System.out.printf("%s salário: R$ %.2f %n", conta2.getNome(), conta2.getSalario());

		/**
		 * exibe o valor inicial de nome para cada Conta System.out.printf("Primeira
		 * conta de nome: %s%n", conta1.getNome());
		 * 
		 * System.out.printf("Segunda conta de nome: %s%n", conta2.getNome());
		 */

		input.close();

	}
} // fim da classe ContaTeste
