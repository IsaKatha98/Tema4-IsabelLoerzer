package ejercicio5;


/*Crea una clase denominada FuncionesRecursivas. En esta clase se definirán las siguientes funciones estáticas, 
 * que deben ser implementadas de forma recursiva:
 * 
 * -	int sumatorio(int numero): Devuelve la suma de todos los números entre 1 y n.
 * 
 * - 	double potencia(double a, int n): Esta función devuelve el resultado de an.
 * 
 * -	int serieFibonacci(int numero): A esta función se le pasará un número entero y nos devolverá 
 * 		el término correspondiente de la serie de Fibonacci. El enésimo valor de la serie de Fibonacci se 
 *		calcula sumando los dos valores anteriores de la serie. Es decir:
			
			fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
			fibonacci(0) = 1
			fibonacci(1) = 1
*/

public class FuncionesRecursivas {
	
	//Una función recursiva es una que se llama a sí misma.
	
	//Creamos una función estática sumatorio con un parámetro de entrada de valor numérico.
	public static int sumatorio (int numero) {
		
		int suma=0;
		
		//Caso base: la función deja de ser recursiva cuando n=1.
		if (numero==1) {
			
			suma=1;
		
		//Se establece el resultado a partir de la suma del número más la suma de todos los números anteriores (numero-1)
		} else {
			
		suma = numero + sumatorio(numero - 1);
		
		}
		
		//Devolvemos el resultado.
		return suma;
		
	}
	
	//Creamos una función estática potencia con dos parámetros de entrada de valor numérico.
	public static double potencia (double a, int n) {
		
		double res=0;
		
		//Caso base: cuando el exponente vale 0, el resultado de cualquier potencia es 1.
		if (n==0) {
			
			res=1;
		//Multiplicamos a por la potencia de a elevado a n-1.
		} else if (n!=0) {
			
			res = a*potencia(a, n-1);
		}
		
		//Devolvemos el resultado.
		return res;
	}
	
	//Creamos una función estática con un parámetro de entrada de valor numérico.
	public static int serieFibonacci (int n) {
		
		int fibonacci=0;
		
		//Sabemos que para los valores de n=0 y n=1, el resultado de la serie es 1.
		//Por lo tanto, cuando sea n sea distinto la serie de Fibonacci es el resultado de la suma de los dos números anteriores.
		if (n!=0&&n!=1) {
			
			fibonacci=serieFibonacci(n-1)+serieFibonacci(n-2);
			
		//Caso base.
		} else if (n==0||n==1) {
			
			fibonacci=1;
		}
		
		//Devolvemos el resultado.
		return fibonacci;
	}
}
