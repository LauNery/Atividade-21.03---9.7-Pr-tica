package atividadePratica9_7;

import java.util.Arrays;
import java.util.Scanner;

public class Lista1_Exercício2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int vetorInteiros[] = new int[10];  
		int soma = 0;
		
		System.out.println("Digite os elementos: ");
		for(int i = 0; i < vetorInteiros.length; i++) {
		vetorInteiros[i] = scanner.nextInt();
		}
				
	    System.out.println("Elementos dos índices ímpares: ");
		for(int i = 1; i < vetorInteiros.length ; i += 2) {
			System.out.print(vetorInteiros[i] + " ");
	  }
				
		System.out.println("Elementos pares");
		for(int i = 0; i < vetorInteiros.length; i++) {
			if(vetorInteiros[i] % 2 == 0) {
				System.out.println(vetorInteiros[i] + " ");
			}
	  }
			for(int i = 0; i < vetorInteiros.length ; i++) {
			soma += vetorInteiros[i];
			
		} 
			System.out.println("Soma: " + soma);
			float media = (float) soma / vetorInteiros.length;
			
			System.out.printf("Média: %.2f " , media);
			
	}
}








		



