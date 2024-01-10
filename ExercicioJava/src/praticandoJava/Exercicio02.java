package praticandoJava;

import java.util.Scanner;

public class Exercicio02 {
	/** Escreva um programa Java para imprimir a soma de dois números. */
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		/**double num1 = 74;
		double num2 = 36;

		double soma = num1 + num2;
		System.out.println("A soma dos número é: " + soma);*/

		System.out.println("Digite o primeiro número: ");
		double digite01 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double digite02 = entrada.nextDouble();
		
		double soma = digite01 + digite02;

		System.out.println("resultado da soma é: " + soma);
		
		entrada.close();
	}

}
