package PromedioDesviacion;

public class main {

	public static void main(String[] args) {
		float[] numeros = {1.9f, 2.5f, 3.7f, 2f, 1f, 6f, 3f, 4f, 5f, 2f};
	    PromedioDesviacion x = new PromedioDesviacion();
	    float promedio = x.Promedio(numeros);
	    float desviacion = x.Desviacion(numeros);
	    System.out.printf("El promedio es: %.2f%n", promedio);
	    System.out.printf("La desviación estándar es: %.4f%n", desviacion);
	}

}
