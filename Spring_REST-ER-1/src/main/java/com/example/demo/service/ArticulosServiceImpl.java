package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ArticulosDAO;
import com.example.demo.dto.Articulos;

@Service
public class ArticulosServiceImpl implements ArticulosService{
	
	//Utilizamos los metodos de la interface IArticulosDAO, es como si instaciaramos.
	@Autowired
	ArticulosDAO iArticulosDAO;
	
	@Override
	public List<Articulos> listarArticuloss() {
		
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulos guardarArticulos(Articulos Articulos) {
		
		return iArticulosDAO.save(Articulos);
	}

	@Override
	public Articulos ArticulosXID(Long id) {
		
		return iArticulosDAO.findById(id).get();
	}
	

	@Override
	public Articulos actualizarArticulos(Articulos Articulos) {
		
		return iArticulosDAO.save(Articulos);
	}

	@Override
	public void eliminarArticulos(Long id) {
		
		iArticulosDAO.deleteById(id);
		
	}


	@Override
	public List<Articulos> listarArticulosNomnbre(String nombre) {
		
		return iArticulosDAO.findByNombre(nombre);
	}

}

