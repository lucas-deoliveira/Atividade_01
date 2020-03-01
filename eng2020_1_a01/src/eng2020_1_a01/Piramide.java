package eng2020_1_a01;

public class Piramide extends Tresd {
	private double base, altura, profundidade;
	
	public Piramide() {
		// TODO Auto-generated constructor stub
	}
	public Piramide(double base, double altura, double profundidade) {
		this.base = base;
		this.altura = altura;
		this.profundidade = profundidade;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return (1/3) * getBase() * getAltura() * getProfundidade();
	}
	@Override
	public String toString() {
		return "Piramide [base=" + base + ", altura=" + altura + ", profundidade=" + profundidade + "]";
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
	public double getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

}
