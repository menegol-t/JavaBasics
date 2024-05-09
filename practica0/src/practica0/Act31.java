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
	
	public static void main(String[] args) {
		//A
		System.out.print(fibrec(T.Int()));
	}
}