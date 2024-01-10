package praticandoJava;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		/** Escreva um programa Java para imprimir a soma (adição), multiplicação, 
		 * subtração, divisão e resto de dois números. */
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o segunto número: ");
		int num2 = entrada.nextInt();
					
		//System.out.printf(num1 + "+" + num2 + " = " + (num1 + num2));
		System.out.println("Adição: " + (num1 + num2));
		System.out.println("Subtração: " + (num1 - num2));
		System.out.println("Multiplicação: " + (num1 * num2));
		System.out.println("Divisão: " + (num1 / num2));
		System.out.println("Modulo: " + (num1 % num2));
				
		entrada.close();
	}

}
