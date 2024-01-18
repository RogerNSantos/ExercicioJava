package praticandoJava;

import java.util.Scanner;

public class Exercico12 {

	/**
	 * 12. Escreva um programa Java que receba três números como entrada para
	 * calcular e imprimir a média dos números.
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double num3 = entrada.nextDouble();

        double media = (num1 + num2 + num3) / 3;
        double soma = num1 + num2 + num3;

        System.out.printf("A média é %.2f.\nA soma foi %.2f\n", media, soma);
		
		
		entrada.close();

	}

}
