package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Fabricantes;

public interface FabricantesService {

	//Metodos del CRUD
	public List<Fabricantes> listarFabricantess(); //Listar All 
	
	public Fabricantes guardarFabricantes(Fabricantes Fabricantes);	//Guarda un Fabricantes CREATE
	
	public Fabricantes FabricantesXID(Long id); //Leer datos de un Fabricantes READ
	
	public List<Fabricantes> listarFabricantesNomnbre(String nombre);//Listar Fabricantess por campo nombre
	
	public Fabricantes actualizarFabricantes(Fabricantes Fabricantes); //Actualiza datos del Fabricantes UPDATE
	
	public void eliminarFabricantes(Long id);// Elimina el Fabricantes DELETE
	
	
}