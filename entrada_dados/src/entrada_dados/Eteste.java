package entrada_dados;

import java.util.Scanner;				

public class Eteste {
	
	public static void main(String[] args) {
		java.util.Scanner tempo = new Scanner(System.in);
		int x = tempo.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma = soma + x;
			x = tempo.nextInt();
		}
		System.out.println(soma);
		tempo.close();
		}
		

	}
