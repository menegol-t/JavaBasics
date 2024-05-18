package resolucion;
import practica0.Acts32_35;

public class Fraccion {
    int numerador;
    int denominador;
    
    //A
    public Fraccion(int n, int d) {
    	this.numerador = n;
    	this.denominador = d;
    	if(n == 0 || d == 0) {
    		throw new ArithmeticException("ERROR: No se admiten ceros en el numerador ni denominador. ");
    	}
    }
    
    //B
    public void imprimir() {
    	System.out.println(this.numerador + "/"+  this.denominador);
    }
    
    //C
    public void invertirSigno() {
    	this.numerador = this.numerador * -1;
    }
    
    //D
    public void invertir() {
    	int tmp = this.numerador;
    	this.numerador = this.denominador;
    	this.denominador = tmp;
    }
    
    //E
    public double aDouble() {
    	return (double)this.numerador/this.denominador; 
    }
    
    //F
    public void reducir() {
    	int mcd = Acts32_35.mcd(this.numerador, this.denominador);
    	this.numerador = this.numerador/mcd;
    	this.denominador = this.denominador/mcd;
    }
    
    //G
    static public Fraccion producto(Fraccion q1, Fraccion q2) {
    	int num = q1.numerador * q2.numerador;
    	int den = q1.denominador * q2.denominador;
    	
    	Fraccion resultado = new Fraccion(num, den);
    	resultado.reducir();
//    	int mcd = Acts32_35.mcd(resultado.numerador, resultado.denominador);
//    	
//    	resultado.numerador = resultado.numerador /mcd;
//    	resultado.denominador = resultado.denominador/mcd;
    	
    	return resultado;
    }
    
    //Menor Comun Multiplo: Sabemos que como minimo dos numeros son multiplos si los multiplicamos entre si, asi que ese es el tope. De ahi, buscamos hacia abajo si tienen otros multiplos menores, si existe retornamos ese. 
    public static int mcm(int a, int b) {
    	
    	int[] multiplosA = new int[a*b];
    	int[] multiplosB = new int[a*b];
    	
    	for(int i=1; i< a*b;i++) {
    		multiplosA[i] = a*i;
    		multiplosB[i] = b*i;
    	}
    	
    	for(int i = 1; i<multiplosA.length;i++){
    		for(int j = 1; j<multiplosB.length;j++){
        		if(multiplosA[i] == multiplosB[j]) {
        			return multiplosA[i];
        		}
        	}
    	}
    	
    	return a*b;
    }
    
    //Evita que el denominador este en negativo; Si 1/-1 => -1/1, y si -1/-1 => 1/1
    public static Fraccion moverSignoDenNum(Fraccion frac) {
    	if(frac.denominador < 0 && frac.numerador > 0) {
    		frac.denominador = frac.denominador * -1;
    		frac.numerador = frac.numerador * -1;
    	}else if(frac.denominador < 0 && frac.numerador < 0) {
    		frac.invertirSigno();
    	}
    	return frac;
    }
    
    //H
    static public Fraccion suma(Fraccion q1, Fraccion q2) {
    	q1 = Fraccion.moverSignoDenNum(q1); //Asegura que el denominador nunca sea el negativo manteniendo el signo de la fraccion, lo que me permite hacer restas
    	q2 = Fraccion.moverSignoDenNum(q2);
    	
    	if(q1.denominador == q2.denominador) { //Si las fracciones tienen igual denominador, la suma es simple: 3/2 + 5/2 = 8/2
    		Fraccion resultado = new Fraccion (q1.numerador + q2.numerador, q1.denominador);
    		resultado.reducir();
    		return resultado;
    	}else{ //Si las fracciones tienen diferente denominador, tengo que buscar su multiplo menor, dividir este por el denominador, multiplicar el resultado por el numerador y recien ahi sumar
    		int mcmDen = Fraccion.mcm(q1.denominador, q2.denominador);
    		int num = ((mcmDen/q1.denominador)*q1.numerador) + ((mcmDen/q2.denominador)*q2.numerador);
    		Fraccion resultado = new Fraccion(num, mcmDen);
    		resultado.reducir();
    		return resultado;
    	}
    }
}
