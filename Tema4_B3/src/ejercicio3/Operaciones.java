package ejercicio3;

/*Crea una clase denominada Operaciones, la cual va a contener una función no estática 
 *por cada una de las operaciones básicas: suma, resta, multiplicación y división. Es decir, 
 *4 funciones. Las variables con las que se van a realizar estas operaciones son globales no 
 *estáticas. Es decir, estas funciones no recibirán ningún parámetro de entrada. Ten en cuenta 
 *las características de estas funciones y la existencia de las variables globales para realizar 
 *las pruebas desde el método main().*/

public class Operaciones {
	
		
	//Establecemos las funciones no estáticas sin parámetros.
	public double suma () {
		
		double suma;
		
		suma= a+b;
		
		return suma;
	}
	
	
	public double resta () {
		
		double resta;
		
		resta=a-b;
		
		return resta;
	}
	
	public double mult () {
		
		double mult;
		
		mult=a*b;
		
		return mult;
	}
	
	//Precondición b!=0
	public double div () {
		
		double div;
		
		div= a/b;
		
		return div;
	}

}