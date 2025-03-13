//Arnold Fabian Morales Gonzales
//15230927
package practica4;
public class FiguraGeometrica {

    public double area(double radioCir) {
        return Math.PI * radioCir * radioCir;
    }

    public double area(double baseRec, double alturaRec) {
        return baseRec * alturaRec;
    }

    public double area(float baseTr, float alturaTr) {
        return (baseTr * alturaTr) / 2;
    }

    public double area(double baseMayTra, double baseMenTra, double alturaTra) {
        return ((baseMayTra + baseMenTra) * alturaTra) / 2;
    }

    public double area(double ladoPent, float apotemaPent) {
        return (5 * ladoPent * apotemaPent) / 2;
    }


	public static void main(String[] args) {
		double f1,f2,f3,f4,f5;
		FiguraGeometrica A=new FiguraGeometrica();
		f1=A.area(5.6,3.5);
		f2=A.area(4.8, 8);
		f3=A.area(5f,8.5f);
		f4=A.area(6, 3,5 );
		f5=A.area(1.9,6f);
		
		
		System.out.println("circulo: "+f1);
		System.out.println("Rectangulo: "+f2);
		System.out.println("Trinagulo Rectangulo: "+f3);
		System.out.println("Trapecio: "+f4);
		System.out.println("Pentagono: "+f5);
	}

}