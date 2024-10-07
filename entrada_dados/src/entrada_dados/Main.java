package entrada_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Entrada de dados
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Entrada de dados com string
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		// Entrada de dados com int
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou: " + z);
		
	    // Digitando somente um caracter
		char a;
		a = sc.next().charAt(0);
		System.out.println("Você digitou: " + a);
		
		sc. close();
		

	}

}
