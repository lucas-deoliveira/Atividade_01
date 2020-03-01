package eng2020_1_a01;

import java.util.ArrayList;

public class Geometria {

	public Geometria() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(1.0));
		figuras.add(new Circulo(10.0));
		figuras.add(new Retangulo(5, 10));
		figuras.add(new Quadrado(10));
		
		
		
		for(Figura figura: figuras) {
			System.out.println("****************");
			System.out.println(figura);
			System.out.println("�rea = " + figura.area());
			if (figura instanceof Diagonal) {
				Diagonal d = (Diagonal)figura;
				System.out.println("Diagonal = " + d.diagonal());
			}
			
			
		}
	}
	
}
