package practica0;

public class Acts32_35 {
	//32
	public static void collatz(int n) {	
		while(n != 1) {
			if (n % 2 == 0) {
				n = n/2;
				System.out.println(n);
			}else {
				n = 3*n+1;
				System.out.println(n);
			}
		}
	}
	//32 pero recursiva
	public static int collatzRec(int n) {
		if(n == 1) return 1;
		
		if(n%2 == 0) {
			System.out.println(n/2);
			return collatzRec(n/2);
		}
		else {
			System.out.println(3*n+1);
			return collatzRec(3*n+1);
		}
	}
	
	//33
	public static int mcd(int a, int b) {
		if(b == 0) {
			System.out.println(a);
			return a;
		}
		else {
//			System.out.println(b + "/" + a%b);
			return mcd(b,(a%b));
		}
	}
	
	//34
	public static String asterizcos(String s) {
		String nueva = "";
		for(int i = 0; i<s.length(); i++) {
			if(i<s.length()-1) {
				nueva += s.charAt(i) + "*";
			}else{
				nueva+= s.charAt(i);
			}
		}
		return nueva;
	}
	
	//35
	public static String sinRepetidosContiguos(String s) {
		String nueva = "";
		for(int i = 0;i<s.length();i++) {
			if(i == s.length()-1) {
				nueva+=s.charAt(i);
			}
			else if(s.charAt(i) != s.charAt(i+1) ) {
				nueva+=s.charAt(i);
			}
		}
		return nueva; 
	}
	
	public static void main(String[] args) {
		//32
//		collatz(T.Int());
		
		//33
//		mcd(T.Int(), T.Int());
		
		//34
//		System.out.println(asterizcos(T.Str()));
		
		//35
//		System.out.print(sinRepetidosContiguos(T.Str()));
		
		T.closeScan();
	}
}
