package praticandoJava;

import java.util.Scanner;

public class Exercicio07 {
	
	/** 7. Escreva um programa Java que receba um número como entrada e imprima sua tabuada
	 *  até 10. */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o número: ");
		int num = entrada.nextInt();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Resultado: " + num + " X " + (i + 1) + " = " + (num * (i + 1)));
		}
				
		entrada.close();
		
	}
		
}
