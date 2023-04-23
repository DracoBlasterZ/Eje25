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
public class SalaController {

	// Implement service
	@Autowired
	SalaService salaService;

	@GetMapping("/salas")
	public List<Sala> listSalas() {
		return salaService.listSalas();
	}

	@GetMapping("/salas/{id}")
	public Sala salaById(@PathVariable(name = "id") Long id) {
		Sala salaById = new Sala();
		salaById = salaService.salaById(id);
		return salaById;
	}

	@PostMapping("/salas")
	public Sala saveSala(@RequestBody Sala sala) {
		return salaService.saveSala(sala);
	}

	@PutMapping("/salas/{id}")
	public Sala updateSala(@PathVariable(name = "id") Long id, @RequestBody Sala sala) {
		Sala sala_Selected = new Sala(id, sala.getNombre(), sala.getPelicula());
		Sala sala_Updated = new Sala();

		sala_Updated = salaService.updateSala(sala_Selected);

		return sala_Updated;
	}

	@DeleteMapping("/salas/{id}")
	public void deleteSala(@PathVariable(name = "id") Long id) {
		salaService.deleteSala(id);
	}

}