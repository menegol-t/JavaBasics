package practica0;

public class Acts25_29 {
	//25
	public static int maximo(int[] a) {
		int i = 0;
		int x = a[i];
		while (i < a.length) {
			if(a[i] > x) {
				x = a[i];	
			}
			i++;
		}
		return x;
	}
	
	//26
	public static int maximoIndice(int[] a) {
		int i = 0;
		int max = maximo(a);
		int indice = 0;
		while (i < a.length) {
			if(a[i] == max) {
				indice = i;
			}
			i++;
		}
		return indice;
	}
	
	//27
	public static int suma(int[]a) {
		int i = 0;
		int suma = 0;
		while(i < a.length) {
			suma+=a[i];
			i++;
		}
		return suma;
	}
	
	//28
	public static boolean estaOrdenado(int[]a) {
		int i = 0;
		while (i<a.length-1) {
			if(a[i+1] < a[i]) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	//29
	public static double promedio(double[]b) {
		int i=0;
		double suma = 0;
		while(i<b.length) {
			suma+=b[i];
			i++;
		}
		return suma/b.length;
	}
	
	public static void main(String [] args) {
//		int[] A = {0, 6, 8, 1, 15, 7, 24};
//		double[] B = {0.6, 8.1, 15.7, 24};
		
		//25
//		System.out.println(maximo(A));
		
		//26
//		System.out.println(maximoIndice(A));
		
		//27
//		System.out.println(suma(A));
		
		//28
//		System.out.println(estaOrdenado(A));
		
		//29
//		System.out.println(promedio(B));
	}
}