package eng2020_1_a01;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	public Triangulo() {
		// TODO Auto-generated constructor stub
	}
	
	public double area() {
		return (getBase() * getAltura())/2;
		
	}

}
