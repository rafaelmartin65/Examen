/**
 * 
 */
package com.examen.ejercicio4;

import java.util.ArrayList;

/**
 * @author Alumno
 *
 */
public class Main {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// declaración objeto
		
		Libro libro = new Libro();
		
		ArrayList<Libro> datos = new ArrayList<>();
		
		libro.setIsbn("84-121-2310-1");
		libro.setTitulo("El tránsito terreno");
		libro.setAutor("Juan Luis Placencia");
		libro.setCategoria("Novela");
		libro.setAnyo(1995);
		libro.setPrecio(23.45);
		
		
		datos.add(libro);
		
		System.out.println(datos.toString());
		
		
		

	}

}
