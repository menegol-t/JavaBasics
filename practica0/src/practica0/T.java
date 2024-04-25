package practica0;
import java.util.Scanner;

public class T {
	private static Scanner scan = new Scanner(System.in);
	
	public static double Dou() {return scan.nextDouble();}
	
	public static int Int() {return scan.nextInt();}
	
	public static String Str() {return scan.nextLine();}
	
	public static void closeScan() {scan.close();}
}
