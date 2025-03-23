package EcuacionCuadratica;

public class EcuacionCuadratica {
	double a,b,c;
	
	
	public EcuacionCuadratica(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getDiscriminante() {
		return this.b*this.b-4*this.a*this.c;
		
	}
	public double getRaiz1() {
		return (-this.b+ Math.sqrt(getDiscriminante()))/2*this.a;
	}
	public double getRaiz2() {
		return (-this.b- Math.sqrt(getDiscriminante()))/2*this.a;
	}
	@Override
	public String toString() {
		return "EcuacionCuadratica [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
	
}
 
