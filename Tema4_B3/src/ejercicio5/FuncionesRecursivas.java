package ejercicio5;

public class FuncionesRecursivas {
	
	//Una función recursiva es una que se llama a sí misma.
	
	public static int sumatorio (int numero) {
		
		int suma=0;
		
		//Caso base.
		if (numero==1) {
			
			suma=1;
			
		} else {
			
		suma = numero + sumatorio(numero - 1);
		
		}
		
		return suma;
		
	}
	
	public static double potencia (double a, int n) {
		
		double res=0;
		
		//Caso base.
		if (n==0) {
			
			res=1;
		//Multiplicamos a por la potencia de a elevado a n-1.
		} else if (n!=0) {
			
			res = a*potencia(a, n-1);
		}
				
		return res;
	}
	
	public static int serieFibonacci (int n) {
		
		int fibonacci=0;
		
		if (n!=0&&n!=1) {
			
			fibonacci=serieFibonacci(n-1)+serieFibonacci(n-2);
			
		//Caso base.
		} else if (n==0||n==1) {
			
			fibonacci=1;
		
		
		}
		
		return fibonacci;
	}
}
