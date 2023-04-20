package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Fabricantes;


public interface FabricantesDAO extends JpaRepository<Fabricantes, Long>{
	
	//Listar clientes or campo nombre
	public List<Fabricantes> findByNombre(String nombre);
	
}