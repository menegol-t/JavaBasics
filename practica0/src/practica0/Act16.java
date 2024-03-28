package practica0;

public class Act16 {
	//16
	public static String reversa(String s) {
		int i = s.length() - 1;
		String nuevo = "";
		while(i >= 0 ) {
			nuevo = nuevo + s.charAt(i);
			i--;
		}
		return nuevo;
	}
	//17
	public static int cantidadDeApariciones(String s, char c) {
		s = s.toLowerCase();
		int i = s.length() - 1;
		int contador  = 0;
		while(i >= 0) {
			if(s.charAt(i) == c){
				contador ++;
			}
			i--;
		}
		return contador;
		
	}
	
	public static void main (String[] args) {
		//16 Imprime el string en reversa
		System.out.println(reversa(Acts1_9.tecladoTxt()));
		
		//17 Te dice la cantidad de apariciones de una letra en un string
		System.out.println(cantidadDeApariciones(Acts1_9.tecladoTxt(), (Acts1_9.tecladoTxt()).charAt(0)));
	}
}
