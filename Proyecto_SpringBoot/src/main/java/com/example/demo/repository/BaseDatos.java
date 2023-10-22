package com.example.demo.repository;


import java.util.ArrayList;
// import java.util.Iterator;
import java.util.Iterator;

import com.example.demo.bean.Libro;

public class BaseDatos {

	ArrayList<Libro> libros = new ArrayList<Libro>();
	public BaseDatos() {
		
		// Agregamos 18 libros con datos
		
        libros.add(new Libro(1, "El Gran Gatsby", "F. Scott Fitzgerald", "Scribner", "1925", "Ficción"));
        libros.add(new Libro(2, "Cien años de soledad", "Gabriel García Márquez", "Sudamericana", "1967", "Realismo mágico"));
        libros.add(new Libro(3, "1984", "George Orwell", "Secker & Warburg", "1949", "Ciencia ficción"));
        libros.add(new Libro(4, "Matar un ruiseñor", "Harper Lee", "J. B. Lippincott & Co.", "1960", "Novela"));
        libros.add(new Libro(5, "Don Quijote de la Mancha", "Miguel de Cervantes", "Juan de la Cuesta", "1605", "Novela clásica"));
        libros.add(new Libro(6, "En busca del tiempo perdido", "Marcel Proust", "Gallimard", "1913", "Novela modernista"));
        libros.add(new Libro(7, "Ulises", "James Joyce", "Sylvia Beach", "1922", "Novela experimental"));
        libros.add(new Libro(8, "Los juegos del hambre", "Suzanne Collins", "Scholastic", "2008", "Ciencia ficción"));
        libros.add(new Libro(9, "Harry Potter y la piedra filosofal", "J.K. Rowling", "Bloomsbury", "1997", "Fantasía"));
        libros.add(new Libro(10, "Orgullo y prejuicio", "Jane Austen", "T. Egerton", "1813", "Novela romántica"));
        libros.add(new Libro(11, "Moby-Dick", "Herman Melville", "Richard Bentley", "1851", "Aventuras"));
        libros.add(new Libro(12, "El señor de los anillos", "J.R.R. Tolkien", "Allen & Unwin", "1954", "Fantasía"));
        libros.add(new Libro(13, "La sombra del viento", "Carlos Ruiz Zafón", "Planeta", "2001", "Misterio"));
        libros.add(new Libro(14, "El amor en los tiempos del cólera", "Gabriel García Márquez", "Editorial La Oveja Negra", "1985", "Realismo mágico"));
        libros.add(new Libro(15, "Las aventuras de Sherlock Holmes", "Arthur Conan Doyle", "George Newnes", "1892", "Misterio"));
        libros.add(new Libro(16, "El código Da Vinci", "Dan Brown", "Doubleday", "2003", "Misterio"));
        libros.add(new Libro(17, "El retrato de Dorian Gray", "Oscar Wilde", "Lippincott's Monthly Magazine", "1890", "Novela gótica"));
        libros.add(new Libro(18, "Los hombres me explican cosas", "Rebecca Solnit", "Granta Books", "2014", "Ensayo feminista"));	
        }
	
	public ArrayList<Libro> getLibros() {
		return libros;
	}
	
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}


	public void inserta(Libro libro) {
		libros.add(libro);
		
	}
	public void modifica(Libro libro) {
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro li = it.next();
			if(li.getId()==libro.getId()) {
				li.setTitulo(libro.getTitulo());
				li.setAutor(libro.getAutor());
				li.setEditorial(libro.getEditorial());
				li.setFecha(libro.getFecha());
				li.setTematica(libro.getTematica());
				break;
			}
		}
	}
	public void borrar(int id) {
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro li = it.next();
			if(li.getId()==id) {
				it.remove();
				break;
			}
		}
	}

	public Libro getLibro(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}

