package ejercicio5;

import java.util.Scanner;

import ejercicio1.Numeros;

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
