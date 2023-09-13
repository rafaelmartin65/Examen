/**
 * 
 */
package com.examen.ejercicio4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 * Descripción: Crear una clase Libro, crear los objetos e introducirla en una estructura que nos permita 
 * 				ordenarla posteriormente por el atributo título.
 *
 */
public class Main {

	// Declaracion del ArrayList
	private static ArrayList<Libro> libros = new ArrayList<>();
	
	// Declaración de la objeto Scanner
	private static Scanner sc = new Scanner(System.in);
	  
	
	
	public static void main(String[] args) {
		// Bucle para mostrar menu y pedir opción por teclado
				while (true) {
					sc.useLocale(Locale.US);
					mostrarMenu();
					int opcion = sc.nextInt();
					sc.nextLine(); // consume el salto de linea

					switch (opcion) {
						case 1:  
							cargarLibro();
							break;
						case 2: 
							listarLibros();
							break;
						case 3:
							mayorPrecio();
							break;
						case 4: 
							disponiblesCategoria();
							break;
						case 5: 
							ordenarPorTitulo();
							break;
						case 6:
							System.out.println("Fin del programa!");
							sc.close();
							System.exit(0);
						default: 
							System.out.println("Opción no válida ingresa una nueva opción");
					}
				}
		
		
	}

	// MMostrar el menu por pantalla
	private static void mostrarMenu() {
		System.out.println("Menu de opciones, elige una opción: ");
		System.out.println("1. Cargar los datos almacenados en la tabla anterior ");
		System.out.println("2. Listar todos los elementos ");
		System.out.println("3. Muestra por pantalla el libro cuyo precio sea el mayor ");
		System.out.println("4. Dada una categoría, mostrar los libros disponbiles de esa categoría ");
		System.out.println("5. Ordenar los pedidos por el atributo título ");
		System.out.println("6. Salir ");
		
	}
	
	// Metodo para la carga de los libros
	public static void cargarLibro() {
		System.out.print("ISBN: ");
		String isbn = sc.nextLine();
		System.out.print("Título: ");
		String titulo = sc.nextLine();
		System.out.print("Autor: ");
		String autor = sc.nextLine();
		System.out.print("Categoría: ");
		String categoria = sc.nextLine();
		System.out.print("Año: ");
		int anyo = sc.nextInt();
		System.out.print("Precio: ");
		double precio = sc.nextDouble();
		
		System.out.println("despues");

		Libro libro = new Libro(isbn, titulo, autor, categoria, anyo, precio);
		libros.add(libro);

	}

	// // Listar los libros cargados
	public static void listarLibros() {
		System.out.println("Lista de libros");
		for (Libro libro : libros) {
			System.out.println(libro);
		}
	}

	// Calcular cual es el libro de mayor precio
	public static void mayorPrecio() {
		double maxPrecio = 0;
		Libro libroMasCaro = null;
		for (Libro libro : libros) {
			if (libro.getPrecio() > maxPrecio) {
				maxPrecio = libro.getPrecio();
				libroMasCaro = libro;
			}
		}
		if (libroMasCaro != null) {
			System.out.println("El libro más caro es: ");
			System.out.println(libroMasCaro);
		} else {
			System.out.println("No hay libros para mostrar");
		}

	}

	// Consulta libros segun categoria disponibles 
	public static void disponiblesCategoria() {
		System.out.println("Ingrese la categoria");
		String categoriaBuscada = sc.nextLine();
		System.out.println("Libro sen la categoria buscada: ");
		for (Libro libro : libros) {
			if (libro.getCategoria().equalsIgnoreCase(categoriaBuscada)) {
				System.out.println(libro);
			}
		}
	}

	// Ordenación del array según el título de los libros
	public static void ordenarPorTitulo() {
		System.out.println("ordenar");
		libros.sort(Comparator.comparing(Libro::getTitulo));
		System.out.println("Libros ordenados por título:");
		for (Libro libro : libros) {
			System.out.println(libro);

		}

	}
	
	

}
