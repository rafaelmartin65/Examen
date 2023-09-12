/**
 * 
 */
package com.examen.ejercicio4;

/**
 * @author Alumno
 *
 */
public class Libro {
		
	// Declaración atributos
	private String isbn;
	private String titulo;
	private String autor;
	private String categoria;
	private int anyo;
	private double precio;
	
		
	// declaración constructores
	
	public Libro() {
		
	}
	
	public Libro(String isbn, String titulo, String autor, String categoria, int anyo, double precio) {
		
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.anyo = anyo;
		this.precio = precio;
	}

	// Declaración Getters y Setters
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", categoria=" + categoria
				+ ", anyo=" + anyo + ", precio=" + precio + "]";
	}
	
	// Declaración método toString
	
	
	
	
	
	
	
	
	

}
