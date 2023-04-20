package com.example.demo.controllers;

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
import com.example.demo.dto.Fabricantes;
import com.example.demo.service.FabricantesServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricantesControler {
	
	@Autowired
	FabricantesServiceImpl FabricantesServideImpl;
	
	@GetMapping("/Fabricantess")
	public List<Fabricantes> listarFabricantess(){
		return FabricantesServideImpl.listarFabricantess();
	}
	
	//listar Fabricantess por campo nombre
	@GetMapping("/Fabricantess/nombre/{nombre}")
	public List<Fabricantes> listarFabricantesNombre(@PathVariable(name="nombre") String nombre) {
	    return FabricantesServideImpl.listarFabricantesNomnbre(nombre);
	}
	
	
	@PostMapping("/Fabricantess")
	public Fabricantes salvarFabricantes(@RequestBody Fabricantes Fabricantes) {
		
		return FabricantesServideImpl.guardarFabricantes(Fabricantes);
	}
	
	
	@GetMapping("/Fabricantess/{id}")
	public Fabricantes FabricantesXID(@PathVariable(name="id") Long id) {
		
		Fabricantes Fabricantes_xid= new Fabricantes();
		
		Fabricantes_xid=FabricantesServideImpl.FabricantesXID(id);
		
		System.out.println("Fabricantes XID: "+Fabricantes_xid);
		
		return Fabricantes_xid;
	}
	
	@PutMapping("/Fabricantess/{id}")
	public Fabricantes actualizarFabricantes(@PathVariable(name="id")Long id,@RequestBody Fabricantes Fabricantes) {
		
		Fabricantes Fabricantes_seleccionado= new Fabricantes();
		Fabricantes Fabricantes_actualizado= new Fabricantes();
		
		Fabricantes_seleccionado= FabricantesServideImpl.FabricantesXID(id);
		
		Fabricantes_seleccionado.setNombre(Fabricantes.getNombre());

		
		Fabricantes_actualizado = FabricantesServideImpl.actualizarFabricantes(Fabricantes_seleccionado);
		
		System.out.println("El Fabricantes actualizado es: "+ Fabricantes_actualizado);
		
		return Fabricantes_actualizado;
	}
	
	@DeleteMapping("/Fabricantess/{id}")
	public void eleiminarFabricantes(@PathVariable(name="id")Long id) {
		FabricantesServideImpl.eliminarFabricantes(id);
	}
	
	
}
