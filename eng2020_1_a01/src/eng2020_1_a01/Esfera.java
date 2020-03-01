package eng2020_1_a01;

public class Esfera extends Tresd {
	private double raio;
	
	public Esfera() {
		// TODO Auto-generated constructor stub
	}
	
	public Esfera(double raio) {
		this.raio = raio;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return (4/3) * Math.PI * Math.pow(getRaio(), 3);
	}

	@Override
	public String toString() {
		return "Esfera [raio=" + raio + "]";
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
