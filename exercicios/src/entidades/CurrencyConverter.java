package entidades;

/*
 * Faça um programa para ler a cotação do dolar e depois um valor em dolar a ser comprado
 * por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dolares, considerando ainda
 * que a pessoa terá de pagar 6% do iof sobre o valor em dolar. Criar uma classe CurrencyConverter para
 * ser responsável pelos cálculos*/

public class CurrencyConverter {
	
	
	public static double dolar() {
		return 3.10;
	}
	
	public static double calc(double valor) {
		double imposto = dolar() * 0.06;
		return (valor * dolar()) + imposto;
	}

}
