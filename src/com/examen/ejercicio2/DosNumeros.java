/**
 * 
 */
package com.examen.ejercicio2;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * Descripcion: Explicacion en l aque se lean dos numeros y realice estas acciones:
 * 				1.muestre numeros leidos
 * 				2.Realiza operaciones de suma, resta producto y division
 *				3.Comprobar que el divisor no sea 0
 *				4.Leer un array de 10 numeros enteros y mostrar contenido con los datos de cada alumno 
 *
 *
 */
public class DosNumeros {

	
	// Declara array de enteros
	
	static  int [] enteros = new int [10];
	
	// Inicializa 2 variables para almacenar los números solicitados
	private static int numero1, numero2;
	
	public static void main(String[] args) {
	
		// Declarar el objeto scanner para leer por teclado
		
		Scanner sc = new Scanner(System.in);
		
		// Solicita los dos número por teclado
		System.out.println("Introduce primer número: ");
		numero1 = sc.nextInt();
		
		System.out.println("Introduce segundo número: ");
		numero2 = sc.nextInt();
		
		
		// Muestra los números introducidos
		System.out.println("\nEstos son los números introducidos: ");
		mostrarNumero(numero1);
		mostrarNumero(numero2);
		
		// Ejecutar método para rellenar el Array con 10 números enteros aleatorios
		llenarArray();
		
		
		
		boolean verdadero = true;
		while(verdadero) {
			mostrarMenu();
			int opcion = sc.nextInt();
			
			switch (opcion) {
				case 1:
					System.out.println("\nLa suma de los dos número es: " + suma(numero1, numero2));
					break;
				
				case 2:
					System.out.println("La resta de los dos número introducidos es: " + resta(numero1,numero2));
					break;
					
				case 3:
					System.out.println("El producto de los dos número introducidos es: " + producto(numero1,numero2));
					break;
		
				case 4:
					// comprobar que el divisor no es cero
					if (numero2 == 0) {
						System.out.println("Error division por cero no es válida, elija otra opción");
					}else {
						System.out.println("La división de los dos número introducidos es: " + division((double)numero1,(double)numero2));
					}
					break;
					
				case 5:
					System.out.println("Este es el Array de 10 números");
					mostrarArray();
					break;
					
				case 6:
					System.out.println("Fin del programa");
					verdadero = false;
					break;
				default:
					System.out.println("Introduzca una opción válida");
			}
		};
		
		
		
	}
	
	//Declarar metodo mostrar menu
	
	private static void mostrarMenu() {
		// Muestra por pantalla un menu
		System.out.println("\nElije una opcion:");
		System.out.println("  	1. sumar los números");
		System.out.println("  	2. restar los números");
		System.out.println("	3. multiplicar los números");
		System.out.println("	4. dividir los números");
		System.out.println("	5. Leer array del 10 numeros");
		System.out.println("	6. Salir");
		
		
	}


	// Declarar el método mostrar número
	private static void mostrarNumero(int num) {
		System.out.print(num + " ");
		
	}


	// Declarar el método suma
	public static int suma(int x, int y) {
		return x + y;
	}
	
	// Declarar el método resta
	public static int resta(int x, int y) {
		return x - y;
	}
	
	// Declarar el método producto
	public static int producto(int x, int y) {
		return x * y;
	}
	
	// Declarar el método division
	public static double division(double x, double y) {
		
		return x / y;
	}
	
	// Declarar el método llenarArray
	public static void llenarArray() {
		
		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = i + (int)(Math.random()*100);
		}
		
		
	}
	
	
	// Mostrar el contenido del array
	public static void mostrarArray() {
			
		for (int numero : enteros) {
			System.out.print(numero + " ");
		}
		
		
		
	}

}
