package atividadePratica9_7;

import java.util.Arrays;
import java.util.Scanner;

public class Lista1_Exercício1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
         int vetorInteiros1[] = new int[1];
		  
		  for(int i = 0; i < vetorInteiros1.length; i++) {
				System.out.println("Digite o número que você deseja encontrar: ");
				vetorInteiros1[i] = scanner.nextInt();
			}
		  for(int i = 0; i < vetorInteiros1.length; i++) {
				System.out.println("O número está localizado na posição: ");
				vetorInteiros1[i] = scanner.nextInt();
		  }
		  
		  for(int i = 0; i < vetorInteiros1.length; i++) {
				System.out.println("Digite o número que você deseja encontrar: ");
				vetorInteiros1[i] = scanner.nextInt();
		  }
			
			for(int i = 0; i < vetorInteiros1.length; i++) {
				System.out.println("Não foi encontrado!: ");
				vetorInteiros1[i] = scanner.nextInt();
		   }
		
		     Arrays.sort(vetorInteiros1);
		     
		     for(int i = 0; i < vetorInteiros1.length; i++) { 
		     System.out.println((i+1) + " ° elemento: " + vetorInteiros1[i]);
		
			 
}
}
}



