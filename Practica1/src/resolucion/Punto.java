package resolucion;

public class Punto {
	double x;
	double y;
	
	//A
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	//B
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
//	//Setter Si hago las variables privadas como para usar esto, se rompe todo 
//	public void setx(double a) {
//		this.x = a;
//	}
//	
//	public void sety(double a) {
//		this.y = a;
//	}
//	
//	//Getters
//	public double getx() {
//		return this.x;
//	}
//	
//	public double gety() {
//		return this.y;
//	}
	
	//C
	public void imprimir() {
		System.out.println("(" + x + ";" + y + ")");
	}
	
	//D
	public void desplazar(double desp_x, double desp_y) {
		this.x += desp_x;
		this.y += desp_y;
	}
	
	//E
	static public double distancia(Punto p1, Punto p2) {
//		double x = p1.x - p2.x;
//		double y = p1.y - p2.y;
//		Punto w = new Punto(x,y);
//		return w;
		if(p1.x > p2.x) {
			double tmp = p1.x;
			p1.x = p2.x;
			p2.x = tmp;
		}
		
		return p2.x - p1.x; //devuelve la distancia en X de los dos numeros
	}
}
