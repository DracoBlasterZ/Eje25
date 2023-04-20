package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Empleado;

public interface EmpleadoService {

	//Metodos del CRUD
	public List<Empleado> listarEmpleados(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado empleado);	//Guarda un Empleado CREATE
	
	public Empleado EmpleadoXID(String id); //Leer datos de un Empleado READ
	
	public List<Empleado> listarEmpleadoNomnbre(String nombre);//Listar Empleados por campo nombre
	
	public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del empleado UPDATE
	
	public void eliminarEmpleado(String id);// Elimina el empleado DELETE
	
	
}
