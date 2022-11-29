package ejercicio1;

public class Numeros {
	
	//Establecemos una función no estática para saber si un número es primo o no.
	boolean esPrimo (int n) {
			
		boolean esPrimo=true;
			
		for (int i=2; i<=n/2; i++) {
			
			if (n%i==0) {
					
				esPrimo=false;
				break;
			}
				
		
		}
			
		return esPrimo;
	}
	
	//Establecemos otra función no estática para saber si un número es capícua o no.
	boolean esCapicua (int n) {
		
		boolean esCapicua= true;
		int aux;
		int unidad=0;
		int inverso=0;
		
		//Establecemos una condición que imprima que cualquier número menor 10 es capícua.
		if (n<10) {
					
			esCapicua= true;
					
		} else if (n>=10) {
					
			/*Ahora, hallamos el inverso de num. Utilizamos la variable aux para no perder
			 *el valor original de num.*/
						
			aux = n;
						
			//Abrimos un bucle que se repetirá mienstras aux sea distinto de 0.
				    
			while (aux!=0) {
				
				//Hacemos el módulo de auxiliar entre 10 y lo guardamos en la variable unidad.Esto guarda la última unidad de num/aux.
				
				unidad = aux % 10;
				        	
				//Se lo sumamos a inverso (valor actual=0) por diez más la unidad.
				inverso = inverso * 10 + unidad;
				            
				//Le quitamos la última cifra a aux.
				 aux = aux / 10;
			
			}
			
			//Establecemos una condición en el que se devuelva la variable esCapicua con su valor correspondiente.
			 
	        if (n == inverso){
	            
	        	esCapicua= true;
	            
	        } else {
	        	
	           esCapicua=false;
	           
	        }
       
		}

		//Devolvemos la variable.
		return esCapicua;
	}
		
	

}
