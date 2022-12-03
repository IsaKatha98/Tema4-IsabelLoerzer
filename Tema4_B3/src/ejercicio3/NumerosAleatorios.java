package ejercicio3;

public class NumerosAleatorios {
	
public static void numerosAleatorios (int n1) {
		
		int numRandom=0;
		
		for (int i=1; i<=n1; i++) {
			
			numRandom=(int)(Math.random())*2;
			
			System.out.println(numRandom);
				
		}
		
		
		
	}
	
	public static void numerosAleatorios (int n1, int n2) {
		
		int numRandom=0;
		
		for (int i=1; i<=n1; i++) {
			
			numRandom= (int)(Math.random()*n2);
			
			System.out.println(numRandom);
			
		}
		
		

	}
	
	public static void numerosAleatorios (int n1, int n2, int n3) {
		
		int numRandom=0;
		
		for (int i=1; i<=n1; i++) {
			
			numRandom= (int) (Math.random()*(n2-n3)+n3);
			
			System.out.println(numRandom);
		
		}
		
	}

}
