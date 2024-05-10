package resolucion;

public class Fraccion {
    int numerador;
    int denominador;
    
    //A
    public Fraccion(int n, int d) {
    	this.numerador = n;
    	this.denominador = d;
    }
    
    //B
    public void imprimir() {
    	System.out.println(this.numerador + "/"+  this.denominador);
    }
    
    //C
    public void invertirSigno() {
    	this.numerador = this.numerador * -1;
//    	if(this.numerador < 0) {
//    		if(this.denominador < 0) {
//    			this.denominador = this.denominador * -1;
//    		}else if(this.denominador > 0){
//    			this.numerador = this.numerador * -1;
//    		}
//    	}else if(this.numerador > 0) {
//    		if(this.denominador < 0) {
//    			this.denominador = this.denominador * -1;
//    		}else if(this.denominador > 0){
//    			this.numerador = this.numerador * -1;
//    		}
//    	}
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
}
