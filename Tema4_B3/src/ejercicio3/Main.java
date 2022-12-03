package ejercicio3;

import java.util.Scanner;

import ejercicio1.Numeros;

public class Main {
	
	//Declaramos variables globales no estáticas.
	
	double numA; //Variable númerica que introduce el usuario.
	double numB;//Segunda variable introducida por el usuario.

	public static void main(String[] args) {
			
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
								
		Scanner sc= new Scanner (System.in); 
		
		//Creamos un objeto para poder guardar las variables no estáticas.
		Operaciones o= new Operaciones();
								
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
								
		System.out.print("Introduzca un número y pulse Intro: ");
		o.numA=sc.nextDouble();
		System.out.print("Introduzca otro número y pulse Intro: ");
		o.numB=sc.nextDouble();
		
		//Creamos un objeto nuevo, porque son funciones no estáticas.
		Operaciones objeto= new Operaciones();
				
		//Con ese objeto, llamamos a las funciones. Lo podemos hacer directamente en el sysout, para que se imprima el resultado.
				
		System.out.println("Suma: "+objeto.suma(o.numA, o.numB));
		System.out.println("Resta: "+objeto.resta(variables.a, variables.b));
		System.out.println("Multiplicación: "+ objeto.mult(numA, numB));
				
		//Cerramos el escáner.
		sc.close();

	}

}
