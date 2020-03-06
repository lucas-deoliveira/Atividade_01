package eng2020_1_a01;

public class Pitagoras extends Poligono{
	
	private double cata, catb, hipo;
	
	
	public Pitagoras (double cata, double catb, double hipo) {
		this.cata = cata;
		this.catb = catb;
		this.hipo = hipo;
	}
	
	public Pitagoras() {
		// TODO Auto-generated constructor stub
	}
	
	public double valor() {
		return (getBase()*getBase()) +(getAltura()*getAltura());	
		
	}

	@Override
	public String toString() {
		return "Pitagoras [cata=" + cata + ", catb=" + catb + ", hipo=" + hipo + ", getBase()=" + getBase()
				+ ", getAltura()=" + getAltura() + "]";
	}
	
	
}
