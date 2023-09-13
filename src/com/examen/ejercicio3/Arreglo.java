/**
 * 
 */
package com.examen.ejercicio3;



/**
 * @author Rafael Martin
 * 
 * Descripción: Crear un arreglo de 10 números enteros y mostrar cual es el mayor y en que posición se encuentra.
 *
 */
public class Arreglo {

	
	public static void main(String[] args) {
		
		// Declara el array de 10 números
		int [] a = {1,524,423,825,1524,324,899,975,775,657};
		
		
		// Mostrar el contenido del array
		System.out.println("El contenido del array es: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		
		
		// Declarar variables
		
			int mayor = 0, posicion = 0, temp = 0;
		
			int i = 0;
			// bulce for para comprobar el mayor de los números en el array
			for (int j = i + 1; j < a.length; j++) {
				
				if (a[i] > a[j]) {	
					mayor = a[i];
				}else{
					mayor = a[j];
					posicion = j;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
				
			}
			
			// Mostrar por pantalla cual es el mayor número y en que posición se encuentra dentro del array
			System.out.println("\n\nEl mayor número es: " + mayor + " en la posición " + posicion);
			
		}
		

	

}
