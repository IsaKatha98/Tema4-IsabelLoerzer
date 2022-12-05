package ejercicio3;

public class NumerosAleatorios {
	
	/*Añade las funciones que creaste en el ejercicio 5 del boletín SOBRECARGA DE FUNCIONES, 
	 * añádelas a una única clase denominada NumerosAleatorios. Las funciones de esta clase 
	 * deben ser estáticas. Desde el método main(), que estará definido en otra clase distinta, 
	 * se pedirán los valores correspondientes para probar estas funciones.
	 * */

	//Creamos una función estática con un parametro númerico.
	public static void numerosAleatorios (int n1) {
	
		int numRandom=0;
		
		//Creamos un bucle con el que generaremos una cantidad n1 de números aleatorios entre 0 y 1.
		for (int i=1; i<=n1; i++) {
			
			numRandom=(int)(Math.random())*2;
			
			//Se imprime el resultado.
			System.out.println(numRandom);
				
		}	
	}
	
	//Creamos una función estática con dos parámetros de entrada con valor numérico.
	public static void numerosAleatorios (int n1, int n2) {
		
		int numRandom=0;
		
		//Creamos un bucle que genere una cantidad n1 de números aleatorios cuyo máximo será n2.
		for (int i=1; i<=n1; i++) {
			
			numRandom= (int)(Math.random()*n2);
			
			//Se imprime el resultado.
			System.out.println(numRandom);
			
		}

	}
	
	//Creamos una función estática con tres parámetros de entrada con valor numérico.
	public static void numerosAleatorios (int n1, int n2, int n3) {
		
		int numRandom=0;
		
		for (int i=1; i<=n1; i++) {
			
			//Creamos un bucle que genere una cantidad n1 de números aleatorios cuyo máximo será n2 y cuyo mínimo será n3.
			numRandom= (int) (Math.random()*(n2-n3)+n3);
			
			//Se imprime el resultado.
			System.out.println(numRandom);
		
		}
		
	}

}
