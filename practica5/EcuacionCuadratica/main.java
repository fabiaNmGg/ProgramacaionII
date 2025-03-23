package EcuacionCuadratica;

public class main {

	public static void main(String[] args) {
//		EcuacionCuadratica x=new EcuacionCuadratica(1.0,3,1);
//		EcuacionCuadratica y=new EcuacionCuadratica(1, 2.0, 1);
//		EcuacionCuadratica z=new EcuacionCuadratica(1, 2, 3);
//		
//		x.EsEcuacionCuadratica();
//		y.EsEcuacionCuadratica();
		EsEcuacionCuadratica();
	}

	private static void EsEcuacionCuadratica() {
		EcuacionCuadratica x=new EcuacionCuadratica(1.0,3,1);
		if(x.getDiscriminante()>0) {
			System.out.println("La ecuacion tiene dos raices "+ x.getRaiz1()+" y "+x.getRaiz2());
		}else if(x.getDiscriminante()==0){
			System.out.println("La ecuacion tiene una raiz "+x.getRaiz1());
		}else {
			System.out.println("La ecuacion no tiene raices reales ");
		}
		
	}
	

}
