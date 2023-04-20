package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Articulos;


public interface ArticulosDAO extends JpaRepository<Articulos, Long>{
	
	//Listar clientes or campo nombre
	public List<Articulos> findByNombre(String nombre);
	
}