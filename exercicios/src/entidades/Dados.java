package entidades;

public class Dados {
	public String name;
	public double salarioBruto;
	public double taxa;
	
	public double netSalary() {
		return salarioBruto - taxa;
	}
	public void aumentoSalario(double percentage) {
		salarioBruto += salarioBruto * percentage / 100.00;
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary()); 
	}

}
