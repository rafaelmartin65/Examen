/**
 * 
 */
package com.examen.ejercicio3;



/**
 * @author Rafael Martin
 * Descripción: Crear un arreglo de 10 números enteros y mostrar cual es el mayor y en que posición se encuentra
 *
 */
public class Arreglo {

	/**
	 * @param args
	 */
	
	
	
	
	public static void main(String[] args) {
		
		// Declara un array
		int [] a = {1,524,423,825,1524,324,899,975,775,657};
		
		// Introducir el contenido del array
		
			int mayor = 0, posicion = 0, temp = 0;
		
			int i = 0;
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
			
			System.out.println("El mayor número es: " + mayor + " en la posición " + posicion);
			
		}
		

	

}
