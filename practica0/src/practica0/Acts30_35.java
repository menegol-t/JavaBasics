package practica0;

public class Acts30_35 {
	
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
	
	public static void main(String[] args) {
		//A
//		System.out.println(sumatoriaRec(Acts1_9.tecladoInt()));
		
		//B
		System.out.println(sumatoriaParesRec(Acts1_9.tecladoInt()));
	}
}