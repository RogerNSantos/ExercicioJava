package praticandoJava;

import java.util.Scanner;

public class Exercico05 {
	
	/** Escreva um programa Java que receba dois números como entrada e exiba o 
	 * produto de dois números.*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		/**int num1 = 25;
		int num2 = 5;
		int resultado = num1 * num2;
				
		System.out.println("O resultado é = " + resultado);*/
		
		System.out.println("Digite o primeiro número: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o Segundo Número: ");
		int num2 = entrada.nextInt();
		
		int resultado = num1 * num2;
		
		System.out.println("O resultado é: " + resultado);
		
		entrada.close();
	}

}
