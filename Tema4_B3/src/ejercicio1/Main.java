package ejercicio1;

import java.util.Scanner;

public class Main {
	
	/*Crea una clase de nombre Numeros. Esta clase debe contener las siguientes dos funciones no estáticas:

-	boolean esPrimo(int numero): Esta función devuelve true si el número introducido 
	por parámetro es primo y false en caso contrario.

- 	boolean esCapicua(int numero): Esta función devuelve true si el número introducido 
	es capicúa y false en caso contrario.*/

	public static void main(String[] args) {
		
		//Declaramos variables.
		
		int num; //Variable númerica que introduce el usuario.
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
						
		Scanner sc= new Scanner (System.in); 
						
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
						
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
		
		//Creamos un objeto nuevo, porque son funciones no estáticas.
		Numeros objeto= new Numeros();
		
		//Con ese objeto, llamamos a las funciones. Lo podemos hacer directamente en el sysout, para que se imprima el resultado.
		
		System.out.println(objeto.esPrimo(num));
		System.out.println(objeto.esCapicua(num));
		
		//Cerramos el escáner.
		sc.close();

	}

}
