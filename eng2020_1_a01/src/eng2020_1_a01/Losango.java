package eng2020_1_a01;

public class Losango extends Poligono {

	public Losango(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	public Losango() {
		// TODO Auto-generated constructor stub
	}
	
	public double area() {
		return getBase() * getAltura();
	}

}
