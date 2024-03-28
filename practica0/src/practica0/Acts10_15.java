package practica0;

public class Acts10_15 {
	//10
	public static int sumatoria(int n) {
		int i = 1;
		int m = 0;
		while (i <= n) {
			m = m + i;
			i++;
		}
		return m;
	}
	
	//11
	public static int sumatoriaPares(int n) {
		int i = 1;
		int m = 0;
		while (i <=n) {
			if (i%2==0) {
				m = m + i;
			}
			i++;
		}
		return m;
	}
	
	//12
	public static double potencia(double x, int a) {
		int i = 1;
		double y = x;
		while (i < a) {
			y = y*x;
			i++;
		}
		return y;
	}
	
	//13
	public static double factorial(int n) {
		int i = 1;
		int m = 1;
		while (i <= n) {
			m = m*i;
			i++;
		}
		return m;	
	}
	
	//14
	public static int contarCifras(int n) {
		// Opcion mas facil pero JAVA me putea con que no podes concatenar Int con String; String s = ""; s = s + n; return s.length();
		int i = 0;
		double m = n;
		if (n < 0) {
			m = (potencia(n, 2))/2;
		}
		while ((m / 10) >= 0.1) {
			m = m / 10;
			i++;
		}
		return i;
	}
	
	//15
	public static boolean esDivisible(int n, int m) {
		if (n % m == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		//10 Suma todos los numeros mas chicos que el numero
//		System.out.println(sumatoria(Acts1_9.tecladoInt()));
		
		//11 Suma todos los numeros pares mas chicos que el numero
//		System.out.println(sumatoriaPares(Acts1_9.tecladoInt()));
		
		//12 Calcula la potencia de un numero dandole la base y el exponente
//		System.out.println(potencia(Acts1_9.tecladoDouble(), Acts1_9.tecladoInt()));
		
		//13 Calcula el factorial de un numero
//		System.out.println(factorial(Acts1_9.tecladoInt()));
		
		//14 Cantidad de cifras que tiene el numero
//		System.out.println(contarCifras(Acts1_9.tecladoInt()));
		
		//15 True si el primer numero es divisible por el segundo
//		System.out.println(esDivisible(Acts1_9.tecladoInt(), Acts1_9.tecladoInt()));
	}
}