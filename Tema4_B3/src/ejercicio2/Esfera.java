package ejercicio2;

/*Crea una clase de nombre Esfera. Esta clase debe contener dos funciones estáticas que harán lo siguiente:

- La primera de las funciones calculará la superficie de la esfera, devolviendo el valor de la superficie, que tiene esta fórmula:
		Superficie = 4*PI*radio^2
		
- La segunda de las funciones calculará el volumen de la esfera, devolviendo el valor del volumen, que tiene la siguiente fórmula:
		Volumen=(4*PI/3)*radio^3
		
Define radio como una variable global estática de la clase Esfera.
*/

public class Esfera {
	
	//Haremos una variable global "radio" para ambas funciones.
	//Por lo tanto, debe ser declarada fuera de las funciones.
	//Las variables globales siempre son estáticas.
	static double radio;
	
	//Creamos una función estática para la superficie.
	//No tiene parámetros de entrada porque hemos declarado radio como variable global.
	public static double superficie () {
		
		double superficie=0;
		
		superficie= 4*Math.PI*Math.pow(radio, 2);//Equivale a 4*PI*radio^2
		
		return superficie;
	}
	
	//Creamos otra función estática para el volumen.
	public static double volumen () {
		
	}
	
	

}
