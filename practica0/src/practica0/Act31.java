package practica0;

public class Act31 {
	//A
	public static int fibrec(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return fibrec(n-1) + fibrec(n-2);
	}
	
	/* Esto funciona asi: Fibrec(4) sabemos que es 3. Entonces:
	 *
	 * 				    		Fibrec(4-1)		    			+							Fibrec(4-2)
	 *
	 *			[Fibrec(3-1) 		+ 		  Fibrec(3-2)] 		+ 			[Fibrec(2-1) 		+ 			Fibrec(2-2)]
	 * 	
	 * {Fibrec(2-1) + Fibrec(2-2)}  + 			Fibrec(1)   	+			  Fibrec(1)	 		+ 			 Fibrec(0) 
	 * 
	 * {	1 		+ 		0	 }	+ 				1			+				1				+				0
	 * 				
	 * 				1				+				1			+				1				+				0
	 * 				
	 * 								2							+								1
	 * 
	 * 															3
	 * */
	
	//B
	public static int fibiter(int n) {
		int[] numeros = new int[n+1];
		
		numeros[0] = 0;
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		for(int i = 1; i<=n;i++) {
			if(i==1) {
				numeros[i] = 1;
			}else {
				numeros[i] = numeros[i-2] + numeros[i-1];
			}
		}
		return numeros[n];
	}
	
	public static void main(String[] args) {
		//A
//		System.out.print(fibrec(T.Int()));
		//B
//		System.out.print(fibiter(T.Int()));
	}
}