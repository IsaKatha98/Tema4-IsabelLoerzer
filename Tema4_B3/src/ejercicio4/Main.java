package ejercicio4;

import java.util.Scanner;

public class Main {
	
	/*Crea una clase denominada Operaciones, la cual va a contener una función no estática 
	 *por cada una de las operaciones básicas: suma, resta, multiplicación y división. Es decir, 
	 *4 funciones. Las variables con las que se van a realizar estas operaciones son globales no 
	 *estáticas. Es decir, estas funciones no recibirán ningún parámetro de entrada. Ten en cuenta 
	 *las características de estas funciones y la existencia de las variables globales para realizar 
	 *las pruebas desde el método main().*/
	
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
		//En este caso, no necesitamos parámetros de entrada, ya que son variables globales.
		System.out.println("Suma: "+objeto.suma());
		System.out.println("Resta: "+objeto.resta());
		System.out.println("Multiplicación: "+ objeto.mult());
		System.out.println("División: "+objeto.div());
				
		//Cerramos el escáner.
		sc.close();

	}

}
