/**
 * 
 */
package com.examen.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Rafael Martín
 * Descripción: Calse Alumno en Java
 *
 */
public class Main {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		
		String nombre;
		String apellidos;
		int edad;
		
		
		// Declarar objeto Alumno
		Alumno alumno = new Alumno();
		
		ArrayList<Alumno> alumnos = new ArrayList<>();
		
		// Creara un Alumno
		alumno.setNombre("Rafael");
		alumno.setApellidos("Martin");
		alumno.setEdad(58);
		
		alumnos.add(alumno);
		
		System.out.println(alumnos.toString());
				
		
		
				
				
		
		
		/*Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del alumno: ");
		nombre = teclado.nextLine();
		alumno.setNombre(nombre);
		
		System.out.println("Introduzca los apellidos del alumno: ");
		apellidos = teclado.nextLine();
		alumno.setApellidos(apellidos);
		
		System.out.println("Introduzca la edad del alumno: ");
		edad = teclado.nextInt();
		alumno.setEdad(edad);
		
		alumno.
		
		alumnos.add(alumno);
		
		
		// Mostrar Alumnno por pantalla
				alumno.mostrarAlumno();
		
		
		// añadir alumno al string
		
		System.out.println(alumno.toString());
		teclado.reset();*/

	}
	
	

}
