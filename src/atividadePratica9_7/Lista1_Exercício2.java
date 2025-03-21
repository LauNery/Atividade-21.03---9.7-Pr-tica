package atividadePratica9_7;

import java.util.Arrays;
import java.util.Scanner;

public class Lista1_Exercício2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int vetorInteiros[] = {1}; 
		{
			
		for(int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite os elementos nos índices ímpares: ");
		vetorInteiros[i] = scanner.nextInt();
		}
				
	  for(int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite os elementos nos índices pares:: ");
		   vetorInteiros[i] = scanner.nextInt();
	  }
				
	  for(int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite é a soma: ");
	       vetorInteiros[i] = scanner.nextInt();
	  }
				
			 Arrays.sort(vetorInteiros); {
			System.out.println("Digite é a média: 5.50: ");
			
		}
	}
}
}






		



