package eng2020_1_a01;

public class Retangulo extends Poligono implements Diagonal{

	public Retangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	public double area() {
		return getBase() * getAltura();
	
	}

	@Override
	public String toString() {
		return "Retangulo [getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}

	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * getBase() + 2 * getAltura();
	}

}
