package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.Libro;

public interface BaseDatos3 extends JpaRepository<Libro, Integer>{
	/*	public void inserta(Libro libro); // save
	public void borrar(int id); // deleteById
	public void modifica(Libro libro); // save
	public Libro getLibro(int id); // findbyId
	public ArrayList<Libro> getLibros(); // find All
	public boolean compruebaUsuario(String usuario, String password); // No


	 * 
	 */
}
