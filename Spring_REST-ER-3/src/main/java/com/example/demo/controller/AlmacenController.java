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
public class AlmacenController {

	// Implement service
	@Autowired
	AlmacenService almacenService;

	@GetMapping("/almacenes")
	public List<Almacen> listAlmacenes() {
		return almacenService.listAlmacenes();
	}

	@GetMapping("/almacenes/{id}")
	public Almacen almacenById(@PathVariable(name = "id") Long id) {
		Almacen almacenxID = new Almacen();

		almacenxID = almacenService.almacenById(id);

		return almacenxID;
	}

	@PostMapping("/almacenes")
	public Almacen saveAlmacen(@RequestBody Almacen almacen) {
		return almacenService.saveAlmacen(almacen);
	}

	@PutMapping("/almacenes/{id}")
	public Almacen updateAlmacen(@PathVariable(name = "id") Long id, @RequestBody Almacen almacen) {
		Almacen selectedAlmacen = new Almacen(id, almacen.getLugar(), almacen.getCapacidad());
		Almacen updatedAlmacen = new Almacen();

		updatedAlmacen = almacenService.updateAlmacen(selectedAlmacen);
		return updatedAlmacen;
	}

	@DeleteMapping("/almacenes/{id}")
	public void deleteAlmacen(@PathVariable(name = "id") Long id) {
		almacenService.deleteAlmacen(id);
	}

}
