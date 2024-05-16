package resolucion;

public class Main {
	public static void main(String[] args){
		Fraccion f = new Fraccion(9,10);
		Fraccion g = new Fraccion(20,30);
		System.out.print(Fraccion.producto(f, g).numerador + "/" + Fraccion.producto(f, g).denominador);
		
		
	}

}
