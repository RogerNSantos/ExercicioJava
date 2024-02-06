package livroEd10;

import java.util.Scanner;

//Programa de adição que insere dois números, então exibe a soma deles.
public class comparacao {
//método main inicia a execução do aplicativo Java

	public static void main(String[] args) {
		// cria Scanner para obter entrada a partir da linha de comando
		Scanner input = new Scanner(System.in);
		int number1; // primeiro número a comparar
		int number2; // segundo número a comparar

		System.out.print("Digite o primeiro núumero: ");
		number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

		System.out.print("Digite o segundo número: "); // prompt
		number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

		if (number1 == number2)
			System.out.printf("%d == %d%n", number1, number2);

		if (number1 != number2)
			System.out.printf("%d != %d%n", number1, number2);

		if (number1 < number2)
			System.out.printf("%d < %d%n", number1, number2);

		if (number1 > number2)
			System.out.printf("%d > %d%n", number1, number2);

		if (number1 <= number2)
			System.out.printf("%d <= %d%n", number1, number2);

		if (number1 >= number2)
			System.out.printf("%d >= %d%n", number1, number2);

		input.close();
	} // fim do método main

}// fim da classe Comparison
