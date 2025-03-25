package atividadePratica9_7;

import java.util.Arrays;
import java.util.Scanner;

public class Lista1_Exercício1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numeroInteiro;
        boolean numeroEncontrado = false;
		
		int vetorInteiros1[] = new int[1];

		System.out.println("Digite o número que você deseja encontrar: ");
		numeroInteiro = scanner.nextInt();

		for (int i = 0; i < vetorInteiros.length; i++) {
		if (vetorInteiros[i] == numeroInteiro) {
				System.out.println("O número " + numeroInteiro + " está localizado na posição: " + i);
				numeroEncontrado = true;
		}

		}
			if(!numeroEncontrado)
			System.out.println("o número " + numeroInteiro + " Não foi encontrado!"); 
	}
}

