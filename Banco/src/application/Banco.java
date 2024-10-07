package application;
import java.util.Locale;
import entities.BankFunctions;
import java.util.Scanner;


public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankFunctions conta = new BankFunctions();
		System.out.println("Cadastro de conta");
		System.out.println("Por favor, digite o número da conta:");
		double numeroConta = sc.nextDouble();
		sc.nextLine();
		
		System.out.printf("Conta número: " + numeroConta);
		System.out.println();
		System.out.println("Por favor, digite o nome do titular da conta:");
		String nome = sc.nextLine();
		System.out.println("Nome do titular é: " + nome);
		System.out.println("Cliente irá depositar um valor inicial? s/n");
		String cliente = sc.nextLine();
		if ("s".equals(cliente)) {
			System.out.println("Por favor, digite o valor do depósito: ");
			double depositoInicial = sc.nextDouble();
			conta.depositar(depositoInicial);
					
		}
		else { //Continuar com conta zerada
			System.out.println(" ");
		}

	sc.close();	
	}

}
