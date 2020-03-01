package eng2020_1_a01;

public class Cilindro extends Tresd {
	private double base, altura, raio;
	
	public Cilindro() {
		// TODO Auto-generated constructor stub
	}
	
	public Cilindro(double base, double altura, double raio) {
		this.base = base;
		this.altura = altura;
		this.raio = raio;
	}
	

	@Override
	public double volume() {
		
		return Math.PI * Math.pow(getRaio(), 3) * getAltura();
	}

	@Override
	public String toString() {
		return "Cilindro [base=" + base + ", altura=" + altura + ", raio=" + raio + "]";
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
