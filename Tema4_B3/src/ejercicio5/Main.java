package ejercicio5;

import java.util.Scanner;

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
public class Main {

	public static void main(String[] args) {
		
		//Declaramos variables.
		
		int num; //Variable númerica que introduce el usuario.
		int num2;
						
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
								
		Scanner sc= new Scanner (System.in); 
								
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
								
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
		System.out.print("Introduzca otro número y pulse Intro: ");
		num2=sc.nextInt();
		
				
		//Al ser estáticas, podemos llamar a las funciones directamente.
		
		System.out.println("La sumatoria de "+num+" es: "+FuncionesRecursivas.sumatorio (num));
		System.out.println("La potencia de "+num+" y "+num2+" es: "+ FuncionesRecursivas.potencia (num, num2));
		System.out.println("La serie Fibonacci de "+num+" es: "+FuncionesRecursivas.serieFibonacci(num));
				
		//Cerramos el escáner.
		sc.close();

	}

}
