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
//	public static int maximoIndice(int[] a) {
//		
//	}
	
	public static void main(String [] args) {
		int[] A = {0, 6, 8, 1, 15, 7, 24};
		
		//25
		System.out.println(maximo(A));
		
		//26
		System.out.println();
	}
}