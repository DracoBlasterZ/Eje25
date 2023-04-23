package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.*;
import com.example.demo.dto.*;

@Service // Assign Service
public class AlmacenService {

	// Load DAO
	@Autowired
	AlmacenDAO almacenDAO;

	// CRUD functions
	public List<Almacen> listAlmacenes() {
		return almacenDAO.findAll();
	}

	public Almacen saveAlmacen(Almacen almacen) {
		return almacenDAO.save(almacen);
	}

	public Almacen almacenById(Long id) {
		return almacenDAO.findById(id).get();
	}

	public Almacen updateAlmacen(Almacen almacen) {
		return almacenDAO.save(almacen);
	}

	public void deleteAlmacen(Long id) {
		almacenDAO.deleteById(id);
	}

}