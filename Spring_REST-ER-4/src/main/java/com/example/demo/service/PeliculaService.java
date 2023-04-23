package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.*;
import com.example.demo.dto.*;

@Service // Assign service
public class PeliculaService {

	// Load DAO
	@Autowired
	PeliculaDAO peliculaDAO;

	// CRUD functions
	public List<Pelicula> listPeliculas() {
		return peliculaDAO.findAll();
	}

	public Pelicula savePelicula(Pelicula pelicula) {
		return peliculaDAO.save(pelicula);
	}

	public Pelicula peliculaById(Long id) {
		return peliculaDAO.findById(id).get();
	}

	public Pelicula updatePelicula(Pelicula pelicula) {
		return peliculaDAO.save(pelicula);
	}

	public void deletePelicula(Long id) {
		peliculaDAO.deleteById(id);
	}

}
