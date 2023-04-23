package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.*;
import com.example.demo.dao.*;

@Service // Assign Service
public class CajaService {

	// Load DAO
	@Autowired
	CajaDAO cajaDAO;

	// CRUD functions
	public List<Caja> listCajas() {
		return cajaDAO.findAll();
	}

	public Caja saveCaja(Caja caja) {
		return cajaDAO.save(caja);
	}

	public Caja cajaById(String ref_num) {
		return cajaDAO.findById(ref_num).get();
	}

	public Caja updateCaja(Caja caja) {
		return cajaDAO.save(caja);
	}

	public void deleteCaja(String ref_num) {
		cajaDAO.deleteById(ref_num);
	}

}