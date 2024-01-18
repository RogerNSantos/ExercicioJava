package praticandoJava;

import java.util.Scanner;

public class exercico03 {
	
	//Escreva um programa Java para dividir dois números e imprimi-los na tela.
	
	public static void main(String[] args) {
		
		/**int num1 = 90;
		
		double divisao = num1 / 3;
		System.out.println("O resultado é: " + divisao);*/
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe um número: ");
		double num1 = entrada.nextDouble();
		
		double divide = num1 / 3;
		
		System.out.println("O resultado é: " + divide);
		
		
		
		
		
		entrada.close();
	}

}
