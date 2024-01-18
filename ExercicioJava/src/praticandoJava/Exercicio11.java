package praticandoJava;

public class Exercicio11 {
	
	/** Escreva um programa Java para imprimir a área e o perímetro de um círculo. */
	public static void main(String[] args) {
		
		double raio = 7.5;
		double perimetro = 2 * Math.PI * raio;
		double area = Math.PI * raio * raio;
		
		System.out.println("O perimetro é - " + perimetro);
		System.out.println("\nA área é - " + area);
		
		
	}

}
