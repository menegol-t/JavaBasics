package practica0;

public class Act16_22 {
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
	
	//18
	public static int cantidadDeVocales(String s) {
		int vocales = 0;
		vocales += cantidadDeApariciones(s, 'a');
		vocales += cantidadDeApariciones(s, 'e');
		vocales += cantidadDeApariciones(s, 'i');
		vocales += cantidadDeApariciones(s, 'o');
		vocales += cantidadDeApariciones(s, 'u');
		return vocales;
	}
	
	//19
	public static boolean esAbecedaria(String s) {
		s = s.toLowerCase();
		int i = 0;
		while ( i < s.length() -1) {
			if(s.charAt(i) > s.charAt(i + 1)) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	//20
	public static boolean esCapicua(String s) {
		if (s.equals(reversa(s))) {
			return true;
		}
		return false;
	}
	
	//21
	public static boolean esSinRepetidos(String s) {
		int i = 0;
		while (i < s.length()-1) {
			int j = i+1;
			while(j <= s.length() - 1) {
				if (s.charAt(i) == s.charAt(j)) {
					return false;
				}
				j++;
			}
			i++;
		}
		return true;
	}

	public static void main (String[] args) {
		//16 Imprime el string en reversa
//		System.out.println(reversa(Acts1_9.tecladoTxt()));
		
		//17 Te dice la cantidad de apariciones de una letra en un string
//		System.out.println(cantidadDeApariciones(Acts1_9.tecladoTxt(), (Acts1_9.tecladoTxt()).charAt(0)));
		
		//18 Te dice la cantidad de vocales en un string
//		System.out.println(cantidadDeVocales(Acts1_9.tecladoTxt()));
		
		//19 ¿Las letras aparecen siguiendo el orden del abecedario? Himno: true, casa: false
//		System.out.println(esAbecedaria(Acts1_9.tecladoTxt()));
		
		//20 Retorna true si la palabra se lee igual al delante o al reves
//		System.out.println(esCapicua(Acts1_9.tecladoTxt()));
		
		//21
//		System.out.println(esSinRepetidos(Acts1_9.tecladoTxt()));
	}
}
