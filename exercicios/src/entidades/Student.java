package entidades;

public class Student {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double Media() {
		return (nota1 + nota2 + nota3);
	}
	public double FaltaQuanto() {
		if (Media() < 60) {
			return 60.0 - Media();
		}
		else {
			return 0.0;
		}
	}
	}
