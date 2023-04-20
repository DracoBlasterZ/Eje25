package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DepartamentoDAO;
import com.example.demo.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{
	
	//Utilizamos los metodos de la interface IDepartamentoDAO, es como si instaciaramos.
	@Autowired
	DepartamentoDAO iDepartamentoDAO;
	
	@Override
	public List<Departamento> listarDepartamentos() {
		
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento Departamento) {
		
		return iDepartamentoDAO.save(Departamento);
	}

	@Override
	public Departamento DepartamentoXID(Long id) {
		
		return iDepartamentoDAO.findById(id).get();
	}
	

	@Override
	public Departamento actualizarDepartamento(Departamento Departamento) {
		
		return iDepartamentoDAO.save(Departamento);
	}

	@Override
	public void eliminarDepartamento(Long id) {
		
		iDepartamentoDAO.deleteById(id);
		
	}


	@Override
	public List<Departamento> listarDepartamentoNomnbre(String nombre) {
		
		return null;
	}

}


