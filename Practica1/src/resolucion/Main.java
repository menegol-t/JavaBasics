package resolucion;

public class Main {
	public static void main(String[] args){
		//A
		Fraccion f = new Fraccion(9,10);
		//B
		f.imprimir();
		//C
		f.invertirSigno();f.imprimir();
		//D
		f.invertir();f.imprimir();
		//E
		System.out.println(f.aDouble());
		//F
		f.reducir();f.imprimir();
		//G
		Fraccion g = new Fraccion(20,30);
		Fraccion.producto(f, g).imprimir();
		//H
		Fraccion.suma(f, g).imprimir();
		
	}

}
