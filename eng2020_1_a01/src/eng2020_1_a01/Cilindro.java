package eng2020_1_a01;

public class Cilindro extends Tresd {
	private double altura, raio;
	
	public Cilindro() {
		// TODO Auto-generated constructor stub
	}
	
	public Cilindro(double altura, double raio) {
		this.altura = altura;
		this.raio = raio;
	}
	

	@Override
	public double volume() {
		
		return Math.PI * Math.pow(getRaio(), 3) * getAltura();
	}

	@Override
	public String toString() {
		return "Cilindro [altura=" + altura + ", raio=" + raio + "]";
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
