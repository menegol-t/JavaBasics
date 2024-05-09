package practica0;

public class Act30 {
	
	//30
	//A
	public static int sumatoriaRec(int n) {
		if(n==0) {
			return 0;
		}
		return n + sumatoriaRec(n-1);
	}
	//B
	public static int sumatoriaParesRec(int n) {
		if (n ==2) {
			return 2;
		}
		
		if(n%2 != 0) {
			--n;
		}
		
		if (n < 2) {
			return n;
		}
		return n + sumatoriaParesRec(n-2);
	}
	//C
	public static double potenciaRec(double x, int a) {
		if (a == 1) {
			return 1;
		}
		return x * potenciaRec(x,a - 1);
	}
	//D
	public static int factorialRec(int n) {
		if(n == 1) {
			return 1;
		}
		return n * factorialRec(n-1);
	}
	
	public static void main(String[] args) {
		//A
//		System.out.println(sumatoriaRec(T.Int()));
		
		//B
//		System.out.println(sumatoriaParesRec(T.Int()));
		
		//C
//		System.out.println(potenciaRec(T.Dou(), T.Int()));
		
		//D
//		System.out.print(factorialRec(T.Int()));
		
		T.closeScan();
	}
}