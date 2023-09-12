/**
 * 
 */
package com.examen.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Rafael Martín
 * Descripción: Crea una clase Alumno con atributos
 *
 */
public class Alumno {

	/**
	 * @param args
	 */
	
	// Declarar los atributos
	private String nombre;
	private String apellidos;
	private int edad;
	 

	
	
	//Declarar constructor
	public Alumno() {
		
	}

	//Declara constructor con parámetros
	public Alumno(String nombre, String apellidos, int edad) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	// Declara métodos getter y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Declarar el método toString
	@Override
	public String toString() {
		return "Datos del Alumno: \nNombre: " + nombre + " \nApellidos: " + apellidos + " \nEdad: " + edad;
	}

	
	
	/*public void crearAlumno(Alumno alumnos) {
		alumnos
		
	}*/
	
	/*public void mostrarAlumno() {
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println(alumnos.get(i));
		}
		
	}*/

}
