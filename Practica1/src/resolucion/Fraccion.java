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
    	int mcd = Acts32_35.mcd(resultado.numerador, resultado.denominador);
    	
    	resultado.numerador = resultado.numerador /mcd;
    	resultado.denominador = resultado.denominador/mcd;
    	
    	return resultado;
    }
}
