package livroEd10;

//Imprimindo uma linha de texto com múltiplas instruções.
public class Exemplo01 {
	//Método main inicia a execução do app Java
	public static void main(String[] args) {
		System.out.print("Rogério ");
		System.out.println("\tNeves");
		System.out.println("\nRogério\nNeves\ndos\nSantos\n");
		
		
		System.out.printf("%s%n%s%n",
				" Rogério ", " Neves ");
	}//Fim do metodo main

}//Fim da classe Exemplo01
