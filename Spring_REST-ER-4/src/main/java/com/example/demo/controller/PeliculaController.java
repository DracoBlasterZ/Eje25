package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.*;
import com.example.demo.service.*;

@RestController // Rest controller
@RequestMapping("/api")
public class PeliculaController {

	// Implement service
	@Autowired
	PeliculaService peliculaService;

	@GetMapping("/peliculas")
	public List<Pelicula> listPeliculas() {
		return peliculaService.listPeliculas();
	}

	@GetMapping("/peliculas/{id}")
	public Pelicula peliculaById(@PathVariable(name = "id") Long id) {
		Pelicula peliculaxID = new Pelicula();

		peliculaxID = peliculaService.peliculaById(id);

		return peliculaxID;
	}

	@PostMapping("/peliculas")
	public Pelicula savePelicula(@RequestBody Pelicula pelicula) {
		return peliculaService.savePelicula(pelicula);
	}

	@PutMapping("/peliculas/{id}")
	public Pelicula updatePelicula(@PathVariable(name = "id") Long id, @RequestBody Pelicula pelicula) {
		Pelicula selectedPelicula = new Pelicula(id, pelicula.getNombre(), pelicula.getEdad_minima());
		Pelicula updatedPelicula = new Pelicula();

		updatedPelicula = peliculaService.updatePelicula(selectedPelicula);
		return updatedPelicula;
	}

	@DeleteMapping("/peliculas/{id}")
	public void deletePelicula(@PathVariable(name = "id") Long id) {
		peliculaService.deletePelicula(id);
	}

}