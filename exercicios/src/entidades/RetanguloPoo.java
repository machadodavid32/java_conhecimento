package entidades;

/* Esta é uma classe criada para o programa a ser feito conforme descrição abaixo:
 * Fazer um programa para ler os valores da altura e largura de um retangulo.
 * Em seguida mostrar na tela o valor de sua área, perimetro e diagonal*/

public class RetanguloPoo {
	public double altura;
	public double largura;
	
	public double area() {
		return altura * largura;
	}
	public double perimetro() {
		return altura + largura;
	}
	public double diagonal() {
		return Math.sqrt(largura * largura + altura * altura);
	}

}
