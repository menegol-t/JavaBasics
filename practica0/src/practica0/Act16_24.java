package practica0;

public class Act16_24 {
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
		int i = 0;
		int contador  = 0;
		while(i <= s.length() - 1) {
			if(s.charAt(i) == c){
				contador ++;
			}
			i++;
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
//		int i = 0;
//		while (i < s.length()-1) {
//			int j = i+1;
//			while(j <= s.length() - 1) {
//				if (s.charAt(i) == s.charAt(j)) {
//					return false;
//				}
//				j++;
//			}
//			i++;
//		}
//		return true;
		int i = 0;
		while ( i<s.length()-1) {
			if (cantidadDeApariciones(s, s.charAt(i))> 1) {
				return false; 
			}
			i++;
		}
		return true;
	}
	
	//22
	public static String sinRepetidos(String s) {
		if(esSinRepetidos(s)) {
			return s;
		}else {
			String nuevo = "";
			int i = 0;
			while(i<=s.length()-1) {
				if(cantidadDeApariciones(s, s.charAt(i)) == 1) { //Si la letra aparece una vez, la dejo
					nuevo += s.charAt(i);
				}else {
					if (nuevo.length() == s.indexOf(s.charAt(i))) { //Si la letra aparece multiples veces, saco el indice de su primera aparicion. Si el indice es mas grande que el length del nuevo string, es su primera aparicion, asi que la pongo en el string. Si no es su primera vez, no la pongo en el string.
						nuevo+=s.charAt(i);
					}
				}
				i++;
			}
			return nuevo;
		}
	}
	
	//23 
	public static boolean puedenColocarse(String a, String b, String c) {
		int i = 0; 
		String nuevo = "";
		boolean aFitsInB = false;
		while (i < b.length()) {
			
			nuevo+=b.charAt(i);			
			int j = 0;
			
			if(!aFitsInB) {
				while (j < a.length()) {
										
					if(nuevo.charAt(i) == a.charAt(j)) { //Verifica si alguna letra de A coincide con B
						aFitsInB = true; //Si coincide, se pone true
						i+=2; //Se avanza el indice de B, para que haya una letra de diferencia entre la coincidencia de A con B y la de C con B
						if(b.length() < i) { //Si B es muy corta y este espacio de diferencia no es posible, se retorna false
							return false;
						}
						j = a.length(); //Si ya encontramos la coincidencia entre A y B, corto el ciclo de busqueda
					}
					
					j++;
				}
			}
			if(aFitsInB) { //Una vez que se encontro la coincidencia entre A y B, se busca la coincidencia entre B y C, ya con 1 letra de diferencia entre A y C
				int k = 0;
				while(k < c.length()) {
					if(b.charAt(i) == c.charAt(k)) { 
						return true;
					}
					k++;
				}
			}
			i++;
		}
		return false;
	}
	
	//24
	public static boolean dobleteCapicua(String s) {
		String sinPrimero = "";
		String sinUltimo = "";
		
		int i = 1;
		while(i<s.length()) {
			sinPrimero+=s.charAt(i);
			i++;
		}
		i = s.length()-2;
		while(i>0) {
			sinUltimo+=s.charAt(i);
			i--;
		}
		
		if(esCapicua(s) || esCapicua(sinPrimero) || esCapicua(sinUltimo)) { //Palanbras como "BANANA" son doble capicua, porque "ANANA" es capicua y la letra "B" tambien es capicua. Si se da este caso en el que la palabra  + la ultima letra es doble capicua, o al palabra + la primera letra, se retorna true. 
			return true;
		}
		
		String primeraMitadNuevo = "";
		String segundaMitadNuevo = "";
		i = 0;
		while(i<s.length()) { //El segundo caso es palabras como neuquenoro, donde NEUQUEN + ORO es doble capicua. 
			primeraMitadNuevo+=s.charAt(i);
			if (i>1 && esCapicua(primeraMitadNuevo)) {
				int j = i+1;
				while(j < s.length()) { //Cuando se encuentra que la primera parte de la palabra es capicua, se divide la palabra en 2 y se empieza a guardar la segunda parte de la palabra 
					segundaMitadNuevo+=s.charAt(j);
					j++;
				}
				i = s.length();
			}
			i++;
		}
		if(esCapicua(primeraMitadNuevo) && esCapicua(segundaMitadNuevo)) { //Si tanto la primera como la segunda parte de la palabra son capicua, se retorna true. Caso contrario, no es doble capicua
			return true;
		}
		return false;
	}

	public static void main (String[] args) {
		//16 Imprime el string en reversa
		System.out.println(reversa(T.Str()));
		
		//17 Te dice la cantidad de apariciones de una letra en un string
//		System.out.println(cantidadDeApariciones(T.Str(), (T.Str()).charAt(0)));
		
		//18 Te dice la cantidad de vocales en un string
//		System.out.println(cantidadDeVocales(T.Str()));
		
		//19 ¿Las letras aparecen siguiendo el orden del abecedario? Himno: true, casa: false
//		System.out.println(esAbecedaria(T.Str()));
		
		//20 Retorna true si la palabra se lee igual al delante o al reves
//		System.out.println(esCapicua(T.Str()));
		
		//21 Devuele true si no hay chars repetidos en el String
//		System.out.println(esSinRepetidos(T.Str()));
		
		//22 Devuelve el String unicamente con la primera aparicion de cada cadena repetida: camaleon -> camleon
//		System.out.println(sinRepetidos(T.Str()));
		
		//23 Chequea si el primer y ultimo string tienen letras compartidas con el segundo string, de tal moodo que B tenga alguna letra que coincida con A, y a la vez 
//		System.out.println(puedenColocarse(T.Str(), T.Str(), T.Str()));
		
		//24 Se fija si una palabra se puede separar en 2 capicua. Si se puede, responde true
//		System.out.println(dobleteCapicua(T.Str()));
	
		T.closeScan();
	}
}
