package ejercicio3;

import java.util.Scanner;

public class Main {
	
	/*Añade las funciones que creaste en el ejercicio 5 del boletín SOBRECARGA DE FUNCIONES, 
	 * añádelas a una única clase denominada NumerosAleatorios. Las funciones de esta clase 
	 * deben ser estáticas. Desde el método main(), que estará definido en otra clase distinta, 
	 * se pedirán los valores correspondientes para probar estas funciones.
	 * */

	public static void main(String[] args) {
		
		//Declaramos las variables a pedir al usuario.
		
		int num1;
		int num2;
		int num3;
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
								
		Scanner sc= new Scanner (System.in); 
								
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
								
		System.out.print("Introduzca un número y pulse Intro: ");
		num1= sc.nextInt();
		System.out.print("Introduzca otro número y pulse Intro: ");
		num2=sc.nextInt();
		System.out.print("Introduzca otro número y pulse Intro: ");
		num3=sc.nextInt();
		
		//Al ser funciones estáticas no necesitamos crear un objeto, podemos llamarlas directamente desde la clase. Imprimimos.
	
		System.out.println("Función 1: ");
		NumerosAleatorios.numerosAleatorios(num1);
		
		System.out.println("Función 2: ");
		NumerosAleatorios.numerosAleatorios (num1, num2);
		
		System.out.println("Función 3: ");
		NumerosAleatorios.numerosAleatorios (num1, num2, num3);
			
		//Cerramos el escáner.
		sc.close();

	}

}
