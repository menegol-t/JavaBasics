package resolucion;

public class Circulo {
	double radio;
	Punto centro;
	
	//A
	public Circulo(double centro_x, double centro_y, double radio) {
		this.centro = new Punto(centro_x, centro_y);
		this.radio = radio;
	}
	
	//B
	public void imprimir() {
		this.centro.imprimir();
		System.out.println("Radio: " + this.radio);
	}
	
	//C
	public double perimetro() {
		return 2 * Math.PI * this.radio;
	}
	
	public double superficie() {
		return Math.PI * (this.radio * this.radio);
	}
	
	//D
	public void escalar(double factor) {
		this.radio = this.radio * factor;
	}
	
	//E
	public void desplazar(double desp_x, double desp_y) {
		this.centro.x += desp_x;
		this.centro.y += desp_y;
	}
	
	//G
//	public static double distancia(Circulo c1, Circulo c2) {
//		
//	}
}