package eng2020_1_a01;

public class Trapezio extends Poligono {
private double basemaior, lado1, lado2;
	public Trapezio(double basemenor, double altura, double basemaior, double lado1, double lado2) {
		super(basemenor, altura);
		this.basemaior = basemaior;
		this.lado1 = lado1;
		this.lado2 = lado2;
	
	}

	public Trapezio() {
		
	}

	@Override
	public double perimetro() {
		lado1 = (this.basemaior - this.getBase()) / 2;
		lado2 = Math.sqrt(Math.pow(2, lado1) + Math.pow(2, this.getAltura()));
		return this.basemaior + this.getBase() + 2 * lado2;
	}
	public double area() {
		return ((getBasemaior() + getBase()) * getAltura())/2;
	}

	@Override
	public String toString() {
		return "Trapezio [Base maior =" + basemaior + ", Base menor = " + getBase() + ", Altura = " + getAltura() + "]";
	}

	public double getBasemaior() {
		return basemaior;
	}

	public void setBasemaior(double basemaior) {
		this.basemaior = basemaior;
	}

}
