package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Articulos;

public interface ArticulosService {

	//Metodos del CRUD
	public List<Articulos> listarArticuloss(); //Listar All 
	
	public Articulos guardarArticulos(Articulos Articulos);	//Guarda un Articulos CREATE
	
	public Articulos ArticulosXID(Long id); //Leer datos de un Articulos READ
	
	public List<Articulos> listarArticulosNomnbre(String nombre);//Listar Articuloss por campo nombre
	
	public Articulos actualizarArticulos(Articulos Articulos); //Actualiza datos del Articulos UPDATE
	
	public void eliminarArticulos(Long id);// Elimina el Articulos DELETE
	
	
}