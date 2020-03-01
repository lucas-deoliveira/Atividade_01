package eng2020_1_a01;

public class Triangulo extends Poligono {
	private double lado1, lado2, lado3;
	public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
		super(base, altura);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public Triangulo() {
		// TODO Auto-generated constructor stub
	}
	
	public double area() {
		return (getBase() * getAltura())/2;
		
	}

	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	@Override
	public String toString() {
		return "Triangulo [getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}

}
