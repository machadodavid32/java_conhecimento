package entities;

public class BankFunctions {
	private double saldo;
	
	public BankFunctions() {
		this.saldo = 0.0;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.printf("Valor depositado: %.2f%n", valor);
		}else {
			System.out.println("Valor inválido");
		}
	}
	public double getSaldo() {
		return saldo;
	}

	}


