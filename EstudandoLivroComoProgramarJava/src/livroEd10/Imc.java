package livroEd10;

import java.util.Scanner;

public class Imc {
	//Programa para calcular IMC corporal
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("\n========== Calculando IMC corporal ==========\n");
		System.out.print("Infofrme seu peso KG  ");
		double peso = entrada.nextDouble();
		
		System.out.print("Informe sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("\nSem IMC corporal é %.2f ", imc);		
		
		entrada.close();
		
	}

}
