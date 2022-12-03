package ejercicio4;

import java.util.Scanner;

import ejercicio1.Numeros;

public class Main {
	
	public static void main(String[] args) {
			
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
								
		Scanner sc= new Scanner (System.in); 
		
		//Creamos un objeto de la clase Operaciones, para poder llamar a las variables y funciones de dicha clase.
		Operaciones objeto= new Operaciones();
		
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
								
		System.out.print("Introduzca un número y pulse Intro: ");
		objeto.A=sc.nextDouble();
		System.out.print("Introduzca otro número y pulse Intro: ");
		objeto.B=sc.nextDouble();
				
		//Con ese objeto, llamamos a las funciones. Lo podemos hacer directamente en el sysout, para que se imprima el resultado.
				
		System.out.println("Suma: "+objeto.suma());
		System.out.println("Resta: "+objeto.resta());
		System.out.println("Multiplicación: "+ objeto.mult());
		System.out.println("División: "+objeto.div());
				
		//Cerramos el escáner.
		sc.close();

	}

}
