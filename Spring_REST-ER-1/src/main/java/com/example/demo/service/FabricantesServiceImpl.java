package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FabricantesDAO;
import com.example.demo.dto.Fabricantes;

@Service
public class FabricantesServiceImpl implements FabricantesService{
	
	//Utilizamos los metodos de la interface IFabricantesDAO, es como si instaciaramos.
	@Autowired
	FabricantesDAO iFabricantesDAO;
	
	@Override
	public List<Fabricantes> listarFabricantess() {
		
		return iFabricantesDAO.findAll();
	}

	@Override
	public Fabricantes guardarFabricantes(Fabricantes Fabricantes) {
		
		return iFabricantesDAO.save(Fabricantes);
	}

	@Override
	public Fabricantes FabricantesXID(Long id) {
		
		return iFabricantesDAO.findById(id).get();
	}
	

	@Override
	public Fabricantes actualizarFabricantes(Fabricantes Fabricantes) {
		
		return iFabricantesDAO.save(Fabricantes);
	}

	@Override
	public void eliminarFabricantes(Long id) {
		
		iFabricantesDAO.deleteById(id);
		
	}


	@Override
	public List<Fabricantes> listarFabricantesNomnbre(String nombre) {
		
		return iFabricantesDAO.findByNombre(nombre);
	}

}

