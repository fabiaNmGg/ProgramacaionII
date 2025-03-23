package PromedioDesviacion;

public class PromedioDesviacion {
	
	public float Promedio(float[] n) {
		float suma=0;
		int c=0;
		for(int i = 0;i< n.length;i++) {
			suma =suma+n[i];
			c=c+1;
		}
		float Promedio=suma/c;
		return Promedio;
	}
	public float Desviacion(float[]n) {
		float sumxp=0;
		int c=0;
		for(int i =0 ; i<n.length;i++) {
			sumxp += Math.pow(n[i] - Promedio(n), 2);
			c++;
		}
		float Desviacion= (float) Math.sqrt(sumxp/(n.length - 1));
		return Desviacion;
	}
}
