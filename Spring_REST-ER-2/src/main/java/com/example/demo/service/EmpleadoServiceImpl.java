package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmpleadoDAO;
import com.example.demo.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	//Utilizamos los metodos de la interface IEmpleadoDAO, es como si instaciaramos.
	@Autowired
	EmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado Empleado) {
		
		return iEmpleadoDAO.save(Empleado);
	}

	@Override
	public Empleado EmpleadoXID(String id) {
		
		return iEmpleadoDAO.findById(id).get();
	}
	

	@Override
	public Empleado actualizarEmpleado(Empleado Empleado) {
		
		return iEmpleadoDAO.save(Empleado);
	}

	@Override
	public void eliminarEmpleado(String id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}

	@Override
	public List<Empleado> listarEmpleadoNomnbre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}

