package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Creamos un escáner para poder leer los datos que introduzca el usuario por la consola. 
		
		Scanner sc= new Scanner (System.in);
				
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable radio, que se encuentra en otra clase..
				
		System.out.print("Introduzca el radio de la esfera (puede tener decimales) y pulse Intro: ");
		Esfera.radio=sc.nextDouble();
				
		//Invocamos las funciones; al ser estáticas, no hace falta crear un objeto,
		
		System.out.println("La superficie de la esfera es de: "+String.format("%.2f", Esfera.superficie()));
		System.out.println("El volumen de la esfera es de: "+ String.format("%.2f", Esfera.volumen()));
		
		//Cerramos el escáner.
		sc.close();
	}

}
