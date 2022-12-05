package ejercicio4;

/*Crea una clase denominada Operaciones, la cual va a contener una función no estática 
 *por cada una de las operaciones básicas: suma, resta, multiplicación y división. Es decir, 
 *4 funciones. Las variables con las que se van a realizar estas operaciones son globales no 
 *estáticas. Es decir, estas funciones no recibirán ningún parámetro de entrada. Ten en cuenta 
 *las características de estas funciones y la existencia de las variables globales para realizar 
 *las pruebas desde el método main().*/

public class Operaciones {
	
	//Declaramos variables globales no estáticas.
	
	double A; //Variable númerica que introduce el usuario.
	double B;//Segunda variable introducida por el usuario.

		
	//Establecemos las funciones no estáticas sin parámetros.
	public double suma () {
		
		double suma;
		
		suma= A+B;
		
		return suma;
	}
	
	
	public double resta () {
		
		double resta;
		
		resta=A-B;
		
		return resta;
	}
	
	public double mult () {
		
		double mult;
		
		mult=A*B;
		
		return mult;
	}
	
	//Precondición B!=0
	public double div () {
		
		double div=0;
		
		if (B!=0) {
		
			div= A/B;
		}
		
		return div;
	}

}
