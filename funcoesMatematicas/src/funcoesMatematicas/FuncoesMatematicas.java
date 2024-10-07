package funcoesMatematicas;

public class FuncoesMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		double D, E, F;
		
		
		
		// Função sqrt é igual a raiz quadrada
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		// Função pow é a raiz quadrada
		D = Math.pow(x, y);
		E = Math.pow(x, 2.0);
		F = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + D);
		System.out.println(x + " elevado ao quadrado " + E);
		System.out.println("5 elevado ao quadrado = " + F);
		
		// Função abs são numeros absolutos, aqueles que são sempre positivos
		double G, H;
		G = Math.abs(y);
		H = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = " + G);
		System.out.println("Valor absoluto de " + z + " = " + H);
		
				
		

	}

}
