package eng2020_1_a01;

public class Trapezio extends Poligono {
private double basemaior;;
	public Trapezio(double basemenor, double altura, double basemaior) {
		super(basemenor, altura);
		this.basemaior = basemaior;
	
	}

	public Trapezio() {
		
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
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
