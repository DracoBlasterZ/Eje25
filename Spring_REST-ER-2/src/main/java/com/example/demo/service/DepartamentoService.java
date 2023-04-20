package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Departamento;

public interface DepartamentoService {

	//Metodos del CRUD
	public List<Departamento> listarDepartamentos(); //Listar All 
	
	public Departamento guardarDepartamento(Departamento Departamento);	//Guarda un Departamento CREATE
	
	public Departamento DepartamentoXID(Long id); //Leer datos de un Departamento READ
	
	public List<Departamento> listarDepartamentoNomnbre(String nombre);//Listar Departamentos por campo nombre
	
	public Departamento actualizarDepartamento(Departamento Departamento); //Actualiza datos del Departamento UPDATE
	
	public void eliminarDepartamento(Long id);// Elimina el Departamento DELETE
	
	
}
