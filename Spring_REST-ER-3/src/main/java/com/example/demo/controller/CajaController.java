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
public class CajaController {

	// Implement service
	@Autowired
	CajaService cajaService;

	@GetMapping("/cajas")
	public List<Caja> listCajas() {
		return cajaService.listCajas();
	}

	@GetMapping("/cajas/{ref_num}")
	public Caja cajaById(@PathVariable(name = "ref_num") String ref_num) {
		Caja cajaById = new Caja();
		cajaById = cajaService.cajaById(ref_num);
		return cajaById;
	}

	@PostMapping("/cajas")
	public Caja saveCaja(@RequestBody Caja caja) {
		return cajaService.saveCaja(caja);
	}

	@PutMapping("/cajas/{ref_num}")
	public Caja updateCaja(@PathVariable(name = "ref_num") String ref_num, @RequestBody Caja caja) {
		Caja caja_Selected = new Caja(ref_num, caja.getContenido(), caja.getValor(), caja.getAlmacen());
		Caja caja_Updated = new Caja();

		caja_Updated = cajaService.updateCaja(caja_Selected);

		return caja_Updated;
	}

	@DeleteMapping("/cajas/{ref_num}")
	public void deleteCaja(@PathVariable(name = "ref_num") String ref_num) {
		cajaService.deleteCaja(ref_num);
	}

}