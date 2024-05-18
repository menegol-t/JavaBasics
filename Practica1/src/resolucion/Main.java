package resolucion;

public class Main {
	public static void main(String[] args){
		//1)A
		Fraccion f = new Fraccion(9,10);
		
		f.editarNum(32);
		//1)B
		f.imprimir();
		//1)C
		f.invertirSigno();f.imprimir();
		//1)D
		f.invertir();f.imprimir();
		//1)E
		System.out.println(f.aDouble());
		//1)F
		f.reducir();f.imprimir();
		//1)G
		Fraccion g = new Fraccion(20,30);
		Fraccion.producto(f, g).imprimir();
		//1)H
		Fraccion.suma(f, g).imprimir();
		
		//2A
		
	}
}
