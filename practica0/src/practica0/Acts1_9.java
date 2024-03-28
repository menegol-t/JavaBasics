package practica0;
import java.util.Scanner;

public class Acts1_9 {	
	public static double tecladoDouble() {
		Scanner numero = new Scanner(System.in);
		numero.close();
		return numero.nextDouble();
	}
	
	public static int tecladoInt() {
		Scanner numero = new Scanner(System.in);
		numero.close();
		return numero.nextInt();
	}
	
	public static String tecladoTxt() {
		Scanner txt = new Scanner(System.in);
//		txt.close();
		return txt.nextLine();
	}
	
	//1
	public static void holaMundo() {
		System.out.println("Hola mundo!");
	}
	
	//2
	public static void holaNombre(String nombre) {
		System.out.println("Hola, " + nombre);
	}
	
	//3
	public static int imprimirSuma(int n, int m) {
		return (n + m);
	}
	
	//4
	public static void imprimirDivisiones() {
		System.out.println( 1/2 );
		System.out.println( 1.0 / 2.0) ;
		System.out.println( 1.0 / 2 );
		System.out.println( 1/ 2.0 );
		// System.out.println( "1"/"2" );
		System.out.println( 1 + 2 );
		System.out.println( "1" + "2" );
		System.out.println( 16/2*4 );
		System.out.println( 16/(2*4) );
	}
	
	//5
	public static int imprimirPromedio(int a, int b) {
		return (a+b)/2;
	}
	
	//8
	public static String ponerNota(double x, double y) {
		double avg = (x + y) / 2;
		
		if(avg >= 7) {
			return "Promocionado";
		}else if (avg >= 4 && avg < 7){
			return "Aprobado";
		}else {
			return "Debe recuperar";
		}
		
	}
	
	//9
	public static void imprimirFecha(int dia, int mes, int anio) {
		String mos;
		switch(mes) {
			case 1: mos = "Enero"; break;
			case 2: mos = "Febrero"; break;
			case 3: mos = "Marzo"; break;
			case 4: mos = "Mayo"; break;
			case 5: mos = "Abril"; break;
			case 6: mos = "Junio"; break;
			case 7: mos = "Julio"; break;
			case 8: mos = "Octubre"; break;
			case 9: mos = "Agosto"; break;
			case 10: mos = "Septiembre"; break;
			case 11: mos = "Noviembre"; break;
			default: mos = "Diciembre";
		}
		
		System.out.println(dia + " de " + mos + " de " + anio);
	}
	
	public static void main(String [] args) {
		//1
//		holaMundo();
	
		//2
//		holaNombre(tecladoTxt()); 		
		
		//3
//		System.out.println("La suma es: "+ imprimirSuma(tecladoInt(), tecladoInt()));
		
		//4
//		imprimirDivisiones();
		
		//5
//		System.out.print("El promedio es: " + imprimirPromedio(tecladoInt(), tecladoInt()));
		
		//8
//		System.out.print(ponerNota(tecladoDouble(), tecladoDouble()));
		
		//9
//		imprimirFecha(tecladoInt(),tecladoInt(),tecladoInt());
	}
}